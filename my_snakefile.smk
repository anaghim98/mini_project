rule hello:
    output: '{prefix}.tsv'
    shell:
        'echo -e "hello\tworld" > {output}'

        