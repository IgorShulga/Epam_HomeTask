# HomeTaskIO
Implement console CRUD application that has next entities:
Developer
Skill
Account
AccountStatus (enum ACTIVE, BANNED, DELETED)

Developer -> Set<Skill> skills + Account account
Account -> AccountStatus

Use text files as a storage:
developers.txt, skills.txt, accounts.txt

User should be able to create, read, update and delete data.

Layers:
model - POJO classes
repository - classes that provide access to text files controller - user’s requests handling
view - all data that are required for user/console interaction.

Example: Developer, DeveloperRepository, DeveloperController, DeveloperView и т.д.


Try to use basic interface for repository layer:
interface GenericRepository<T,ID>

interface DeveloperRepository extends GenericRepository<Developer, Long>

class JavaIODeveloperRepositoryImpl implements DeveloperRepository
