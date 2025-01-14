package faang.school.projectservice.repository;

import faang.school.projectservice.jpa.ProjectJpaRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class ProjectRepositoryTest {
    @Mock
    private ProjectJpaRepository projectJpaRepository;
    @InjectMocks
    private ProjectRepository repository;
    @BeforeEach
    void setUp() {
    }

    @Test
    public void testInvalidId() {

    }
}