CREATE TABLE `mhs` (
  `nim` varchar(10) NOT NULL,
  `nama` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

INSERT INTO `mhs` (`nim`, `nama`) VALUES
('1', 'Adi'),
('10', 'Syarif'),
('2', 'Budi'),
('3', 'Cicil'),
('4', 'Dzaky'),
('5', 'Edo'),
('6', 'Fero'),
('7', 'Galih'),
('8', 'Hadi'),
('9', 'Yanto');

ALTER TABLE `mhs`
  ADD PRIMARY KEY (`nim`);
COMMIT;
