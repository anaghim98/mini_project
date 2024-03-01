

import pandas as pd 

rule hello:
    output : '{prefix}.txt'
    shell:
        '''
            echo hello world > {output}
        '''

rule world:
    input: '{prefix}.txt'
    output : '{prefix}.second.csv'
    shell:
        '''
        cat {input} > {output}
        echo This is the second line >> {output}
        '''

rule bello:
    input: '{prefix}.txt'
    output: '{prefix}.bello.tsv'
    run:
        data = pd.read_csv(input[0], header = None)
        data.iloc[0,0]=1
        data.to_csv(output[0], sep = '\t')