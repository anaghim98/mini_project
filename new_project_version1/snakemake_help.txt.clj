snakemake --help
usage: snakemake [-h] [--dry-run] [--profile PROFILE]
                 [--workflow-profile WORKFLOW_PROFILE] [--cache [RULE ...]]
                 [--snakefile FILE] [--cores N] [--jobs N] [--local-cores N]
                 [--resources NAME=INT [NAME=INT ...]]
                 [--set-threads RULE=THREADS [RULE=THREADS ...]]
                 [--max-threads MAX_THREADS]
                 [--set-resources RULE:RESOURCE=VALUE [RULE:RESOURCE=VALUE ...]]
                 [--set-scatter NAME=SCATTERITEMS [NAME=SCATTERITEMS ...]]
                 [--set-resource-scopes RESOURCE=[global|local]
                 [RESOURCE=[global|local] ...]]
                 [--default-resources [NAME=INT ...]]
                 [--preemptible-rules [PREEMPTIBLE_RULES ...]]
                 [--preemptible-retries PREEMPTIBLE_RETRIES]
                 [--config [KEY=VALUE ...]] [--configfile FILE [FILE ...]]
                 [--envvars VARNAME [VARNAME ...]] [--directory DIR] [--touch]
                 [--keep-going]
                 [--rerun-triggers {code,input,mtime,params,software-env} [{code,input,mtime,params,software-env} ...]]
                 [--force] [--executor {local,dryrun,touch}] [--forceall]
                 [--forcerun [TARGET ...]] [--prioritize TARGET [TARGET ...]]
                 [--batch RULE=BATCH/BATCHES] [--until TARGET [TARGET ...]]
                 [--omit-from TARGET [TARGET ...]] [--rerun-incomplete]
                 [--shadow-prefix DIR] [--scheduler [{ilp,greedy}]]
                 [--wms-monitor [WMS_MONITOR]]
                 [--wms-monitor-arg [NAME=VALUE ...]]
                 [--scheduler-ilp-solver {GLPK_CMD,PULP_CBC_CMD,COIN_CMD}]
                 [--scheduler-solver-path SCHEDULER_SOLVER_PATH]
                 [--conda-base-path CONDA_BASE_PATH] [--no-subworkflows]
                 [--precommand PRECOMMAND] [--groups GROUPS [GROUPS ...]]
                 [--group-components GROUP_COMPONENTS [GROUP_COMPONENTS ...]]
                 [--report [FILE]] [--report-stylesheet CSSFILE]
                 [--draft-notebook TARGET] [--edit-notebook TARGET]
                 [--notebook-listen IP:PORT] [--lint [{text,json}]]
                 [--generate-unit-tests [TESTPATH]] [--containerize]
                 [--export-cwl FILE] [--list-rules] [--list-target-rules]
                 [--dag] [--rulegraph] [--filegraph] [--d3dag] [--summary]
                 [--detailed-summary] [--archive FILE]
                 [--cleanup-metadata FILE [FILE ...]] [--cleanup-shadow]
                 [--skip-script-cleanup] [--unlock]
                 [--list-changes {params,code,input}] [--list-input-changes]
                 [--list-params-changes] [--list-untracked]
                 [--delete-all-output | --delete-temp-output]
                 [--keep-incomplete] [--drop-metadata]
                 [--deploy-sources QUERY CHECKSUM] [--version]
                 [--printshellcmds] [--debug-dag] [--nocolor]
                 [--quiet [{all,progress,rules} ...]] [--print-compilation]
                 [--verbose] [--force-use-threads] [--allow-ambiguity]
                 [--nolock] [--ignore-incomplete]
                 [--max-inventory-time SECONDS] [--latency-wait SECONDS]
                 [--wait-for-files [FILE ...]] [--wait-for-files-file FILE]
                 [--queue-input-wait-time SECONDS] [--notemp] [--all-temp]
                 [--unneeded-temp-files FILE [FILE ...]]
                 [--keep-storage-local-copies]
                 [--target-files-omit-workdir-adjustment]
                 [--allowed-rules ALLOWED_RULES [ALLOWED_RULES ...]]
                 [--target-jobs TARGET_JOBS [TARGET_JOBS ...]]
                 [--local-groupid LOCAL_GROUPID]
                 [--max-jobs-per-second MAX_JOBS_PER_SECOND]
                 [--max-status-checks-per-second MAX_STATUS_CHECKS_PER_SECOND]
                 [--seconds-between-status-checks SECONDS_BETWEEN_STATUS_CHECKS]
                 [--retries RETRIES] [--attempt ATTEMPT]
                 [--wrapper-prefix WRAPPER_PREFIX]
                 [--default-storage-provider DEFAULT_STORAGE_PROVIDER]
                 [--default-storage-prefix DEFAULT_STORAGE_PREFIX]
                 [--local-storage-prefix LOCAL_STORAGE_PREFIX]
                 [--shared-fs-usage {input-output,persistence,software-deployment,source-cache,sources,storage-local-copies,none} [{input-output,persistence,software-deployment,source-cache,sources,storage-local-copies,none} ...]]
                 [--scheduler-greediness SCHEDULER_GREEDINESS] [--no-hooks]
                 [--debug] [--runtime-profile FILE]
                 [--mode {remote,subprocess,default}] [--show-failed-logs]
                 [--log-handler-script FILE] [--log-service {none,slack,wms}]
                 [--job-deploy-sources] [--container-image IMAGE]
                 [--immediate-submit] [--jobscript SCRIPT] [--jobname NAME]
                 [--flux]
                 [--software-deployment-method {apptainer,conda,env-modules} [{apptainer,conda,env-modules} ...]]
                 [--container-cleanup-images] [--use-conda]
                 [--conda-not-block-search-path-envvars] [--list-conda-envs]
                 [--conda-prefix DIR] [--conda-cleanup-envs]
                 [--conda-cleanup-pkgs [{tarballs,cache}]]
                 [--conda-create-envs-only] [--conda-frontend {conda,mamba}]
                 [--use-apptainer] [--apptainer-prefix DIR]
                 [--apptainer-args ARGS] [--use-envmodules]
                 [targets ...]

