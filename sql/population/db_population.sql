INSERT INTO File(fileID, parentID, name, directory, extension)
VALUES (1, NULL, 'Task', 'C:\Users\k.stoyanova\Desktop', NULL)

INSERT INTO File(fileID, parentID, name, directory, extension)
VALUES(2, 1, 'Kalina', 'C:\Users\k.stoyanova\Desktop\Task', NULL)

INSERT INTO File(fileID, parentID, name, directory, extension)
VALUES(3, 2, 'JavaIntro', 'C:\Users\k.stoyanova\Desktop\Task\Kalina', NULL)

INSERT INTO File(fileID, parentID, name, directory, extension)
VALUES(4, 2, 'JavaTask', 'C:\Users\k.stoyanova\Desktop\Task\Kalina', NULL)

INSERT INTO File(fileID, parentID, name, directory, extension)
VALUES(5, 3, 'Introduction-to-Programing-with-Java-Book-v2014', 'C:\Users\k.stoyanova\Desktop\Task\Kalina\JavaIntro', 'pdf')

INSERT INTO File(fileID, parentID, name, directory, extension)
VALUES(6, 3, 'FolderScanner', 'C:\Users\k.stoyanova\Desktop\Task\Kalina\JavaTask', 'txt')