# 2e2c31a0e0d68d26b613897e423ba2c5716ff487
## Classification: neu
## 4 refatorações:
- Rename Method package packageOrTrimNoShip(cmd String) : String renamed to package unqualifyIfLocalPath(cmd String) : String in class org.apache.hadoop.streaming.StreamJob
- Rename Method package readUntilMatch(pat String, outBuf StringBuffer) : void renamed to package fastReadUntilMatch(textPat String, includePat boolean, outBufOrNull StringBuffer) : boolean in class org.apache.hadoop.streaming.StreamXmlRecordReader
- Extract Method package readUntilMatchBegin() : boolean extracted from public seekNextRecordBoundary() : void in class org.apache.hadoop.streaming.StreamXmlRecordReader
- Extract Method package readUntilMatchEnd(buf StringBuffer) : boolean extracted from public next(key Writable, value Writable) : boolean in class org.apache.hadoop.streaming.StreamXmlRecordReader
# f2d7007743c2ebe9d2409c9b6ea5134c536d5173
## Classification: pos
## 2 refatorações:
- Extract Method private finish(size long) : void extracted from public run() : void in class org.apache.hadoop.mapred.ReduceTaskRunner.MapOutputCopier
- Extract Method public ping() : void extracted from public run() : void in class org.apache.hadoop.mapred.ReduceTaskRunner.MapOutputCopier
# e1c55a2623e46dd9bf27bfe4262f37f473c35a1d
## Classification: neu
## 1 refatorações:
- Rename Class org.apache.hadoop.fs.TestDFSCIO renamed to org.apache.hadoop.fs.DFSCIOTest
# 8fe5a30ca98733dea77416d2602f7d3e30353017
## Classification: pos
## 9 refatorações:
- Move Class org.apache.hadoop.dfs.NameNode.LeaseExpiredException moved to org.apache.hadoop.dfs.LeaseExpiredException
- Move Class org.apache.hadoop.dfs.NameNode.NotReplicatedYetException moved to org.apache.hadoop.dfs.NotReplicatedYetException
- Move Class org.apache.hadoop.dfs.NameNode.AlreadyBeingCreatedException moved to org.apache.hadoop.dfs.AlreadyBeingCreatedException
- Rename Method private rmDataNode(nodeInfo DatanodeInfo) : void renamed to private removeDatanode(nodeInfo DatanodeInfo) : void in class org.apache.hadoop.dfs.FSNamesystem
- Rename Method package rmDataNodeByName(name UTF8) : void renamed to public removeDatanode(nodeID DatanodeID) : void in class org.apache.hadoop.dfs.FSNamesystem
- Pull Up Method public getName() : UTF8 from class org.apache.hadoop.dfs.DatanodeInfo to public getName() : String from class org.apache.hadoop.dfs.DatanodeID
- Pull Up Method public getHost() : UTF8 from class org.apache.hadoop.dfs.DatanodeInfo to public getHost() : String from class org.apache.hadoop.dfs.DatanodeID
- Pull Up Method public toString() : String from class org.apache.hadoop.dfs.DatanodeInfo to public toString() : String from class org.apache.hadoop.dfs.DatanodeID
- Extract Method public getDatanode(nodeID DatanodeID) : DatanodeInfo extracted from public processReport(newReport Block[], name UTF8) : Block[] in class org.apache.hadoop.dfs.FSNamesystem
# b8434e7a24716c2267df9b3dc8be791d98210904
## Classification: pos
## 1 refatorações:
- Extract Method private rmDataNode(nodeInfo DatanodeInfo) : void extracted from package heartbeatCheck() : void in class org.apache.hadoop.dfs.FSNamesystem
# d37b1f69bb0d8533ef06ca626a23d1beaf661a1c
## Classification: pos
## 1 refatorações:
- Extract Method public getFile(fileSys FileSystem, localFilename Path, reduce int) : long extracted from private copyOutput(loc MapOutputLocation) : long in class org.apache.hadoop.mapred.ReduceTaskRunner.MapOutputCopier
# 662873c926bbf3d444b43ddc587bb152c8e1d039
## Classification: pos
## 2 refatorações:
- Extract Method private getCopyResult() : CopyResult extracted from public prepare() : boolean in class org.apache.hadoop.mapred.ReduceTaskRunner
- Extract Method private queryJobTracker(neededOutputs List, jobClient InterTrackerProtocol) : MapOutputLocation[] extracted from public prepare() : boolean in class org.apache.hadoop.mapred.ReduceTaskRunner
# 8c9f6864934167b9e88522f6ea480efedd43f56b
## Classification: pos
## 1 refatorações:
- Rename Method public getBlockSize() : long renamed to public getDefaultBlockSize() : long in class org.apache.hadoop.fs.LocalFileSystem
# cb14892dced81f6674484698e93c61378f320d6b
## Classification: pos
## 1 refatorações:
- Extract Method protected newRecord(recordName String) : MetricsRecordImpl extracted from public createRecord(recordName String) : MetricsRecord in class org.apache.hadoop.metrics.spi.AbstractMetricsContext
# af5832a247abc0b20e429d02f4e3c5a87567dbb5
## Classification: pos
## 1 refatorações:
- Extract Method public failedTask(tip TaskInProgress, taskid String, reason String, hostname String, trackerName String) : void extracted from public run() : void in class org.apache.hadoop.mapred.JobTracker.ExpireLaunchingTasks
# e568e49ac7433fb6c2572a4a467ca2889bcf6acb
## Classification: pos
## 1 refatorações:
- Move Method private unJar(jarFile File, toDir File) : void from class org.apache.hadoop.mapred.TaskRunner to public unJar(jarFile File, toDir File) : void from class org.apache.hadoop.util.RunJar
# b4799d42e0f59bdfe357d7aaff4028bea16ada16
## Classification: neg
## 1 refatorações:
- Move Method public unJar(jarFile File, toDir File) : void from class org.apache.hadoop.util.RunJar to private unJar(jarFile File, toDir File) : void from class org.apache.hadoop.mapred.TaskRunner
# 9ad77df0ea860504434cb4162137a310723fb201
## Classification: pos
## 1 refatorações:
- Move Method private unJar(jarFile File, toDir File) : void from class org.apache.hadoop.mapred.TaskRunner to public unJar(jarFile File, toDir File) : void from class org.apache.hadoop.util.RunJar
# e40d7f657923776813fb4f80125255a967dfaff4
## Classification: pos
## 5 refatorações:
- Rename Class org.apache.hadoop.mapred.MapredLoadTest renamed to org.apache.hadoop.mapred.TestMapRed
- Move Class org.apache.hadoop.examples.ExampleDriver.ProgramDescription moved to org.apache.hadoop.util.ProgramDriver.ProgramDescription
- Move Method private printUsage(programs Map) : void from class org.apache.hadoop.examples.ExampleDriver to private printUsage(programs Map) : void from class org.apache.hadoop.util.ProgramDriver
- Extract Method public addClass(name String, mainClass Class, description String) : void extracted from public main(args String[]) : void in class org.apache.hadoop.examples.ExampleDriver
- Extract Method public driver(args String[]) : void extracted from public main(args String[]) : void in class org.apache.hadoop.examples.ExampleDriver
# 260d0f602a754471f20d4b302acf2ce0d21ec7f4
## Classification: pos
## 1 refatorações:
- Rename Method public getBlockwork(sender String, xmitsInProgress int) : BlockCommand renamed to public sendHeartbeat(sender String, capacity long, remaining long, xmitsInProgress int) : BlockCommand in class org.apache.hadoop.dfs.NameNode
# ae7a7e230f95f8024d74545aea3f4af1acea83fd
## Classification: pos
## 2 refatorações:
- Extract Method private initialize() : void extracted from public JobConf(conf Configuration) in class org.apache.hadoop.mapred.JobConf
- Extract Method private initialize(exampleClass Class) : void extracted from public JobConf(conf Configuration, aClass Class) in class org.apache.hadoop.mapred.JobConf
# 82b8f6de5638da52ace204efc77763a6a70ac48f
## Classification: pos
## 3 refatorações:
- Extract Method private toLogReplication(replication short) : UTF8 extracted from public addFile(path UTF8, blocks Block[], replication short) : boolean in class org.apache.hadoop.dfs.FSDirectory
- Extract Method private proccessOverReplicatedBlock(block Block, replication short) : void extracted from package addStoredBlock(block Block, node DatanodeInfo) : void in class org.apache.hadoop.dfs.FSNamesystem
- Extract Method private verifyReplication(src String, replication short, clientName UTF8) : void extracted from public startFile(src UTF8, holder UTF8, clientMachine UTF8, overwrite boolean, replication short) : Object[] in class org.apache.hadoop.dfs.FSNamesystem
# 7a5af7c2099995cd7a164afdf3605f9d4b664f71
## Classification: pos
## 1 refatorações:
- Inline Method public readFields(in DataInput) : void inlined to public readObject(in DataInput, objectWritable ObjectWritable, conf Configuration) : Object in class org.apache.hadoop.io.ObjectWritable
# 6dd684dde8d3c4380519d6913f0632ea8263b89c
## Classification: pos
## 2 refatorações:
- Extract Method private locateFollowingBlock(start long) : LocatedBlock extracted from private nextBlockOutputStream() : void in class org.apache.hadoop.dfs.DFSClient.DFSOutputStream
- Extract Method private locateNewBlock() : LocatedBlock extracted from private nextBlockOutputStream() : void in class org.apache.hadoop.dfs.DFSClient.DFSOutputStream
# 0794e232d52cd53abc4d450f4feff61298000210
## Classification: pos
## 2 refatorações:
- Extract Method private getClient(conf Configuration) : Client extracted from public Invoker(address InetSocketAddress, conf Configuration) in class org.apache.hadoop.ipc.RPC.Invoker
- Extract Method private getClient(conf Configuration) : Client extracted from public call(method Method, params Object[][], addrs InetSocketAddress[], conf Configuration) : Object[] in class org.apache.hadoop.ipc.RPC
# 0f31b06579458e048bf378e7347610a269753e75
## Classification: pos
## 2 refatorações:
- Move Method private stringifyException(e Exception) : String from class org.apache.hadoop.dfs.DataNode to public stringifyException(e Throwable) : String from class org.apache.hadoop.util.StringUtils
- Extract Method private startNewTask(t Task) : void extracted from package offerService() : int in class org.apache.hadoop.mapred.TaskTracker
# b8a11ba2ec45bde538503fab9d010260f131ff1b
## Classification: pos
## 43 refatorações:
- Rename Method public listFiles(src UTF8) : DFSFileInfo[] renamed to public listPaths(src UTF8) : DFSFileInfo[] in class org.apache.hadoop.dfs.DFSClient
- Rename Method public getInputDirs() : File[] renamed to public getInputPaths() : Path[] in class org.apache.hadoop.mapred.JobConf
- Rename Method protected listFiles(fs FileSystem, job JobConf) : File[] renamed to protected listPaths(fs FileSystem, job JobConf) : Path[] in class org.apache.hadoop.mapred.SequenceFileInputFormat
- Rename Method public listFilesRaw(f File) : File[] renamed to public listPathsRaw(f Path) : Path[] in class org.apache.hadoop.dfs.DistributedFileSystem
- Rename Method public recursiveCopy(fs FileSystem, src File, dst File, conf Configuration) : void renamed to public copy(src File, dstFS FileSystem, dst Path, deleteSource boolean, conf Configuration) : boolean in class org.apache.hadoop.fs.FileUtil
- Rename Method public moveFromLocalFile(src File, dst File) : void renamed to public renameRaw(src Path, dst Path) : boolean in class org.apache.hadoop.fs.LocalFileSystem
- Rename Method private makeAbsolute(f File) : File renamed to public pathToFile(path Path) : File in class org.apache.hadoop.fs.LocalFileSystem
- Rename Method private doFromLocalFile(src File, dst File, deleteSource boolean) : void renamed to public copyFromLocalFile(src Path, dst Path) : void in class org.apache.hadoop.dfs.DistributedFileSystem
- Move Method public getContentsLength() : long from class org.apache.hadoop.dfs.DFSFile to public getContentsLength() : long from class org.apache.hadoop.dfs.DfsPath
- Move Method public isDirectory() : boolean from class org.apache.hadoop.dfs.DFSFile to public isDirectory() : boolean from class org.apache.hadoop.dfs.DfsPath
- Move Method public isFile() : boolean from class org.apache.hadoop.dfs.DFSFile to public isFile() : boolean from class org.apache.hadoop.dfs.DfsPath
- Move Method public length() : long from class org.apache.hadoop.dfs.DFSFile to public length() : long from class org.apache.hadoop.dfs.DfsPath
- Move Method private fullyDelete(dir File) : boolean from class org.apache.hadoop.fs.LocalFileSystem to public fullyDelete(dir File) : boolean from class org.apache.hadoop.fs.FileUtil
- Extract Method public create(f Path) : FSDataOutputStream extracted from public create(f File) : FSDataOutputStream in class org.apache.hadoop.fs.FileSystem
- Extract Method public createNewFile(f Path) : boolean extracted from public createNewFile(f File) : boolean in class org.apache.hadoop.fs.FileSystem
- Extract Method public delete(f Path) : boolean extracted from public delete(f File) : boolean in class org.apache.hadoop.fs.FileSystem
- Extract Method public delete(f Path) : boolean extracted from public testWorkingDirectory() : void in class org.apache.hadoop.fs.TestLocalFileSystem
- Extract Method public isFile(f Path) : boolean extracted from public isFile(f File) : boolean in class org.apache.hadoop.fs.FileSystem
- Extract Method public isFile(f Path) : boolean extracted from public testWorkingDirectory() : void in class org.apache.hadoop.fs.TestLocalFileSystem
- Extract Method public listPaths(f Path) : Path[] extracted from public listFiles(f File) : File[] in class org.apache.hadoop.fs.FileSystem
- Extract Method public listPaths(f Path, filter PathFilter) : Path[] extracted from public listFiles(f File, filter FileFilter) : File[] in class org.apache.hadoop.fs.FileSystem
- Extract Method public open(f Path) : FSDataInputStream extracted from public write(out DataOutput) : void in class org.apache.hadoop.mapred.MapOutputFile
- Extract Method public open(f Path) : FSDataInputStream extracted from public open(f File) : FSDataInputStream in class org.apache.hadoop.fs.FileSystem
- Extract Method public rename(src Path, dst Path) : boolean extracted from public rename(src File, dst File) : boolean in class org.apache.hadoop.fs.FileSystem
- Extract Method public rename(src Path, dst Path) : boolean extracted from public testWorkingDirectory() : void in class org.apache.hadoop.fs.TestLocalFileSystem
- Extract Method private checkDest(srcName String, dstFS FileSystem, dst Path) : Path extracted from public recursiveCopy(fs FileSystem, src File, dst File, conf Configuration) : void in class org.apache.hadoop.fs.FileUtil
- Extract Method public exists(f Path) : boolean extracted from public createRaw(f File, overwrite boolean, replication short) : FSOutputStream in class org.apache.hadoop.fs.LocalFileSystem
- Extract Method public exists(f Path) : boolean extracted from public openRaw(f File) : FSInputStream in class org.apache.hadoop.fs.LocalFileSystem
- Extract Method public mkdirs(f Path) : boolean extracted from public createRaw(f File, overwrite boolean, replication short) : FSOutputStream in class org.apache.hadoop.fs.LocalFileSystem
- Extract Method public isAbsolute() : boolean extracted from private makeAbsolute(f File) : File in class org.apache.hadoop.fs.LocalFileSystem
- Extract Method public suffix(suffix String) : Path extracted from public MergePass(pass int, last boolean) in class org.apache.hadoop.io.SequenceFile.Sorter.MergePass
- Extract Method public suffix(suffix String) : Path extracted from private flush(count int, done boolean) : void in class org.apache.hadoop.io.SequenceFile.Sorter.SortPass
- Extract Method public suffix(suffix String) : Path extracted from private mergeTest(fs FileSystem, count int, seed int, file String, fast boolean, factor int, megabytes int) : void in class org.apache.hadoop.io.TestSequenceFile
- Extract Method public toString() : String extracted from protected listFiles(fs FileSystem, job JobConf) : File[] in class org.apache.hadoop.mapred.InputFormatBase
- Extract Method protected listPaths(fs FileSystem, job JobConf) : Path[] extracted from protected listFiles(fs FileSystem, job JobConf) : File[] in class org.apache.hadoop.mapred.InputFormatBase
- Extract Method public addInputPath(dir Path) : void extracted from public addInputDir(dir File) : void in class org.apache.hadoop.mapred.JobConf
- Extract Method public getLocalPath(pathString String) : Path extracted from public getLocalFile(subdir String, name String) : File in class org.apache.hadoop.mapred.JobConf
- Extract Method public getOutputPath() : Path extracted from public getOutputDir() : File in class org.apache.hadoop.mapred.JobConf
- Extract Method public setInputPath(dir Path) : void extracted from public setInputDir(dir File) : void in class org.apache.hadoop.mapred.JobConf
- Extract Method public setOutputPath(dir Path) : void extracted from public setOutputDir(dir File) : void in class org.apache.hadoop.mapred.JobConf
- Extract Method public getReaders(fs FileSystem, dir Path, conf Configuration) : MapFile.Reader[] extracted from public getReaders(fs FileSystem, dir File, conf Configuration) : MapFile.Reader[] in class org.apache.hadoop.mapred.MapFileOutputFormat
- Extract Method public getReaders(conf Configuration, dir Path) : SequenceFile.Reader[] extracted from public getReaders(conf Configuration, dir File) : SequenceFile.Reader[] in class org.apache.hadoop.mapred.SequenceFileOutputFormat
- Move Attribute package info : DFSFileInfo from class org.apache.hadoop.dfs.DFSFile to class org.apache.hadoop.dfs.DfsPath
# aed78493c189aabc1c59696bcb5d3815d135e9d7
## Classification: pos
## 2 refatorações:
- Extract Method private readBlock(in DataInputStream, op byte) : void extracted from public run() : void in class org.apache.hadoop.dfs.DataNode.DataXceiver
- Extract Method private writeBlock(in DataInputStream) : void extracted from public run() : void in class org.apache.hadoop.dfs.DataNode.DataXceiver
# 5659db7985f1f207ce033007dfd0aef492560bf7
## Classification: pos
## 5 refatorações:
- Extract Method public create(src UTF8, overwrite boolean, replication short) : FSOutputStream extracted from public create(src UTF8, overwrite boolean) : FSOutputStream in class org.apache.hadoop.dfs.DFSClient
- Extract Method package addNode(path String, newNode INode) : INode extracted from package unprotectedRenameTo(src UTF8, dst UTF8) : boolean in class org.apache.hadoop.dfs.FSDirectory
- Extract Method package getChild(name String) : INode extracted from package getNode(components Vector, index int) : INode in class org.apache.hadoop.dfs.FSDirectory.INode
- Extract Method public create(f File, overwrite boolean, bufferSize int, replication short) : FSDataOutputStream extracted from public create(f File, overwrite boolean, bufferSize int) : FSDataOutputStream in class org.apache.hadoop.fs.FileSystem
- Inline Method package unprotectedAddFile(name UTF8, blocks Block[]) : boolean inlined to package loadFSEdits(edits File, conf Configuration) : int in class org.apache.hadoop.dfs.FSDirectory
# dbccfa12b1199dcf5d03468927d29a69fa504bff
## Classification: pos
## 2 refatorações:
- Extract Method public doCopy(srcFS FileSystem, src File, dstFS FileSystem, dst File, deleteSource boolean, conf Configuration) : void extracted from private doFromLocalFile(src File, dst File, deleteSource boolean) : void in class org.apache.hadoop.dfs.DistributedFileSystem
- Extract Method public doCopy(srcFS FileSystem, src File, dstFS FileSystem, dst File, deleteSource boolean, conf Configuration) : void extracted from public copyToLocalFile(src File, dst File) : void in class org.apache.hadoop.dfs.DistributedFileSystem
# 95091af3ce3963df0c02e18df455816e686c39b4
## Classification: pos
## 1 refatorações:
- Rename Method public DF(path String) renamed to private parseExecResult(lines BufferedReader) : void in class org.apache.hadoop.fs.DF
# 4eccd587cc03ffac50badbcefb28fb95b53a0f9e
## Classification: pos
## 2 refatorações:
- Extract Method public getDataNodeStats() : DataNodeReport[] extracted from public report() : void in class org.apache.hadoop.dfs.DFSShell
- Extract Method public getUsed() : long extracted from public report() : void in class org.apache.hadoop.dfs.DFSShell
# 73be419f0070aee61d3d074cfeb5cb83461d1edf
## Classification: neg
## 1 refatorações:
- Extract Method private getDir(conf Configuration) : File extracted from public NameNode(conf Configuration) in class org.apache.hadoop.dfs.NameNode
# 2487ad9876013af7e38e7ecffebc36f3df84d481
## Classification: pos
## 3 refatorações:
- Extract Method private updateTaskTrackerStatus(trackerName String, status TaskTrackerStatus) : boolean extracted from public initialize(taskTrackerName String) : void in class org.apache.hadoop.mapred.JobTracker
- Extract Method private updateTaskTrackerStatus(trackerName String, status TaskTrackerStatus) : boolean extracted from public emitHeartbeat(trackerStatus TaskTrackerStatus, initialContact boolean) : int in class org.apache.hadoop.mapred.JobTracker
- Extract Method private updateTaskTrackerStatus(trackerName String, status TaskTrackerStatus) : boolean extracted from public run() : void in class org.apache.hadoop.mapred.JobTracker.ExpireTrackers
# 8cdc95ec9e14b11aa5138d53d3908c53625428bc
## Classification: pos
## 1 refatorações:
- Extract Method private makeAbsolute(f File) : File extracted from private getPath(file File) : UTF8 in class org.apache.hadoop.dfs.DistributedFileSystem
# aeddf7427dab0a332918f52ccf154ade93d8f081
## Classification: pos
## 1 refatorações:
- Extract Method public hashBytes(bytes byte[], length int) : int extracted from public hashCode() : int in class org.apache.hadoop.io.UTF8
# 48b7666eb0f80b8c297ce64e4843532a2149fd17
## Classification: pos
## 1 refatorações:
- Extract Method public isDir() : boolean extracted from public isDir(src UTF8) : boolean in class org.apache.hadoop.dfs.FSDirectory
# dc207a0a5aba0333967c8191f46d7556ffc9870a
## Classification: pos
## 1 refatorações:
- Rename Class org.apache.hadoop.dfs.TestDFS renamed to org.apache.hadoop.dfs.ClusterTestDFS
# a2619cc40191e4add49fd7708c0e1431699b0d42
## Classification: neg
## 2 refatorações:
- Extract Method private handleSocketException(ie IOException) : void extracted from private flushData(maxPos int) : void in class org.apache.hadoop.dfs.DFSClient.DFSOutputStream
- Extract Method private handleSocketException(ie IOException) : void extracted from private endBlock() : void in class org.apache.hadoop.dfs.DFSClient.DFSOutputStream
# 49601bd8c10b9439796c52dffcc322a56c1bcb33
## Classification: pos
## 2 refatorações:
- Extract Method package getFileCacheHints(tipID String, f File, start long, len long) : String[][] extracted from package hasTaskWithCacheHit(taskTracker String, tts TaskTrackerStatus) : boolean in class org.apache.hadoop.mapred.TaskInProgress
- Inline Method package createJob(jobFile String) : JobInProgress inlined to public submitJob(jobFile String) : JobStatus in class org.apache.hadoop.mapred.JobTracker
# e206b7a9b2dac0044d0750ba6eb56f0a1f440a83
## Classification: pos
## 4 refatorações:
- Rename Method public getMapTaskReport(jobid String) : Vector[] renamed to public getMapTaskReports(jobid String) : TaskReport[] in class org.apache.hadoop.mapred.JobTracker
- Rename Method public getReduceTaskReport(jobid String) : Vector[] renamed to public getReduceTaskReports(jobid String) : TaskReport[] in class org.apache.hadoop.mapred.JobTracker
- Rename Method public getMapTaskReport(id String) : Vector[] renamed to public getMapTaskReports(id String) : TaskReport[] in class org.apache.hadoop.mapred.LocalJobRunner
- Rename Method public getReduceTaskReport(id String) : Vector[] renamed to public getReduceTaskReports(id String) : TaskReport[] in class org.apache.hadoop.mapred.LocalJobRunner
# d02d3cdb2d3809e42283436bf714d7516e475611
## Classification: pos
## 1 refatorações:
- Move Class org.apache.hadoop.mapred.demo.Grep moved to org.apache.hadoop.examples.Grep
# 95a8baf33e064d71402ce8f94267a7eed2bf6827
## Classification: neu
## 2 refatorações:
- Extract Method public newInstance(c Class) : Writable extracted from public readObject(in DataInput, objectWritable ObjectWritable, conf Configuration) : Object in class org.apache.hadoop.io.ObjectWritable
- Extract Method public newInstance(c Class) : Writable extracted from public readFields(in DataInput) : void in class org.apache.hadoop.io.ArrayWritable
# a76b8a871eccc80f1aba475a52623901dfdacc2f
## Classification: neu
## 1 refatorações:
- Move Class org.apache.hadoop.dfs.DF moved to org.apache.hadoop.fs.DF
# b96233f9aeb39dc9be87fcb347d3803b57e4e191
## Classification: neu
## 2 refatorações:
- Extract Method private loadResources(props Properties, resources ArrayList, reverse boolean) : void extracted from private getProps() : Properties in class org.apache.hadoop.conf.Configuration
- Extract Method private toString(resources ArrayList, sb StringBuffer) : void extracted from public toString() : String in class org.apache.hadoop.conf.Configuration
