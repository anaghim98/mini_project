configfile :'config.yaml'
print(config)

import pandas as pd

rule filter_data:
    input : 'data.csv'
    params :
        pval=config['Thresholds']['pvalue']
    output :'output.csv'
    run :
        data = pd.read_csv(input[0])
        data = data.loc[data['pvalue']<params.pval, :]
        data.to_csv(output[0], index=False)