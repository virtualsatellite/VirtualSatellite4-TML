/**
 */
package de.dlr.sc.virsat.model.ext.tml.configuration.configuration.impl;

import de.dlr.sc.virsat.model.ext.core.core.impl.GenericCategoryImpl;
import de.dlr.sc.virsat.model.ext.tml.configuration.configuration.ConfigurationPackage;
import de.dlr.sc.virsat.model.ext.tml.configuration.configuration.GenerationConfiguration;
import de.dlr.sc.virsat.model.ext.tml.configuration.configuration.TaskingEnvironmentConfiguration;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Generation Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dlr.sc.virsat.model.ext.tml.configuration.configuration.impl.GenerationConfigurationImpl#getGenerationPath <em>Generation Path</em>}</li>
 *   <li>{@link de.dlr.sc.virsat.model.ext.tml.configuration.configuration.impl.GenerationConfigurationImpl#getSrcGenPath <em>Src Gen Path</em>}</li>
 *   <li>{@link de.dlr.sc.virsat.model.ext.tml.configuration.configuration.impl.GenerationConfigurationImpl#getSrcPath <em>Src Path</em>}</li>
 *   <li>{@link de.dlr.sc.virsat.model.ext.tml.configuration.configuration.impl.GenerationConfigurationImpl#getBuildGenPath <em>Build Gen Path</em>}</li>
 *   <li>{@link de.dlr.sc.virsat.model.ext.tml.configuration.configuration.impl.GenerationConfigurationImpl#getTestPath <em>Test Path</em>}</li>
 *   <li>{@link de.dlr.sc.virsat.model.ext.tml.configuration.configuration.impl.GenerationConfigurationImpl#getTaskDefinitionFolder <em>Task Definition Folder</em>}</li>
 *   <li>{@link de.dlr.sc.virsat.model.ext.tml.configuration.configuration.impl.GenerationConfigurationImpl#getChannelDefinitionFolder <em>Channel Definition Folder</em>}</li>
 *   <li>{@link de.dlr.sc.virsat.model.ext.tml.configuration.configuration.impl.GenerationConfigurationImpl#getTypeDefinitionFolder <em>Type Definition Folder</em>}</li>
 *   <li>{@link de.dlr.sc.virsat.model.ext.tml.configuration.configuration.impl.GenerationConfigurationImpl#getContribFolder <em>Contrib Folder</em>}</li>
 *   <li>{@link de.dlr.sc.virsat.model.ext.tml.configuration.configuration.impl.GenerationConfigurationImpl#getLibconfigFolder <em>Libconfig Folder</em>}</li>
 *   <li>{@link de.dlr.sc.virsat.model.ext.tml.configuration.configuration.impl.GenerationConfigurationImpl#getTaskingVersion <em>Tasking Version</em>}</li>
 *   <li>{@link de.dlr.sc.virsat.model.ext.tml.configuration.configuration.impl.GenerationConfigurationImpl#getTaskingEnvironmentConfiguration <em>Tasking Environment Configuration</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GenerationConfigurationImpl extends GenericCategoryImpl implements GenerationConfiguration {
	/**
	 * The default value of the '{@link #getGenerationPath() <em>Generation Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenerationPath()
	 * @generated
	 * @ordered
	 */
	protected static final String GENERATION_PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGenerationPath() <em>Generation Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenerationPath()
	 * @generated
	 * @ordered
	 */
	protected String generationPath = GENERATION_PATH_EDEFAULT;

	/**
	 * The default value of the '{@link #getSrcGenPath() <em>Src Gen Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSrcGenPath()
	 * @generated
	 * @ordered
	 */
	protected static final String SRC_GEN_PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSrcGenPath() <em>Src Gen Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSrcGenPath()
	 * @generated
	 * @ordered
	 */
	protected String srcGenPath = SRC_GEN_PATH_EDEFAULT;

	/**
	 * The default value of the '{@link #getSrcPath() <em>Src Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSrcPath()
	 * @generated
	 * @ordered
	 */
	protected static final String SRC_PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSrcPath() <em>Src Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSrcPath()
	 * @generated
	 * @ordered
	 */
	protected String srcPath = SRC_PATH_EDEFAULT;

	/**
	 * The default value of the '{@link #getBuildGenPath() <em>Build Gen Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBuildGenPath()
	 * @generated
	 * @ordered
	 */
	protected static final String BUILD_GEN_PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBuildGenPath() <em>Build Gen Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBuildGenPath()
	 * @generated
	 * @ordered
	 */
	protected String buildGenPath = BUILD_GEN_PATH_EDEFAULT;

	/**
	 * The default value of the '{@link #getTestPath() <em>Test Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestPath()
	 * @generated
	 * @ordered
	 */
	protected static final String TEST_PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTestPath() <em>Test Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestPath()
	 * @generated
	 * @ordered
	 */
	protected String testPath = TEST_PATH_EDEFAULT;

	/**
	 * The default value of the '{@link #getTaskDefinitionFolder() <em>Task Definition Folder</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaskDefinitionFolder()
	 * @generated
	 * @ordered
	 */
	protected static final String TASK_DEFINITION_FOLDER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTaskDefinitionFolder() <em>Task Definition Folder</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaskDefinitionFolder()
	 * @generated
	 * @ordered
	 */
	protected String taskDefinitionFolder = TASK_DEFINITION_FOLDER_EDEFAULT;

	/**
	 * The default value of the '{@link #getChannelDefinitionFolder() <em>Channel Definition Folder</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChannelDefinitionFolder()
	 * @generated
	 * @ordered
	 */
	protected static final String CHANNEL_DEFINITION_FOLDER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getChannelDefinitionFolder() <em>Channel Definition Folder</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChannelDefinitionFolder()
	 * @generated
	 * @ordered
	 */
	protected String channelDefinitionFolder = CHANNEL_DEFINITION_FOLDER_EDEFAULT;

	/**
	 * The default value of the '{@link #getTypeDefinitionFolder() <em>Type Definition Folder</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeDefinitionFolder()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_DEFINITION_FOLDER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTypeDefinitionFolder() <em>Type Definition Folder</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeDefinitionFolder()
	 * @generated
	 * @ordered
	 */
	protected String typeDefinitionFolder = TYPE_DEFINITION_FOLDER_EDEFAULT;

	/**
	 * The default value of the '{@link #getContribFolder() <em>Contrib Folder</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContribFolder()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTRIB_FOLDER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContribFolder() <em>Contrib Folder</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContribFolder()
	 * @generated
	 * @ordered
	 */
	protected String contribFolder = CONTRIB_FOLDER_EDEFAULT;

	/**
	 * The default value of the '{@link #getLibconfigFolder() <em>Libconfig Folder</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLibconfigFolder()
	 * @generated
	 * @ordered
	 */
	protected static final String LIBCONFIG_FOLDER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLibconfigFolder() <em>Libconfig Folder</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLibconfigFolder()
	 * @generated
	 * @ordered
	 */
	protected String libconfigFolder = LIBCONFIG_FOLDER_EDEFAULT;

	/**
	 * The default value of the '{@link #getTaskingVersion() <em>Tasking Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaskingVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String TASKING_VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTaskingVersion() <em>Tasking Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaskingVersion()
	 * @generated
	 * @ordered
	 */
	protected String taskingVersion = TASKING_VERSION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTaskingEnvironmentConfiguration() <em>Tasking Environment Configuration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaskingEnvironmentConfiguration()
	 * @generated
	 * @ordered
	 */
	protected TaskingEnvironmentConfiguration taskingEnvironmentConfiguration;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GenerationConfigurationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConfigurationPackage.Literals.GENERATION_CONFIGURATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getGenerationPath() {
		return generationPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGenerationPath(String newGenerationPath) {
		String oldGenerationPath = generationPath;
		generationPath = newGenerationPath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigurationPackage.GENERATION_CONFIGURATION__GENERATION_PATH, oldGenerationPath, generationPath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSrcGenPath() {
		return srcGenPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSrcGenPath(String newSrcGenPath) {
		String oldSrcGenPath = srcGenPath;
		srcGenPath = newSrcGenPath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigurationPackage.GENERATION_CONFIGURATION__SRC_GEN_PATH, oldSrcGenPath, srcGenPath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSrcPath() {
		return srcPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSrcPath(String newSrcPath) {
		String oldSrcPath = srcPath;
		srcPath = newSrcPath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigurationPackage.GENERATION_CONFIGURATION__SRC_PATH, oldSrcPath, srcPath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBuildGenPath() {
		return buildGenPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBuildGenPath(String newBuildGenPath) {
		String oldBuildGenPath = buildGenPath;
		buildGenPath = newBuildGenPath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigurationPackage.GENERATION_CONFIGURATION__BUILD_GEN_PATH, oldBuildGenPath, buildGenPath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTestPath() {
		return testPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTestPath(String newTestPath) {
		String oldTestPath = testPath;
		testPath = newTestPath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigurationPackage.GENERATION_CONFIGURATION__TEST_PATH, oldTestPath, testPath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTaskDefinitionFolder() {
		return taskDefinitionFolder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTaskDefinitionFolder(String newTaskDefinitionFolder) {
		String oldTaskDefinitionFolder = taskDefinitionFolder;
		taskDefinitionFolder = newTaskDefinitionFolder;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigurationPackage.GENERATION_CONFIGURATION__TASK_DEFINITION_FOLDER, oldTaskDefinitionFolder, taskDefinitionFolder));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getChannelDefinitionFolder() {
		return channelDefinitionFolder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setChannelDefinitionFolder(String newChannelDefinitionFolder) {
		String oldChannelDefinitionFolder = channelDefinitionFolder;
		channelDefinitionFolder = newChannelDefinitionFolder;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigurationPackage.GENERATION_CONFIGURATION__CHANNEL_DEFINITION_FOLDER, oldChannelDefinitionFolder, channelDefinitionFolder));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTypeDefinitionFolder() {
		return typeDefinitionFolder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTypeDefinitionFolder(String newTypeDefinitionFolder) {
		String oldTypeDefinitionFolder = typeDefinitionFolder;
		typeDefinitionFolder = newTypeDefinitionFolder;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigurationPackage.GENERATION_CONFIGURATION__TYPE_DEFINITION_FOLDER, oldTypeDefinitionFolder, typeDefinitionFolder));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getContribFolder() {
		return contribFolder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContribFolder(String newContribFolder) {
		String oldContribFolder = contribFolder;
		contribFolder = newContribFolder;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigurationPackage.GENERATION_CONFIGURATION__CONTRIB_FOLDER, oldContribFolder, contribFolder));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLibconfigFolder() {
		return libconfigFolder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLibconfigFolder(String newLibconfigFolder) {
		String oldLibconfigFolder = libconfigFolder;
		libconfigFolder = newLibconfigFolder;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigurationPackage.GENERATION_CONFIGURATION__LIBCONFIG_FOLDER, oldLibconfigFolder, libconfigFolder));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTaskingVersion() {
		return taskingVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTaskingVersion(String newTaskingVersion) {
		String oldTaskingVersion = taskingVersion;
		taskingVersion = newTaskingVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigurationPackage.GENERATION_CONFIGURATION__TASKING_VERSION, oldTaskingVersion, taskingVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TaskingEnvironmentConfiguration getTaskingEnvironmentConfiguration() {
		return taskingEnvironmentConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTaskingEnvironmentConfiguration(TaskingEnvironmentConfiguration newTaskingEnvironmentConfiguration, NotificationChain msgs) {
		TaskingEnvironmentConfiguration oldTaskingEnvironmentConfiguration = taskingEnvironmentConfiguration;
		taskingEnvironmentConfiguration = newTaskingEnvironmentConfiguration;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ConfigurationPackage.GENERATION_CONFIGURATION__TASKING_ENVIRONMENT_CONFIGURATION, oldTaskingEnvironmentConfiguration, newTaskingEnvironmentConfiguration);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTaskingEnvironmentConfiguration(TaskingEnvironmentConfiguration newTaskingEnvironmentConfiguration) {
		if (newTaskingEnvironmentConfiguration != taskingEnvironmentConfiguration) {
			NotificationChain msgs = null;
			if (taskingEnvironmentConfiguration != null)
				msgs = ((InternalEObject)taskingEnvironmentConfiguration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ConfigurationPackage.GENERATION_CONFIGURATION__TASKING_ENVIRONMENT_CONFIGURATION, null, msgs);
			if (newTaskingEnvironmentConfiguration != null)
				msgs = ((InternalEObject)newTaskingEnvironmentConfiguration).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ConfigurationPackage.GENERATION_CONFIGURATION__TASKING_ENVIRONMENT_CONFIGURATION, null, msgs);
			msgs = basicSetTaskingEnvironmentConfiguration(newTaskingEnvironmentConfiguration, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigurationPackage.GENERATION_CONFIGURATION__TASKING_ENVIRONMENT_CONFIGURATION, newTaskingEnvironmentConfiguration, newTaskingEnvironmentConfiguration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ConfigurationPackage.GENERATION_CONFIGURATION__TASKING_ENVIRONMENT_CONFIGURATION:
				return basicSetTaskingEnvironmentConfiguration(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ConfigurationPackage.GENERATION_CONFIGURATION__GENERATION_PATH:
				return getGenerationPath();
			case ConfigurationPackage.GENERATION_CONFIGURATION__SRC_GEN_PATH:
				return getSrcGenPath();
			case ConfigurationPackage.GENERATION_CONFIGURATION__SRC_PATH:
				return getSrcPath();
			case ConfigurationPackage.GENERATION_CONFIGURATION__BUILD_GEN_PATH:
				return getBuildGenPath();
			case ConfigurationPackage.GENERATION_CONFIGURATION__TEST_PATH:
				return getTestPath();
			case ConfigurationPackage.GENERATION_CONFIGURATION__TASK_DEFINITION_FOLDER:
				return getTaskDefinitionFolder();
			case ConfigurationPackage.GENERATION_CONFIGURATION__CHANNEL_DEFINITION_FOLDER:
				return getChannelDefinitionFolder();
			case ConfigurationPackage.GENERATION_CONFIGURATION__TYPE_DEFINITION_FOLDER:
				return getTypeDefinitionFolder();
			case ConfigurationPackage.GENERATION_CONFIGURATION__CONTRIB_FOLDER:
				return getContribFolder();
			case ConfigurationPackage.GENERATION_CONFIGURATION__LIBCONFIG_FOLDER:
				return getLibconfigFolder();
			case ConfigurationPackage.GENERATION_CONFIGURATION__TASKING_VERSION:
				return getTaskingVersion();
			case ConfigurationPackage.GENERATION_CONFIGURATION__TASKING_ENVIRONMENT_CONFIGURATION:
				return getTaskingEnvironmentConfiguration();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ConfigurationPackage.GENERATION_CONFIGURATION__GENERATION_PATH:
				setGenerationPath((String)newValue);
				return;
			case ConfigurationPackage.GENERATION_CONFIGURATION__SRC_GEN_PATH:
				setSrcGenPath((String)newValue);
				return;
			case ConfigurationPackage.GENERATION_CONFIGURATION__SRC_PATH:
				setSrcPath((String)newValue);
				return;
			case ConfigurationPackage.GENERATION_CONFIGURATION__BUILD_GEN_PATH:
				setBuildGenPath((String)newValue);
				return;
			case ConfigurationPackage.GENERATION_CONFIGURATION__TEST_PATH:
				setTestPath((String)newValue);
				return;
			case ConfigurationPackage.GENERATION_CONFIGURATION__TASK_DEFINITION_FOLDER:
				setTaskDefinitionFolder((String)newValue);
				return;
			case ConfigurationPackage.GENERATION_CONFIGURATION__CHANNEL_DEFINITION_FOLDER:
				setChannelDefinitionFolder((String)newValue);
				return;
			case ConfigurationPackage.GENERATION_CONFIGURATION__TYPE_DEFINITION_FOLDER:
				setTypeDefinitionFolder((String)newValue);
				return;
			case ConfigurationPackage.GENERATION_CONFIGURATION__CONTRIB_FOLDER:
				setContribFolder((String)newValue);
				return;
			case ConfigurationPackage.GENERATION_CONFIGURATION__LIBCONFIG_FOLDER:
				setLibconfigFolder((String)newValue);
				return;
			case ConfigurationPackage.GENERATION_CONFIGURATION__TASKING_VERSION:
				setTaskingVersion((String)newValue);
				return;
			case ConfigurationPackage.GENERATION_CONFIGURATION__TASKING_ENVIRONMENT_CONFIGURATION:
				setTaskingEnvironmentConfiguration((TaskingEnvironmentConfiguration)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ConfigurationPackage.GENERATION_CONFIGURATION__GENERATION_PATH:
				setGenerationPath(GENERATION_PATH_EDEFAULT);
				return;
			case ConfigurationPackage.GENERATION_CONFIGURATION__SRC_GEN_PATH:
				setSrcGenPath(SRC_GEN_PATH_EDEFAULT);
				return;
			case ConfigurationPackage.GENERATION_CONFIGURATION__SRC_PATH:
				setSrcPath(SRC_PATH_EDEFAULT);
				return;
			case ConfigurationPackage.GENERATION_CONFIGURATION__BUILD_GEN_PATH:
				setBuildGenPath(BUILD_GEN_PATH_EDEFAULT);
				return;
			case ConfigurationPackage.GENERATION_CONFIGURATION__TEST_PATH:
				setTestPath(TEST_PATH_EDEFAULT);
				return;
			case ConfigurationPackage.GENERATION_CONFIGURATION__TASK_DEFINITION_FOLDER:
				setTaskDefinitionFolder(TASK_DEFINITION_FOLDER_EDEFAULT);
				return;
			case ConfigurationPackage.GENERATION_CONFIGURATION__CHANNEL_DEFINITION_FOLDER:
				setChannelDefinitionFolder(CHANNEL_DEFINITION_FOLDER_EDEFAULT);
				return;
			case ConfigurationPackage.GENERATION_CONFIGURATION__TYPE_DEFINITION_FOLDER:
				setTypeDefinitionFolder(TYPE_DEFINITION_FOLDER_EDEFAULT);
				return;
			case ConfigurationPackage.GENERATION_CONFIGURATION__CONTRIB_FOLDER:
				setContribFolder(CONTRIB_FOLDER_EDEFAULT);
				return;
			case ConfigurationPackage.GENERATION_CONFIGURATION__LIBCONFIG_FOLDER:
				setLibconfigFolder(LIBCONFIG_FOLDER_EDEFAULT);
				return;
			case ConfigurationPackage.GENERATION_CONFIGURATION__TASKING_VERSION:
				setTaskingVersion(TASKING_VERSION_EDEFAULT);
				return;
			case ConfigurationPackage.GENERATION_CONFIGURATION__TASKING_ENVIRONMENT_CONFIGURATION:
				setTaskingEnvironmentConfiguration((TaskingEnvironmentConfiguration)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ConfigurationPackage.GENERATION_CONFIGURATION__GENERATION_PATH:
				return GENERATION_PATH_EDEFAULT == null ? generationPath != null : !GENERATION_PATH_EDEFAULT.equals(generationPath);
			case ConfigurationPackage.GENERATION_CONFIGURATION__SRC_GEN_PATH:
				return SRC_GEN_PATH_EDEFAULT == null ? srcGenPath != null : !SRC_GEN_PATH_EDEFAULT.equals(srcGenPath);
			case ConfigurationPackage.GENERATION_CONFIGURATION__SRC_PATH:
				return SRC_PATH_EDEFAULT == null ? srcPath != null : !SRC_PATH_EDEFAULT.equals(srcPath);
			case ConfigurationPackage.GENERATION_CONFIGURATION__BUILD_GEN_PATH:
				return BUILD_GEN_PATH_EDEFAULT == null ? buildGenPath != null : !BUILD_GEN_PATH_EDEFAULT.equals(buildGenPath);
			case ConfigurationPackage.GENERATION_CONFIGURATION__TEST_PATH:
				return TEST_PATH_EDEFAULT == null ? testPath != null : !TEST_PATH_EDEFAULT.equals(testPath);
			case ConfigurationPackage.GENERATION_CONFIGURATION__TASK_DEFINITION_FOLDER:
				return TASK_DEFINITION_FOLDER_EDEFAULT == null ? taskDefinitionFolder != null : !TASK_DEFINITION_FOLDER_EDEFAULT.equals(taskDefinitionFolder);
			case ConfigurationPackage.GENERATION_CONFIGURATION__CHANNEL_DEFINITION_FOLDER:
				return CHANNEL_DEFINITION_FOLDER_EDEFAULT == null ? channelDefinitionFolder != null : !CHANNEL_DEFINITION_FOLDER_EDEFAULT.equals(channelDefinitionFolder);
			case ConfigurationPackage.GENERATION_CONFIGURATION__TYPE_DEFINITION_FOLDER:
				return TYPE_DEFINITION_FOLDER_EDEFAULT == null ? typeDefinitionFolder != null : !TYPE_DEFINITION_FOLDER_EDEFAULT.equals(typeDefinitionFolder);
			case ConfigurationPackage.GENERATION_CONFIGURATION__CONTRIB_FOLDER:
				return CONTRIB_FOLDER_EDEFAULT == null ? contribFolder != null : !CONTRIB_FOLDER_EDEFAULT.equals(contribFolder);
			case ConfigurationPackage.GENERATION_CONFIGURATION__LIBCONFIG_FOLDER:
				return LIBCONFIG_FOLDER_EDEFAULT == null ? libconfigFolder != null : !LIBCONFIG_FOLDER_EDEFAULT.equals(libconfigFolder);
			case ConfigurationPackage.GENERATION_CONFIGURATION__TASKING_VERSION:
				return TASKING_VERSION_EDEFAULT == null ? taskingVersion != null : !TASKING_VERSION_EDEFAULT.equals(taskingVersion);
			case ConfigurationPackage.GENERATION_CONFIGURATION__TASKING_ENVIRONMENT_CONFIGURATION:
				return taskingEnvironmentConfiguration != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (generationPath: ");
		result.append(generationPath);
		result.append(", srcGenPath: ");
		result.append(srcGenPath);
		result.append(", srcPath: ");
		result.append(srcPath);
		result.append(", buildGenPath: ");
		result.append(buildGenPath);
		result.append(", testPath: ");
		result.append(testPath);
		result.append(", taskDefinitionFolder: ");
		result.append(taskDefinitionFolder);
		result.append(", channelDefinitionFolder: ");
		result.append(channelDefinitionFolder);
		result.append(", typeDefinitionFolder: ");
		result.append(typeDefinitionFolder);
		result.append(", contribFolder: ");
		result.append(contribFolder);
		result.append(", libconfigFolder: ");
		result.append(libconfigFolder);
		result.append(", taskingVersion: ");
		result.append(taskingVersion);
		result.append(')');
		return result.toString();
	}

} //GenerationConfigurationImpl