Snakemake is a Python based language and execution environment for GNU Make-
like workflows.

options:
  -h, --help            show this help message and exit

EXECUTION:
  targets               Targets to build. May be rules or files. (default:
                        set())
  --dry-run, --dryrun, -n
                        Do not execute anything, and display what would be
                        done. If you have a very large workflow, use --dry-run
                        --quiet to just print a summary of the DAG of jobs.
                        (default: False)
  --profile PROFILE     Name of profile to use for configuring Snakemake.
                        Snakemake will search for a corresponding folder in
                        /etc/xdg/snakemake and
                        /home/atemtem/.config/snakemake. Alternatively, this
                        can be an absolute or relative path. The profile
                        folder has to contain a file 'config.yaml'. This file
                        can be used to set default values for command line
                        options in YAML format. For example, '--cluster qsub'
                        becomes 'cluster: qsub' in the YAML file. Profiles can
                        be obtained from https://github.com/snakemake-
                        profiles. The profile can also be set via the
                        environment variable $SNAKEMAKE_PROFILE. To override
                        this variable and use no profile at all, provide the
                        value 'none' to this argument. [env var:
                        SNAKEMAKE_PROFILE] (default: None)
  --workflow-profile WORKFLOW_PROFILE
                        Path (relative to current directory) to workflow
                        specific profile folder to use for configuring
                        Snakemake with parameters specific for this workflow
                        (like resources). If this flag is not used, Snakemake
                        will by default use 'profiles/default' if present
                        (searched both relative to current directory and
                        relative to Snakefile, in this order). For skipping
                        any workflow specific profile provide the special
                        value 'none'. Settings made in the workflow profile
                        will override settings made in the general profile
                        (see --profile). The profile folder has to contain a
                        file 'config.yaml'. This file can be used to set
                        default values for command line options in YAML
                        format. For example, '--executor slurm' becomes
                        'executor: slurm' in the YAML file. It is advisable to
                        use the workflow profile to set or overwrite e.g.
                        workflow specific resources like the amount of threads
                        of a particular rule or the amount of memory needed.
                        Note that in such cases, the arguments may be given as
                        nested YAML mappings in the profile, e.g. 'set-
                        threads: myrule: 4' instead of 'set-threads:
                        myrule=4'. (default: None)
  --cache [RULE ...]    Store output files of given rules in a central cache
                        given by the environment variable
                        $SNAKEMAKE_OUTPUT_CACHE. Likewise, retrieve output
                        files of the given rules from this cache if they have
                        been created before (by anybody writing to the same
                        cache), instead of actually executing the rules.
                        Output files are identified by hashing all steps,
                        parameters and software stack (conda envs or
                        containers) needed to create them. (default: None)
  --snakefile FILE, -s FILE
                        The workflow definition in form of a
                        snakefile.Usually, you should not need to specify
                        this. By default, Snakemake will search for
                        'Snakefile', 'snakefile', 'workflow/Snakefile',
                        'workflow/snakefile' beneath the current working
                        directory, in this order. Only if you definitely want
                        a different layout, you need to use this parameter.
                        (default: None)
  --cores N, -c N       Use at most N CPU cores/jobs in parallel. If N is
                        omitted or 'all', the limit is set to the number of
                        available CPU cores. In case of cluster/cloud
                        execution, this argument sets the maximum number of
                        cores requested from the cluster or cloud scheduler.
                        (See https://snakemake.readthedocs.io/en/stable/snakef
                        iles/rules.html#resources-remote-execution for more
                        info)This number is available to rules via
                        workflow.cores. (default: None)
  --jobs N, -j N        Use at most N CPU cluster/cloud jobs in parallel. For
                        local execution this is an alias for --cores (it is
                        though recommended to use --cores in that case). Note:
                        Set to 'unlimited' to allow any number of parallel
                        jobs. (default: None)
  --local-cores N       In cluster/cloud mode, use at most N cores of the host
                        machine in parallel (default: number of CPU cores of
                        the host). The cores are used to execute local rules.
                        This option is ignored when not in cluster/cloud mode.
                        (default: 48)
  --resources NAME=INT [NAME=INT ...], --res NAME=INT [NAME=INT ...]
                        Define additional resources that shall constrain the
                        scheduling analogously to --cores (see above). A
                        resource is defined as a name and an integer value.
                        E.g. --resources mem_mb=1000. Rules can use resources
                        by defining the resource keyword, e.g. resources:
                        mem_mb=600. If now two rules require 600 of the
                        resource 'mem_mb' they won't be run in parallel by the
                        scheduler. In cluster/cloud mode, this argument will
                        also constrain the amount of resources requested from
                        the server. (See https://snakemake.readthedocs.io/en/s
                        table/snakefiles/rules.html#resources-remote-execution
                        for more info) (default: {})
  --set-threads RULE=THREADS [RULE=THREADS ...]
                        Overwrite thread usage of rules. This allows to fine-
                        tune workflow parallelization. In particular, this is
                        helpful to target certain cluster nodes by e.g.
                        shifting a rule to use more, or less threads than
                        defined in the workflow. Thereby, THREADS has to be a
                        positive integer, and RULE has to be the name of the
                        rule. (default: {})
  --max-threads MAX_THREADS
                        Define a global maximum number of threads available to
                        any rule. Rules requesting more threads (via the
                        threads keyword) will have their values reduced to the
                        maximum. This can be useful when you want to restrict
                        the maximum number of threads without modifying the
                        workflow definition or overwriting rules individually
                        with --set-threads. (default: None)
  --set-resources RULE:RESOURCE=VALUE [RULE:RESOURCE=VALUE ...]
                        Overwrite resource usage of rules. This allows to
                        fine-tune workflow resources. In particular, this is
                        helpful to target certain cluster nodes by e.g.
                        defining a certain partition for a rule, or overriding
                        a temporary directory. Thereby, VALUE has to be a
                        positive integer or a string, RULE has to be the name
                        of the rule, and RESOURCE has to be the name of the
                        resource. (default: {})
  --set-scatter NAME=SCATTERITEMS [NAME=SCATTERITEMS ...]
                        Overwrite number of scatter items of scattergather
                        processes. This allows to fine-tune workflow
                        parallelization. Thereby, SCATTERITEMS has to be a
                        positive integer, and NAME has to be the name of the
                        scattergather process defined via a scattergather
                        directive in the workflow. (default: {})
  --set-resource-scopes RESOURCE=[global|local] [RESOURCE=[global|local] ...]
                        Overwrite resource scopes. A scope determines how a
                        constraint is reckoned in cluster execution. With
                        RESOURCE=local, a constraint applied to RESOURCE using
                        --resources will be considered the limit for each
                        group submission. With RESOURCE=global, the constraint
                        will apply across all groups cumulatively. By default,
                        only `mem_mb` and `disk_mb` are considered local, all
                        other resources are global. This may be modified in
                        the snakefile using the `resource_scopes:` directive.
                        Note that number of threads, specified via --cores, is
                        always considered local. (See https://snakemake.readth
                        edocs.io/en/stable/snakefiles/rules.html#resources-
                        remote-execution for more info) (default: {})
  --default-resources [NAME=INT ...], --default-res [NAME=INT ...]
                        Define default values of resources for rules that do
                        not define their own values. In addition to plain
                        integers, python expressions over inputsize are
                        allowed (e.g. '2*input.size_mb'). The inputsize is the
                        sum of the sizes of all input files of a rule. By
                        default, Snakemake assumes a default for mem_mb,
                        disk_mb, and tmpdir (see below). This option allows to
                        add further defaults (e.g. account and partition for
                        slurm) or to overwrite these default values. The
                        defaults are 'mem_mb=min(max(2*input.size_mb, 1000),
                        8000)', 'disk_mb=max(2*input.size_mb, 1000)' (i.e.,
                        default disk and mem usage is twice the input file
                        size but at least 1GB), and the system temporary
                        directory (as given by $TMPDIR, $TEMP, or $TMP) is
                        used for the tmpdir resource. The tmpdir resource is
                        automatically used by shell commands, scripts and
                        wrappers to store temporary data (as it is mirrored
                        into $TMPDIR, $TEMP, and $TMP for the executed
                        subprocesses). If this argument is not specified at
                        all, Snakemake just uses the tmpdir resource as
                        outlined above. (default: None)
  --preemptible-rules [PREEMPTIBLE_RULES ...]
                        Define which rules shall use a preemptible machine
                        which can be prematurely killed by e.g. a cloud
                        provider (also called spot instances). This is
                        currently only supported by the Google Life Sciences
                        executor and ignored by all other executors. If no
                        rule names are provided, all rules are considered to
                        be preemptible. (default: None)
  --preemptible-retries PREEMPTIBLE_RETRIES
                        Number of retries that shall be made in order to
                        finish a job from of rule that has been marked as
                        preemptible via the --preemptible-rules setting.
                        (default: None)
  --config [KEY=VALUE ...], -C [KEY=VALUE ...]
                        Set or overwrite values in the workflow config object.
                        The workflow config object is accessible as variable
                        config inside the workflow. Default values can be set
                        by providing a JSON file (see Documentation).
                        (default: {})
  --configfile FILE [FILE ...], --configfiles FILE [FILE ...]
                        Specify or overwrite the config file of the workflow
                        (see the docs). Values specified in JSON or YAML
                        format are available in the global config dictionary
                        inside the workflow. Multiple files overwrite each
                        other in the given order. Thereby missing keys in
                        previous config files are extended by following
                        configfiles. Note that this order also includes a
                        config file defined in the workflow definition itself
                        (which will come first). (default: [])
  --envvars VARNAME [VARNAME ...]
                        Environment variables to pass to cloud jobs. (default:
                        set())
  --directory DIR, -d DIR
                        Specify working directory (relative paths in the
                        snakefile will use this as their origin). (default:
                        None)
  --touch, -t           Touch output files (mark them up to date without
                        really changing them) instead of running their
                        commands. This is used to pretend that the rules were
                        executed, in order to fool future invocations of
                        snakemake. Fails if a file does not yet exist. Note
                        that this will only touch files that would otherwise
                        be recreated by Snakemake (e.g. because their input
                        files are newer). For enforcing a touch, combine this
                        with --force, --forceall, or --forcerun. Note however
                        that you lose the provenance information when the
                        files have been created in reality. Hence, this should
                        be used only as a last resort. (default: False)
  --keep-going, -k      Go on with independent jobs if a job fails. (default:
                        False)
  --rerun-triggers {code,input,mtime,params,software-env} [{code,input,mtime,params,software-env} ...]
                        Define what triggers the rerunning of a job. By
                        default, all triggers are used, which guarantees that
                        results are consistent with the workflow code and
                        configuration. If you rather prefer the traditional
                        way of just considering file modification dates, use '
                        --rerun-trigger mtime'. (default:
                        frozenset({<RerunTrigger.SOFTWARE_ENV: 3>,
                        <RerunTrigger.MTIME: 0>, <RerunTrigger.PARAMS: 1>,
                        <RerunTrigger.CODE: 4>, <RerunTrigger.INPUT: 2>}))
  --force, -f           Force the execution of the selected target or the
                        first rule regardless of already created output.
                        (default: False)
  --executor {local,dryrun,touch}, -e {local,dryrun,touch}
                        Specify a custom executor, available via an executor
                        plugin: snakemake_executor_<name> (default: None)
  --forceall, -F        Force the execution of the selected (or the first)
                        rule and all rules it is dependent on regardless of
                        already created output. (default: False)
  --forcerun [TARGET ...], -R [TARGET ...]
                        Force the re-execution or creation of the given rules
                        or files. Use this option if you changed a rule and
                        want to have all its output in your workflow updated.
                        (default: set())
  --prioritize TARGET [TARGET ...], -P TARGET [TARGET ...]
                        Tell the scheduler to assign creation of given targets
                        (and all their dependencies) highest priority.
                        (default: set())
  --batch RULE=BATCH/BATCHES
                        Only create the given BATCH of the input files of the
                        given RULE. This can be used to iteratively run parts
                        of very large workflows. Only the execution plan of
                        the relevant part of the workflow has to be
                        calculated, thereby speeding up DAG computation. It is
                        recommended to provide the most suitable rule for
                        batching when documenting a workflow. It should be
                        some aggregating rule that would be executed only
                        once, and has a large number of input files. For
                        example, it can be a rule that aggregates over
                        samples. (default: None)
  --until TARGET [TARGET ...], -U TARGET [TARGET ...]
                        Runs the pipeline until it reaches the specified rules
                        or files. Only runs jobs that are dependencies of the
                        specified rule or files, does not run sibling DAGs.
                        (default: set())
  --omit-from TARGET [TARGET ...], -O TARGET [TARGET ...]
                        Prevent the execution or creation of the given rules
                        or files as well as any rules or files that are
                        downstream of these targets in the DAG. Also runs jobs
                        in sibling DAGs that are independent of the rules or
                        files specified here. (default: set())
  --rerun-incomplete, --ri
                        Re-run all jobs the output of which is recognized as
                        incomplete. (default: False)
  --shadow-prefix DIR   Specify a directory in which the 'shadow' directory is
                        created. If not supplied, the value is set to the
                        '.snakemake' directory relative to the working
                        directory. (default: None)
  --scheduler [{ilp,greedy}]
                        Specifies if jobs are selected by a greedy algorithm
                        or by solving an ilp. The ilp scheduler aims to reduce
                        runtime and hdd usage by best possible use of
                        resources. (default: ilp)
  --wms-monitor [WMS_MONITOR]
                        IP and port of workflow management system to monitor
                        the execution of snakemake (e.g.
                        http://127.0.0.1:5000) Note that if your service
                        requires an authorization token, you must export
                        WMS_MONITOR_TOKEN in the environment. (default: None)
  --wms-monitor-arg [NAME=VALUE ...]
                        If the workflow management service accepts extra
                        arguments, provide. them in key value pairs with
                        --wms-monitor-arg. For example, to run an existing
                        workflow using a wms monitor, you can provide the pair
                        id=12345 and the arguments will be provided to the
                        endpoint to first interact with the workflow (default:
                        None)
  --scheduler-ilp-solver {GLPK_CMD,PULP_CBC_CMD,COIN_CMD}
                        Specifies solver to be utilized when selecting ilp-
                        scheduler. (default: COIN_CMD)
  --scheduler-solver-path SCHEDULER_SOLVER_PATH
                        Set the PATH to search for scheduler solver binaries
                        (internal use only). (default: None)
  --conda-base-path CONDA_BASE_PATH
                        Path of conda base installation (home of conda, mamba,
                        activate) (internal use only). (default: None)
  --no-subworkflows, --nosw
                        Do not evaluate or execute subworkflows. (default:
                        False)
  --precommand PRECOMMAND
                        Only used in case of remote execution. Command to be
                        executed before Snakemake executes each job on the
                        remote compute node. (default: None)

GROUPING:
  --groups GROUPS [GROUPS ...]
                        Assign rules to groups (this overwrites any group
                        definitions from the workflow). (default: {})
  --group-components GROUP_COMPONENTS [GROUP_COMPONENTS ...]
                        Set the number of connected components a group is
                        allowed to span. By default, this is 1, but this flag
                        allows to extend this. This can be used to run e.g. 3
                        jobs of the same rule in the same group, although they
                        are not connected. It can be helpful for putting
                        together many small jobs or benefitting of shared
                        memory setups. (default: {})

REPORTS:
  --report [FILE]       Create an HTML report with results and statistics.
                        This can be either a .html file or a .zip file. In the
                        former case, all results are embedded into the .html
                        (this only works for small data). In the latter case,
                        results are stored along with a file report.html in
                        the zip archive. If no filename is given, an embedded
                        report.html is the default. (default: None)
  --report-stylesheet CSSFILE
                        Custom stylesheet to use for report. In particular,
                        this can be used for branding the report with e.g. a
                        custom logo, see docs. (default: None)

NOTEBOOKS:
  --draft-notebook TARGET
                        Draft a skeleton notebook for the rule used to
                        generate the given target file. This notebook can then
                        be opened in a jupyter server, executed and
                        implemented until ready. After saving, it will
                        automatically be reused in non-interactive mode by
                        Snakemake for subsequent jobs. (default: None)
  --edit-notebook TARGET
                        Interactively edit the notebook associated with the
                        rule used to generate the given target file. This will
                        start a local jupyter notebook server. Any changes to
                        the notebook should be saved, and the server has to be
                        stopped by closing the notebook and hitting the 'Quit'
                        button on the jupyter dashboard. Afterwards, the
                        updated notebook will be automatically stored in the
                        path defined in the rule. If the notebook is not yet
                        present, this will create an empty draft. (default:
                        None)
  --notebook-listen IP:PORT
                        The IP address and PORT the notebook server used for
                        editing the notebook (--edit-notebook) will listen on.
                        (default: localhost:8888)

UTILITIES:
  --lint [{text,json}]  Perform linting on the given workflow. This will print
                        snakemake specific suggestions to improve code quality
                        (work in progress, more lints to be added in the
                        future). If no argument is provided, plain text output
                        is used. (default: None)
  --generate-unit-tests [TESTPATH]
                        Automatically generate unit tests for each workflow
                        rule. This assumes that all input files of each job
                        are already present. Rules without a job with present
                        input files will be skipped (a warning will be
                        issued). For each rule, one test case will be created
                        in the specified test folder (.tests/unit by default).
                        After successful execution, tests can be run with
                        'pytest TESTPATH'. (default: None)
  --containerize        Print a Dockerfile that provides an execution
                        environment for the workflow, including all conda
                        environments. (default: False)
  --export-cwl FILE     Compile workflow to CWL and store it in given FILE.
                        (default: None)
  --list-rules, --list, -l
                        Show available rules in given Snakefile. (default:
                        False)
  --list-target-rules, --lt
                        Show available target rules in given Snakefile.
                        (default: False)
  --dag                 Do not execute anything and print the directed acyclic
                        graph of jobs in the dot language. Recommended use on
                        Unix systems: snakemake --dag | dot | display. Note
                        print statements in your Snakefile may interfere with
                        visualization. (default: False)
  --rulegraph           Do not execute anything and print the dependency graph
                        of rules in the dot language. This will be less
                        crowded than above DAG of jobs, but also show less
                        information. Note that each rule is displayed once,
                        hence the displayed graph will be cyclic if a rule
                        appears in several steps of the workflow. Use this if
                        above option leads to a DAG that is too large.
                        Recommended use on Unix systems: snakemake --rulegraph
                        | dot | display. Note print statements in your
                        Snakefile may interfere with visualization. (default:
                        False)
  --filegraph           Do not execute anything and print the dependency graph
                        of rules with their input and output files in the dot
                        language. This is an intermediate solution between
                        above DAG of jobs and the rule graph. Note that each
                        rule is displayed once, hence the displayed graph will
                        be cyclic if a rule appears in several steps of the
                        workflow. Use this if above option leads to a DAG that
                        is too large. Recommended use on Unix systems:
                        snakemake --filegraph | dot | display. Note print
                        statements in your Snakefile may interfere with
                        visualization. (default: False)
  --d3dag               Print the DAG in D3.js compatible JSON format.
                        (default: False)
  --summary, -S         Print a summary of all files created by the workflow.
                        The has the following columns: filename, modification
                        time, rule version, status, plan. Thereby rule version
                        contains the versionthe file was created with (see the
                        version keyword of rules), and status denotes whether
                        the file is missing, its input files are newer or if
                        version or implementation of the rule changed since
                        file creation. Finally the last column denotes whether
                        the file will be updated or created during the next
                        workflow execution. (default: False)
  --detailed-summary, -D
                        Print a summary of all files created by the workflow.
                        The has the following columns: filename, modification
                        time, rule version, input file(s), shell command,
                        status, plan. Thereby rule version contains the
                        version the file was created with (see the version
                        keyword of rules), and status denotes whether the file
                        is missing, its input files are newer or if version or
                        implementation of the rule changed since file
                        creation. The input file and shell command columns are
                        self explanatory. Finally the last column denotes
                        whether the file will be updated or created during the
                        next workflow execution. (default: False)
  --archive FILE        Archive the workflow into the given tar archive FILE.
                        The archive will be created such that the workflow can
                        be re-executed on a vanilla system. The function needs
                        conda and git to be installed. It will archive every
                        file that is under git version control. Note that it
                        is best practice to have the Snakefile, config files,
                        and scripts under version control. Hence, they will be
                        included in the archive. Further, it will add input
                        files that are not generated by by the workflow itself
                        and conda environments. Note that symlinks are
                        dereferenced. Supported formats are .tar, .tar.gz,
                        .tar.bz2 and .tar.xz. (default: None)
  --cleanup-metadata FILE [FILE ...], --cm FILE [FILE ...]
                        Cleanup the metadata of given files. That means that
                        snakemake removes any tracked version info, and any
                        marks that files are incomplete. (default: None)
  --cleanup-shadow      Cleanup old shadow directories which have not been
                        deleted due to failures or power loss. (default:
                        False)
  --skip-script-cleanup
                        Don't delete wrapper scripts used for execution
                        (default: False)
  --unlock              Remove a lock on the working directory. (default:
                        False)
  --list-changes {params,code,input}, --lc {params,code,input}
                        List all output files for which the rule body (run or
                        shell) have changed in the Snakefile. (default: None)
  --list-input-changes, --li
                        List all output files for which the defined input
                        files have changed in the Snakefile (e.g. new input
                        files were added in the rule definition or files were
                        renamed). For listing input file modification in the
                        filesystem, use --summary. (default: False)
  --list-params-changes, --lp
                        List all output files for which the defined params
                        have changed in the Snakefile. (default: False)
  --list-untracked, --lu
                        List all files in the working directory that are not
                        used in the workflow. This can be used e.g. for
                        identifying leftover files. Hidden files and
                        directories are ignored. (default: False)
  --delete-all-output   Remove all files generated by the workflow. Use
                        together with --dry-run to list files without actually
                        deleting anything. Note that this will not recurse
                        into subworkflows. Write-protected files are not
                        removed. Nevertheless, use with care! (default: False)
  --delete-temp-output  Remove all temporary files generated by the workflow.
                        Use together with --dry-run to list files without
                        actually deleting anything. Note that this will not
                        recurse into subworkflows. (default: False)
  --keep-incomplete     Do not remove incomplete output files by failed jobs.
                        (default: False)
  --drop-metadata       Drop metadata file tracking information after job
                        finishes. Provenance-information based reports (e.g.
                        --report and the --list_x_changes functions) will be
                        empty or incomplete. (default: False)
  --deploy-sources QUERY CHECKSUM
                        Deploy sources archive from given storage provider
                        query to the current working sdirectory and control
                        for archive checksum to proceed. Meant for internal
                        use only. (default: None)
  --version, -v         show program's version number and exit

OUTPUT:
  --printshellcmds, -p  Print out the shell commands that will be executed.
                        (default: False)
  --debug-dag           Print candidate and selected jobs (including their
                        wildcards) while inferring DAG. This can help to debug
                        unexpected DAG topology or errors. (default: False)
  --nocolor             Do not use a colored output. (default: False)
  --quiet [{all,progress,rules} ...], -q [{all,progress,rules} ...]
                        Do not output certain information. If used without
                        arguments, do not output any progress or rule
                        information. Defining 'all' results in no information
                        being printed at all. (default: None)
  --print-compilation   Print the python representation of the workflow.
                        (default: False)
  --verbose             Print debugging output. (default: False)

BEHAVIOR:
  --force-use-threads   Force threads rather than processes. Helpful if shared
                        memory (/dev/shm) is full or unavailable. (default:
                        False)
  --allow-ambiguity, -a
                        Don't check for ambiguous rules and simply use the
                        first if several can produce the same file. This
                        allows the user to prioritize rules by their order in
                        the snakefile. (default: False)
  --nolock              Do not lock the working directory (default: False)
  --ignore-incomplete, --ii
                        Do not check for incomplete output files. (default:
                        False)
  --max-inventory-time SECONDS
                        Spend at most SECONDS seconds to create a file
                        inventory for the working directory. The inventory
                        vastly speeds up file modification and existence
                        checks when computing which jobs need to be executed.
                        However, creating the inventory itself can be slow,
                        e.g. on network file systems. Hence, we do not spend
                        more than a given amount of time and fall back to
                        individual checks for the rest. (default: 20)
  --latency-wait SECONDS, --output-wait SECONDS, -w SECONDS
                        Wait given seconds if an output file of a job is not
                        present after the job finished. This helps if your
                        filesystem suffers from latency (default 5). (default:
                        5)
  --wait-for-files [FILE ...]
                        Wait --latency-wait seconds for these files to be
                        present before executing the workflow. This option is
                        used internally to handle filesystem latency in
                        cluster environments. (default: None)
  --wait-for-files-file FILE
                        Same behaviour as --wait-for-files, but file list is
                        stored in file instead of being passed on the
                        commandline. This is useful when the list of files is
                        too long to be passed on the commandline. (default:
                        None)
  --queue-input-wait-time SECONDS
                        Set the interval in seconds to check for new input in
                        rules that use from_queue to obtain input files.
                        (default: 10)
  --notemp, --nt        Ignore temp() declarations. This is useful when
                        running only a part of the workflow, since temp()
                        would lead to deletion of probably needed files by
                        other parts of the workflow. (default: False)
  --all-temp            Mark all output files as temp files. This can be
                        useful for CI testing, in order to save space.
                        (default: False)
  --unneeded-temp-files FILE [FILE ...]
                        Given files will not be uploaded to storage and
                        immediately deleted after job or group job completion.
                        (default: frozenset())
  --keep-storage-local-copies
                        Keep local copies of remote input files. (default:
                        False)
  --target-files-omit-workdir-adjustment
                        Do not adjust the paths of given target files relative
                        to the working directory. (default: False)
  --allowed-rules ALLOWED_RULES [ALLOWED_RULES ...]
                        Only consider given rules. If omitted, all rules in
                        Snakefile are used. Note that this is intended
                        primarily for internal use and may lead to unexpected
                        results otherwise. (default: None)
  --target-jobs TARGET_JOBS [TARGET_JOBS ...]
                        Target particular jobs by
                        RULE:WILDCARD1=VALUE,WILDCARD2=VALUE,... This is meant
                        for internal use by Snakemake itself only. (default:
                        set())
  --local-groupid LOCAL_GROUPID
                        Name for local groupid, meant for internal use only.
                        (default: local)
  --max-jobs-per-second MAX_JOBS_PER_SECOND
                        Maximal number of cluster/drmaa jobs per second,
                        default is 10, fractions allowed. (default: 10)
  --max-status-checks-per-second MAX_STATUS_CHECKS_PER_SECOND
                        Maximal number of job status checks per second,
                        default is 10, fractions allowed. (default: 10)
  --seconds-between-status-checks SECONDS_BETWEEN_STATUS_CHECKS
                        Number of seconds to wait between two rounds of status
                        checks. (default: 10)
  --retries RETRIES, --restart-times RETRIES, -T RETRIES
                        Number of times to restart failing jobs (defaults to
                        0). (default: 0)
  --attempt ATTEMPT     Internal use only: define the initial value of the
                        attempt parameter (default: 1). (default: 1)
  --wrapper-prefix WRAPPER_PREFIX
                        Prefix for URL created from wrapper directive
                        (default: https://github.com/snakemake/snakemake-
                        wrappers/raw/). Set this to a different URL to use
                        your fork or a local clone of the repository, e.g.,
                        use a git URL like
                        'git+file://path/to/your/local/clone@'. (default:
                        https://github.com/snakemake/snakemake-wrappers/raw/)
  --default-storage-provider DEFAULT_STORAGE_PROVIDER
                        Specify default storage provider to be used for all
                        input and output files that don't yet specify one
                        (e.g. 's3'). See
                        https://snakemake.github.io/snakemake-plugin-catalog
                        for available storage provider plugins. (default:
                        None)
  --default-storage-prefix DEFAULT_STORAGE_PREFIX
                        Specify prefix for default storage provider. E.g. a
                        bucket name. (default: )
  --local-storage-prefix LOCAL_STORAGE_PREFIX
                        Specify prefix for storing local copies of storage
                        files and folders. By default, this is a hidden
                        subfolder in the workdir. It can however be freely
                        chosen, e.g. in order to store those files on a local
                        scratch disk. (default: .snakemake/storage)
  --shared-fs-usage {input-output,persistence,software-deployment,source-cache,sources,storage-local-copies,none} [{input-output,persistence,software-deployment,source-cache,sources,storage-local-copies,none} ...]
                        Set assumptions on shared filesystem for non-local
                        workflow execution. To disable any sharing via the
                        filesystem, specify 'none'. Usually, the executor
                        plugin sets this to a correct default. However,
                        sometimes it is worth tuning this setting, e.g. for
                        optimizing cluster performance. For example, when
                        using '--default-storage-provider fs' together with a
                        cluster executor like slurm, you might want to set '--
                        shared-fs-usage persistence software-deployment
                        sources source-cache', such that software deployment
                        and data provenance will be handled by NFS but input
                        and output files will be handled exclusively by the
                        storage provider. (default:
                        frozenset({<SharedFSUsage.PERSISTENCE: 0>,
                        <SharedFSUsage.STORAGE_LOCAL_COPIES: 4>,
                        <SharedFSUsage.SOURCE_CACHE: 5>,
                        <SharedFSUsage.SOFTWARE_DEPLOYMENT: 2>,
                        <SharedFSUsage.SOURCES: 3>,
                        <SharedFSUsage.INPUT_OUTPUT: 1>}))
  --scheduler-greediness SCHEDULER_GREEDINESS, --greediness SCHEDULER_GREEDINESS
                        Set the greediness of scheduling. This value between 0
                        and 1 determines how careful jobs are selected for
                        execution. The default value (1.0) provides the best
                        speed and still acceptable scheduling quality.
                        (default: None)
  --no-hooks            Do not invoke onstart, onsuccess or onerror hooks
                        after execution. (default: False)
  --debug               Allow to debug rules with e.g. PDB. This flag allows
                        to set breakpoints in run blocks. (default: False)
  --runtime-profile FILE
                        Profile Snakemake and write the output to FILE. This
                        requires yappi to be installed. (default: None)
  --mode {remote,subprocess,default}
                        Set execution mode of Snakemake (internal use only).
                        (default: default)
  --show-failed-logs    Automatically display logs of failed jobs. (default:
                        False)
  --log-handler-script FILE
                        Provide a custom script containing a function 'def
                        log_handler(msg):'. Snakemake will call this function
                        for every logging output (given as a dictionary
                        msg)allowing to e.g. send notifications in the form of
                        e.g. slack messages or emails. (default: None)
  --log-service {none,slack,wms}
                        Set a specific messaging service for logging
                        output.Snakemake will notify the service on errors and
                        completed execution.Currently slack and workflow
                        management system (wms) are supported. (default: None)
  --job-deploy-sources  Whether the workflow sources shall be deployed before
                        a remote job is started. Only applies if --no-shared-
                        fs is set or executors are used that imply no shared
                        FS (e.g. the kubernetes executor). (default: False)

REMOTE EXECUTION:
  --container-image IMAGE
                        Docker image to use, e.g., when submitting jobs to
                        kubernetes. Defaults to
                        'https://hub.docker.com/r/snakemake/snakemake', tagged
                        with the same version as the currently running
                        Snakemake instance. Note that overwriting this value
                        is up to your responsibility. Any used image has to
                        contain a working snakemake installation that is
                        compatible with (or ideally the same as) the currently
                        running version. (default:
                        snakemake/snakemake:v8.4.12)
  --immediate-submit, --is
                        Immediately submit all jobs to the cluster instead of
                        waiting for present input files. This will fail,
                        unless you make the cluster aware of job dependencies,
                        e.g. via: $ snakemake --cluster 'sbatch --dependency
                        {dependencies}. Assuming that your submit script (here
                        sbatch) outputs the generated job id to the first
                        stdout line, {dependencies} will be filled with space
                        separated job ids this job depends on. Does not work
                        for workflows that contain checkpoint rules. (default:
                        False)
  --jobscript SCRIPT, --js SCRIPT
                        Provide a custom job script for submission to the
                        cluster. The default script resides as 'jobscript.sh'
                        in the installation directory. (default: None)
  --jobname NAME, --jn NAME
                        Provide a custom name for the jobscript that is
                        submitted to the cluster (see --cluster). NAME is
                        "snakejob.{name}.{jobid}.sh" per default. The wildcard
                        {jobid} has to be present in the name. (default:
                        snakejob.{name}.{jobid}.sh)

FLUX:
  --flux                Execute your workflow on a flux cluster. Flux can work
                        with both a shared network filesystem (like NFS) or
                        without. If you don't have a shared filesystem,
                        additionally specify --no-shared-fs. (default: False)

SOFTWARE DEPLOYMENT:
  --software-deployment-method {apptainer,conda,env-modules} [{apptainer,conda,env-modules} ...], --deployment-method {apptainer,conda,env-modules} [{apptainer,conda,env-modules} ...], --deployment {apptainer,conda,env-modules} [{apptainer,conda,env-modules} ...], --sdm {apptainer,conda,env-modules} [{apptainer,conda,env-modules} ...]
                        Specify software environment deployment method.
                        (default: set())
  --container-cleanup-images
                        Remove unused containers (default: False)

CONDA:
  --use-conda           If defined in the rule, run job in a conda
                        environment. If this flag is not set, the conda
                        directive is ignored. (default: False)
  --conda-not-block-search-path-envvars
                        Do not block environment variables that modify the
                        search path (R_LIBS, PYTHONPATH, PERL5LIB, PERLLIB)
                        when using conda environments. (default: False)
  --list-conda-envs     List all conda environments and their location on
                        disk. (default: False)
  --conda-prefix DIR    Specify a directory in which the 'conda' and 'conda-
                        archive' directories are created. These are used to
                        store conda environments and their archives,
                        respectively. If not supplied, the value is set to the
                        '.snakemake' directory relative to the invocation
                        directory. If supplied, the `--use-conda` flag must
                        also be set. The value may be given as a relative
                        path, which will be extrapolated to the invocation
                        directory, or as an absolute path. The value can also
                        be provided via the environment variable
                        $SNAKEMAKE_CONDA_PREFIX. (default: None)
  --conda-cleanup-envs  Cleanup unused conda environments. (default: False)
  --conda-cleanup-pkgs [{tarballs,cache}]
                        Cleanup conda packages after creating environments. In
                        case of 'tarballs' mode, will clean up all downloaded
                        package tarballs. In case of 'cache' mode, will
                        additionally clean up unused package caches. If mode
                        is omitted, will default to only cleaning up the
                        tarballs. (default: None)
  --conda-create-envs-only
                        If specified, only creates the job-specific conda
                        environments then exits. The `--use-conda` flag must
                        also be set. (default: False)
  --conda-frontend {conda,mamba}
                        Choose the conda frontend for installing environments.
                        Mamba is much faster and highly recommended. (default:
                        mamba)

APPTAINER/SINGULARITY:
  --use-apptainer, --use-singularity
                        If defined in the rule, run job within a
                        apptainer/singularity container. If this flag is not
                        set, the singularity directive is ignored. (default:
                        False)
  --apptainer-prefix DIR, --singularity-prefix DIR
                        Specify a directory in which apptainer/singularity
                        images will be stored.If not supplied, the value is
                        set to the '.snakemake' directory relative to the
                        invocation directory. If supplied, the `--use-
                        apptainer` flag must also be set. The value may be
                        given as a relative path, which will be extrapolated
                        to the invocation directory, or as an absolute path.
                        (default: None)
  --apptainer-args ARGS, --singularity-args ARGS
                        Pass additional args to apptainer/singularity.
                        (default: )

ENVIRONMENT MODULES:
  --use-envmodules      If defined in the rule, run job within the given
                        environment modules, loaded in the given order. This
                        can be combined with --use-conda and --use-
                        singularity, which will then be only used as a
                        fallback for rules which don't define environment
                        modules. (default: False)

 In general, command-line values override environment variables which override
defaults.
