package com.pb.client.layouts.components.permissions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.pb.client.layouts.components.permissions.PermissionConstants.ProgramTab;
import com.pb.nodes.PermissionsRecord;
import com.smartgwt.client.types.Alignment;
import com.smartgwt.client.types.Cursor;
import com.smartgwt.client.types.Overflow;
import com.smartgwt.client.types.Side;
import com.smartgwt.client.types.SortArrow;
import com.smartgwt.client.types.VerticalAlignment;
import com.smartgwt.client.widgets.Canvas;
import com.smartgwt.client.widgets.ImgButton;
import com.smartgwt.client.widgets.Label;
import com.smartgwt.client.widgets.events.DoubleClickEvent;
import com.smartgwt.client.widgets.events.DoubleClickHandler;
import com.smartgwt.client.widgets.grid.ListGrid;
import com.smartgwt.client.widgets.grid.ListGridField;
import com.smartgwt.client.widgets.grid.ListGridRecord;
import com.smartgwt.client.widgets.layout.HLayout;
import com.smartgwt.client.widgets.layout.VLayout;
import com.smartgwt.client.widgets.tab.Tab;
import com.smartgwt.client.widgets.tab.TabSet;

public class ProgramPermissions {

    // Layout for each Tab
    public static VLayout draftLayout;
    public static VLayout activeLayout;
    public static VLayout closedLayout;
    public static VLayout archivedLayout;
    public static VLayout deletedLayout;

    // Tabs of this object
    public static Tab draftTab = new Tab();
    public static Tab activeTab = new Tab();
    public static Tab closedTab = new Tab();
    public static Tab archivedTab = new Tab();
    public static Tab deletedTab = new Tab();

    // ListGrids of this object
    public static ListGrid draftListGrid;
    public static ListGrid activeListGrid;
    public static ListGrid closedListGrid;
    public static ListGrid archivedListGrid;
    public static ListGrid deletedListGrid;

    // All records of ListGridRecord
    public static List<ListGridRecord> draftListRecordCreate = new ArrayList<>();
    public static List<ListGridRecord> draftListRecordRead = new ArrayList<>();
    public static List<ListGridRecord> draftListRecordUpdate = new ArrayList<>();
    public static List<ListGridRecord> draftListRecordDelete = new ArrayList<>();
    public static List<ListGridRecord> draftListRecordSubmitToWF = new ArrayList<>();

    public static List<ListGridRecord> activeListRecordCreate = new ArrayList<>();
    public static List<ListGridRecord> activeListRecordRead = new ArrayList<>();
    public static List<ListGridRecord> activeListRecordUpdate = new ArrayList<>();
    public static List<ListGridRecord> activeListRecordDelete = new ArrayList<>();
    public static List<ListGridRecord> activeListRecordSubmitToWF = new ArrayList<>();

    public static List<ListGridRecord> closedListRecordCreate = new ArrayList<>();
    public static List<ListGridRecord> closedListRecordRead = new ArrayList<>();
    public static List<ListGridRecord> closedListRecordUpdate = new ArrayList<>();
    public static List<ListGridRecord> closedListRecordDelete = new ArrayList<>();
    public static List<ListGridRecord> closedListRecordSubmitToWF = new ArrayList<>();

    public static List<ListGridRecord> archivedListRecordCreate = new ArrayList<>();
    public static List<ListGridRecord> archivedListRecordRead = new ArrayList<>();
    public static List<ListGridRecord> archivedListRecordUpdate = new ArrayList<>();
    public static List<ListGridRecord> archivedListRecordDelete = new ArrayList<>();
    public static List<ListGridRecord> archivedListRecordSubmitToWF = new ArrayList<>();

    public static List<ListGridRecord> deletedListRecordCreate = new ArrayList<>();
    public static List<ListGridRecord> deletedListRecordRead = new ArrayList<>();
    public static List<ListGridRecord> deletedListRecordUpdate = new ArrayList<>();
    public static List<ListGridRecord> deletedListRecordDelete = new ArrayList<>();
    public static List<ListGridRecord> deletedListRecordSubmitToWF = new ArrayList<>();

    public static ListGridRecord[] draftPermissions = new ListGridRecord[] {
            new PermissionsRecord(PermissionConstants.TAB_PROGRAM_HEADER, new HashMap<>(), new HashMap<>(), new HashMap<>(), new HashMap<>(), new HashMap<>()),
            new PermissionsRecord(PermissionConstants.TAB_PROGRAM_DASHBOARD, new HashMap<>(), new HashMap<>(), new HashMap<>(), new HashMap<>(), new HashMap<>()),
            new PermissionsRecord(PermissionConstants.TAB_PROGRAM_HISTORY, new HashMap<>(), new HashMap<>(), new HashMap<>(), new HashMap<>(), new HashMap<>()),
            new PermissionsRecord(PermissionConstants.TAB_PROGRAM_DOCUMENTS, new HashMap<>(), new HashMap<>(), new HashMap<>(), new HashMap<>(), new HashMap<>()) };

    public static ListGridRecord[] activePermissions = new ListGridRecord[] {
            new PermissionsRecord(PermissionConstants.TAB_PROGRAM_HEADER, new HashMap<>(), new HashMap<>(), new HashMap<>(), new HashMap<>(), new HashMap<>()),
            new PermissionsRecord(PermissionConstants.TAB_PROGRAM_DASHBOARD, new HashMap<>(), new HashMap<>(), new HashMap<>(), new HashMap<>(), new HashMap<>()),
            new PermissionsRecord(PermissionConstants.TAB_PROGRAM_HISTORY, new HashMap<>(), new HashMap<>(), new HashMap<>(), new HashMap<>(), new HashMap<>()),
            new PermissionsRecord(PermissionConstants.TAB_PROGRAM_DOCUMENTS, new HashMap<>(), new HashMap<>(), new HashMap<>(), new HashMap<>(), new HashMap<>()) };

    public static ListGridRecord[] closedPermissions = new ListGridRecord[] {
            new PermissionsRecord(PermissionConstants.TAB_PROGRAM_HEADER, new HashMap<>(), new HashMap<>(), new HashMap<>(), new HashMap<>(), new HashMap<>()),
            new PermissionsRecord(PermissionConstants.TAB_PROGRAM_DASHBOARD, new HashMap<>(), new HashMap<>(), new HashMap<>(), new HashMap<>(), new HashMap<>()),
            new PermissionsRecord(PermissionConstants.TAB_PROGRAM_HISTORY, new HashMap<>(), new HashMap<>(), new HashMap<>(), new HashMap<>(), new HashMap<>()),
            new PermissionsRecord(PermissionConstants.TAB_PROGRAM_DOCUMENTS, new HashMap<>(), new HashMap<>(), new HashMap<>(), new HashMap<>(), new HashMap<>()) };

    public static ListGridRecord[] archivedPermissions = new ListGridRecord[] {
            new PermissionsRecord(PermissionConstants.TAB_PROGRAM_HEADER, new HashMap<>(), new HashMap<>(), new HashMap<>(), new HashMap<>(), new HashMap<>()),
            new PermissionsRecord(PermissionConstants.TAB_PROGRAM_DASHBOARD, new HashMap<>(), new HashMap<>(), new HashMap<>(), new HashMap<>(), new HashMap<>()),
            new PermissionsRecord(PermissionConstants.TAB_PROGRAM_HISTORY, new HashMap<>(), new HashMap<>(), new HashMap<>(), new HashMap<>(), new HashMap<>()),
            new PermissionsRecord(PermissionConstants.TAB_PROGRAM_DOCUMENTS, new HashMap<>(), new HashMap<>(), new HashMap<>(), new HashMap<>(), new HashMap<>()) };

    public static ListGridRecord[] deletedPermissions = new ListGridRecord[] {
            new PermissionsRecord(PermissionConstants.TAB_PROGRAM_HEADER, new HashMap<>(), new HashMap<>(), new HashMap<>(), new HashMap<>(), new HashMap<>()),
            new PermissionsRecord(PermissionConstants.TAB_PROGRAM_DASHBOARD, new HashMap<>(), new HashMap<>(), new HashMap<>(), new HashMap<>(), new HashMap<>()),
            new PermissionsRecord(PermissionConstants.TAB_PROGRAM_HISTORY, new HashMap<>(), new HashMap<>(), new HashMap<>(), new HashMap<>(), new HashMap<>()),
            new PermissionsRecord(PermissionConstants.TAB_PROGRAM_DOCUMENTS, new HashMap<>(), new HashMap<>(), new HashMap<>(), new HashMap<>(), new HashMap<>()) };

    public static boolean draftLoadedData = false;
    public static boolean activeLoadedData = false;
    public static boolean closedLoadedData = false;
    public static boolean archivedLoadedData = false;
    public static boolean deletedLoadedData = false;

    public static void removeRecordsHistory() {
        draftListRecordCreate.clear();
        draftListRecordRead.clear();
        draftListRecordUpdate.clear();
        draftListRecordDelete.clear();
        draftListRecordSubmitToWF.clear();

        activeListRecordCreate.clear();
        activeListRecordRead.clear();
        activeListRecordUpdate.clear();
        activeListRecordDelete.clear();
        activeListRecordSubmitToWF.clear();

        closedListRecordCreate.clear();
        closedListRecordRead.clear();
        closedListRecordUpdate.clear();
        closedListRecordDelete.clear();
        closedListRecordSubmitToWF.clear();

        archivedListRecordCreate.clear();
        archivedListRecordRead.clear();
        archivedListRecordUpdate.clear();
        archivedListRecordDelete.clear();
        archivedListRecordSubmitToWF.clear();

        deletedListRecordCreate.clear();
        deletedListRecordRead.clear();
        deletedListRecordUpdate.clear();
        deletedListRecordDelete.clear();
        deletedListRecordSubmitToWF.clear();
    }

    public static TabSet setPropertyTabSet(TabSet programTabSet) {
        programTabSet.setTabBarPosition(Side.TOP);
        programTabSet.setTabBarAlign(Side.LEFT);
        programTabSet.setStyleName("whitebg");
        programTabSet.setWidth100();
        programTabSet.setHeight100();
        programTabSet.addTab(getDraftTabLayout(PermissionConstants.ProgramTab.DRAFT));
        programTabSet.addTab(getActiveTabLayout(PermissionConstants.ProgramTab.ACTIVE));
        programTabSet.addTab(getClosedTabLayout(PermissionConstants.ProgramTab.CLOSED));
        programTabSet.addTab(getArchivedTabLayout(PermissionConstants.ProgramTab.ARCHIVED));
        programTabSet.addTab(getDeletedTabLayout(PermissionConstants.ProgramTab.DELETED));
        return programTabSet;
    }

    public static void updateDataToCellProgramObject(ListGridRecord record, Integer colNum, HashMap<String, List<String>> selectedMap, String tabName) {
        if (tabName.equals(PermissionConstants.ProgramTab.DRAFT)) {
            processingUpdateDataToCell(record, colNum, selectedMap, draftListGrid);
        } else if (tabName.equals(PermissionConstants.ProgramTab.ACTIVE)) {
            processingUpdateDataToCell(record, colNum, selectedMap, activeListGrid);
        } else if (tabName.equals(PermissionConstants.ProgramTab.CLOSED)) {
            processingUpdateDataToCell(record, colNum, selectedMap, closedListGrid);
        } else if (tabName.equals(PermissionConstants.ProgramTab.ARCHIVED)) {
            processingUpdateDataToCell(record, colNum, selectedMap, archivedListGrid);
        } else if (tabName.equals(PermissionConstants.ProgramTab.DELETED)) {
            processingUpdateDataToCell(record, colNum, selectedMap, deletedListGrid);
        }
    }

    public static void processingUpdateDataToCell(ListGridRecord record, Integer colNum, HashMap<String, List<String>> selectedMap, ListGrid listGrid) {
        int rowNum = listGrid.getRecordIndex(record);
        String action = Permissions.getActionByCol(colNum);
        record.setAttribute(action, selectedMap);
        listGrid.refreshRecordComponent(rowNum, colNum);
    }

    public static String getProgramTabNameByIndex(int index) {
        if (index == 0) {
            return PermissionConstants.ProgramTab.DRAFT;
        } else if (index == 1) {
            return PermissionConstants.ProgramTab.ACTIVE;
        } else if (index == 2) {
            return PermissionConstants.ProgramTab.CLOSED;
        } else if (index == 3) {
            return PermissionConstants.ProgramTab.ARCHIVED;
        }
        return PermissionConstants.ProgramTab.DELETED;
    }

    public static void saveProgramProcessing() {
        // Draft tab
        Permissions.savePermissionForParticularTab(draftListRecordCreate, PermissionsRecord.ATTRIBUTE_CREATE, ProgramTab.DRAFT);
        Permissions.savePermissionForParticularTab(draftListRecordRead, PermissionsRecord.ATTRIBUTE_READ, ProgramTab.DRAFT);
        Permissions.savePermissionForParticularTab(draftListRecordUpdate, PermissionsRecord.ATTRIBUTE_UPDATE, ProgramTab.DRAFT);
        Permissions.savePermissionForParticularTab(draftListRecordDelete, PermissionsRecord.ATTRIBUTE_DELETE, ProgramTab.DRAFT);
        Permissions.savePermissionForParticularTab(draftListRecordSubmitToWF, PermissionsRecord.ATTRIBUTE_SUBMIT_TO_WF, ProgramTab.DRAFT);

        // Active tab
        Permissions.savePermissionForParticularTab(activeListRecordCreate, PermissionsRecord.ATTRIBUTE_CREATE, ProgramTab.ACTIVE);
        Permissions.savePermissionForParticularTab(activeListRecordRead, PermissionsRecord.ATTRIBUTE_READ, ProgramTab.ACTIVE);
        Permissions.savePermissionForParticularTab(activeListRecordUpdate, PermissionsRecord.ATTRIBUTE_UPDATE, ProgramTab.ACTIVE);
        Permissions.savePermissionForParticularTab(activeListRecordDelete, PermissionsRecord.ATTRIBUTE_DELETE, ProgramTab.ACTIVE);
        Permissions.savePermissionForParticularTab(activeListRecordSubmitToWF, PermissionsRecord.ATTRIBUTE_SUBMIT_TO_WF, ProgramTab.ACTIVE);

        // Closed tab
        Permissions.savePermissionForParticularTab(closedListRecordCreate, PermissionsRecord.ATTRIBUTE_CREATE, ProgramTab.CLOSED);
        Permissions.savePermissionForParticularTab(closedListRecordRead, PermissionsRecord.ATTRIBUTE_READ, ProgramTab.CLOSED);
        Permissions.savePermissionForParticularTab(closedListRecordUpdate, PermissionsRecord.ATTRIBUTE_UPDATE, ProgramTab.CLOSED);
        Permissions.savePermissionForParticularTab(closedListRecordDelete, PermissionsRecord.ATTRIBUTE_DELETE, ProgramTab.CLOSED);
        Permissions.savePermissionForParticularTab(closedListRecordSubmitToWF, PermissionsRecord.ATTRIBUTE_SUBMIT_TO_WF, ProgramTab.CLOSED);

        // Archived tab
        Permissions.savePermissionForParticularTab(archivedListRecordCreate, PermissionsRecord.ATTRIBUTE_CREATE, ProgramTab.ARCHIVED);
        Permissions.savePermissionForParticularTab(archivedListRecordRead, PermissionsRecord.ATTRIBUTE_READ, ProgramTab.ARCHIVED);
        Permissions.savePermissionForParticularTab(archivedListRecordUpdate, PermissionsRecord.ATTRIBUTE_UPDATE, ProgramTab.ARCHIVED);
        Permissions.savePermissionForParticularTab(archivedListRecordDelete, PermissionsRecord.ATTRIBUTE_DELETE, ProgramTab.ARCHIVED);
        Permissions.savePermissionForParticularTab(archivedListRecordSubmitToWF, PermissionsRecord.ATTRIBUTE_SUBMIT_TO_WF, ProgramTab.ARCHIVED);

        // Deleted tab
        Permissions.savePermissionForParticularTab(deletedListRecordCreate, PermissionsRecord.ATTRIBUTE_CREATE, ProgramTab.DELETED);
        Permissions.savePermissionForParticularTab(deletedListRecordRead, PermissionsRecord.ATTRIBUTE_READ, ProgramTab.DELETED);
        Permissions.savePermissionForParticularTab(deletedListRecordUpdate, PermissionsRecord.ATTRIBUTE_UPDATE, ProgramTab.DELETED);
        Permissions.savePermissionForParticularTab(deletedListRecordDelete, PermissionsRecord.ATTRIBUTE_DELETE, ProgramTab.DELETED);
        Permissions.savePermissionForParticularTab(deletedListRecordSubmitToWF, PermissionsRecord.ATTRIBUTE_SUBMIT_TO_WF, ProgramTab.DELETED);
    }
    
    public static void saveHistorySelected(String tabName, HashMap<String, List<String>> selectedMap){
        ProgramPermissions.updateDataToCellProgramObject(Permissions.clickedRowRecord, Permissions.clickedCol, selectedMap, tabName);

        // Processing to get newest select roles, user, user teams
        if (tabName.equals(ProgramTab.DRAFT)) {
            Permissions.getRecordSelectedRealTime(Permissions.clickedCol, draftListRecordCreate, draftListRecordRead, draftListRecordUpdate, draftListRecordDelete,
                    draftListRecordSubmitToWF);
        } else if (tabName.equals(ProgramTab.ACTIVE)) {
            Permissions.getRecordSelectedRealTime(Permissions.clickedCol, activeListRecordCreate, activeListRecordRead, activeListRecordUpdate, activeListRecordDelete,
                    activeListRecordSubmitToWF);
        } else if (tabName.equals(ProgramTab.CLOSED)) {
            Permissions.getRecordSelectedRealTime(Permissions.clickedCol, closedListRecordCreate, closedListRecordRead, closedListRecordUpdate, closedListRecordDelete,
                    closedListRecordSubmitToWF);
        } else if (tabName.equals(ProgramTab.ARCHIVED)) {
            Permissions.getRecordSelectedRealTime(Permissions.clickedCol, archivedListRecordCreate, archivedListRecordRead, archivedListRecordUpdate, archivedListRecordDelete,
                    archivedListRecordSubmitToWF);
        } else if (tabName.equals(ProgramTab.DELETED)) {
            Permissions.getRecordSelectedRealTime(Permissions.clickedCol, deletedListRecordCreate, deletedListRecordRead, deletedListRecordUpdate, deletedListRecordDelete,
                    deletedListRecordSubmitToWF);
        }
    }
    
    public static boolean selectedDataTabChanged(List<ListGridRecord> listRecordCreate, List<ListGridRecord> listRecordRead,
            List<ListGridRecord> listRecordUpdate, List<ListGridRecord> listRecordDelete, List<ListGridRecord> listRecordSubmitToWF) {
        if (listRecordCreate.size() != 0 || listRecordRead.size() != 0 || listRecordUpdate.size() != 0 || listRecordDelete.size() != 0 || listRecordSubmitToWF.size() != 0) {
            return true;
        }
        return false;
    }
    
    public static void loadExistedDataListGridFromObjectAndTab(String objectType, String tabName, String action, HashMap<String, List<String>> selectedMap){
        int row = getRowBySubElement(objectType);
        if (tabName.equals(ProgramTab.DRAFT)) {
            draftPermissions[row].setAttribute(action, selectedMap);
            draftListGrid.setData(draftPermissions);
        } else if (tabName.equals(ProgramTab.ACTIVE)) {
            activePermissions[row].setAttribute(action, selectedMap);
            activeListGrid.setData(activePermissions);
        } else if (tabName.equals(ProgramTab.CLOSED)) {
            closedPermissions[row].setAttribute(action, selectedMap);
            closedListGrid.setData(closedPermissions);
        } else if (tabName.equals(ProgramTab.ARCHIVED)) {
            archivedPermissions[row].setAttribute(action, selectedMap);
            archivedListGrid.setData(archivedPermissions);
        } else if (tabName.equals(ProgramTab.DELETED)) {
            deletedPermissions[row].setAttribute(action, selectedMap);
            deletedListGrid.setData(deletedPermissions);
        }
    }
    
    public static void loadEmptyDataListGridFromObjectAndTab(String tabName){
        if (tabName.equals(ProgramTab.DRAFT)) {
            draftListGrid.setData(draftPermissions);
        } else if (tabName.equals(ProgramTab.ACTIVE)) {
            activeListGrid.setData(activePermissions);
        } else if (tabName.equals(ProgramTab.CLOSED)) {
            closedListGrid.setData(closedPermissions);
        } else if (tabName.equals(ProgramTab.ARCHIVED)) {
            archivedListGrid.setData(archivedPermissions);
        } else if (tabName.equals(ProgramTab.DELETED)) {
            deletedListGrid.setData(deletedPermissions);
        }
    }

    public static int getRowBySubElement(String subElement) {
        if (subElement.equals(PermissionConstants.TAB_PROGRAM_HEADER)) {
            return 0;
        } else if (subElement.equals(PermissionConstants.TAB_PROGRAM_DASHBOARD)) {
            return 1;
        } else if (subElement.equals(PermissionConstants.TAB_PROGRAM_DOCUMENTS)) {
            return 2;
        } else if (subElement.equals(PermissionConstants.TAB_PROGRAM_HISTORY)) {
            return 3;
        }
        return -1;
    }

    public static Tab getDraftTabLayout(String tabName) {
        // DEFINE DRAFT CONTENT
        draftLayout = new VLayout();
        draftLayout.setWidth100();
        draftLayout.setHeight100();
        draftLayout.setOverflow(Overflow.VISIBLE);
        draftLayout.setStyleName("whitebg");
        draftLayout.setPadding(17);

        draftListGrid = new ListGrid() {
            @Override
            protected Canvas createRecordComponent(ListGridRecord record, Integer colNum) {

                Canvas cellWrapper;
                VLayout cellLayout;

                if (this.getFieldName(colNum).equals(PermissionsRecord.ATTRIBUTE_SUB_ELEMENT)) {
                    cellWrapper = new Canvas();
                    cellWrapper.setHeight100();
                    cellWrapper.setWidth100();
                    cellWrapper.setBackgroundColor("#efefef");
                    cellWrapper.setBorder("solid #ced2d3 1px;");
                    cellWrapper.setOverflow(Overflow.HIDDEN);
                    Label label = new Label();
                    label.setPadding(2);
                    label.setWidth100();
                    label.setHeight100();
                    label.setLayoutAlign(VerticalAlignment.CENTER);
                    label.setContents(record.getAttributeAsString(PermissionsRecord.ATTRIBUTE_SUB_ELEMENT));

                    setIconForSubObjectLabelOfTab(record.getAttributeAsString(PermissionsRecord.ATTRIBUTE_SUB_ELEMENT), label);

                    cellWrapper.addChild(label);
                    return cellWrapper;
                }

                cellWrapper = new Canvas();
                cellWrapper.setOverflow(Overflow.AUTO);
                cellWrapper.setBorder("solid #ced2d3 1px;");
                cellWrapper.setHeight100();
                cellWrapper.setWidth100();

                cellLayout = new VLayout();
                cellLayout.setOverflow(Overflow.VISIBLE);
                cellLayout.setCursor(Cursor.POINTER);
                cellLayout.setHeight100();
                cellLayout.setWidth100();

                cellLayout.addDoubleClickHandler(new DoubleClickHandler() {
                    @Override
                    public void onDoubleClick(DoubleClickEvent event) {
                        openUpdatePermissionWindow(record, colNum, tabName);
                    }
                });

                Map<String, List<String>> selectedMap = record.getAttributeAsMap(Permissions.getActionByCol(colNum));

                if (selectedMap.size() > 0) {
                    Permissions.updateCellLayout(cellLayout, record, colNum);
                    Permissions.updateCellWrapper(cellWrapper, selectedMap);
                }

                cellWrapper.addChild(cellLayout);
                return cellWrapper;
            }
        };

        draftListGrid.setWidth100();
        draftListGrid.setHeight100();
        draftListGrid.setHeaderHeight(29);
        draftListGrid.setCellHeight(80);
        draftListGrid.setShowRecordComponents(true);
        draftListGrid.setShowRecordComponentsByCell(true);
        draftListGrid.setCanSelectCells(true);
        draftListGrid.setWrapCells(true);

        draftListGrid.setShowRollOver(false);
        draftListGrid.setUseCellRollOvers(false);
        draftListGrid.setAnimateRollOver(false);
        draftListGrid.setAlternateFieldStyles(false);
        draftListGrid.setAlternateRecordStyles(false);
        draftListGrid.setAlwaysShowScrollbars(false);

        draftListGrid.setShowSortArrow(SortArrow.NONE);
        draftListGrid.setShowHeaderContextMenu(false);
        draftListGrid.setShowHeaderMenuButton(false);
        draftListGrid.setSelectHeaderOnSort(false);

        draftListGrid.setOverflow(Overflow.VISIBLE);

        ListGridField subElement = new ListGridField(PermissionsRecord.ATTRIBUTE_SUB_ELEMENT, "");
        subElement.setCanSort(false);
        subElement.setDisplayValueFromRecord(true);
        subElement.setWidth("15%");
        ListGridField createField = new ListGridField("createField", "Create");
        createField.setCanSort(false);
        createField.setWidth("15%");
        ListGridField readField = new ListGridField("readField", "Read");
        readField.setCanSort(false);
        readField.setWidth("15%");
        ListGridField updateField = new ListGridField("updateField", "Update");
        updateField.setCanSort(false);
        updateField.setWidth("15%");
        ListGridField deleteField = new ListGridField("deleteField", "Delete");
        deleteField.setCanSort(false);
        deleteField.setWidth("15%");
        ListGridField submitField = new ListGridField("submitField", "Submit to WF");
        submitField.setCanSort(false);
        submitField.setWidth("15%");

        draftListGrid.setFields(subElement, createField, readField, updateField, deleteField, submitField);

        draftLayout.addMember(draftListGrid);

        draftTab = new Tab(tabName);
        draftTab.setPane(draftLayout);

        return draftTab;
    }

    public static Tab getActiveTabLayout(String tabName) {
        // DEFINE DRAFT CONTENT
        activeLayout = new VLayout();
        activeLayout.setWidth100();
        activeLayout.setHeight100();
        activeLayout.setOverflow(Overflow.VISIBLE);
        activeLayout.setStyleName("whitebg");
        activeLayout.setPadding(17);

        activeListGrid = new ListGrid() {
            @Override
            protected Canvas createRecordComponent(ListGridRecord record, Integer colNum) {

                Canvas cellWrapper;
                VLayout cellLayout;

                if (this.getFieldName(colNum).equals(PermissionsRecord.ATTRIBUTE_SUB_ELEMENT)) {
                    cellWrapper = new Canvas();
                    cellWrapper.setHeight100();
                    cellWrapper.setWidth100();
                    // cellWrapper.disable();
                    cellWrapper.setBackgroundColor("#efefef");
                    cellWrapper.setBorder("solid #ced2d3 1px;");
                    Label label = new Label();
                    label.setPadding(2);
                    label.setWidth100();
                    label.setHeight100();
                    label.setLayoutAlign(VerticalAlignment.CENTER);
                    label.setContents(record.getAttributeAsString(PermissionsRecord.ATTRIBUTE_SUB_ELEMENT));

                    setIconForSubObjectLabelOfTab(record.getAttributeAsString(PermissionsRecord.ATTRIBUTE_SUB_ELEMENT), label);

                    cellWrapper.addChild(label);
                    return cellWrapper;
                }

                cellWrapper = new Canvas();
                cellWrapper.setOverflow(Overflow.AUTO);
                cellWrapper.setCursor(Cursor.POINTER);
                cellWrapper.setBorder("solid #ced2d3 1px;");
                cellWrapper.setHeight100();
                cellWrapper.setWidth100();

                cellLayout = new VLayout();
                cellLayout.setOverflow(Overflow.VISIBLE);
                cellLayout.setCursor(Cursor.POINTER);
                cellLayout.setHeight100();
                cellLayout.setWidth100();

                cellWrapper.addDoubleClickHandler(new DoubleClickHandler() {
                    @Override
                    public void onDoubleClick(DoubleClickEvent event) {
                        if (Permissions.edit) {
                            Permissions.rolesWasSelected.clear();
                            Permissions.remainRoles.clear();
                            Permissions.usersWasSelected.clear();
                            Permissions.remainUsers.clear();
                            Permissions.groupsWasSelected.clear();
                            Permissions.remainGroup.clear();

                            // ListGridRecord record2 = record;
                            // int colTemp = colNum;
                            boolean isUpdate = false;
                            @SuppressWarnings("unchecked")
                            Map<String, List<String>> selectedMapTemp = record.getAttributeAsMap(Permissions.getActionByCol(colNum));
                            for (Map.Entry<String, List<String>> entry : selectedMapTemp.entrySet()) {
                                isUpdate = true;
                                ArrayList<String> wasSelected = new ArrayList<>();
                                for (String string : entry.getValue()) {
                                    wasSelected.add(string);
                                }

                                if (entry.getKey().equals(Permissions.ROLES_TAB)) {
                                    Permissions.rolesWasSelected = wasSelected;
                                    Permissions.remainRoles = Permissions.originalRoles.stream().filter(name -> !wasSelected.contains(name)).collect(Collectors.toList());
                                } else if (entry.getKey().equals(Permissions.USERS_TAB)) {
                                    Permissions.usersWasSelected = wasSelected;
                                    Permissions.remainUsers = Permissions.originalUsers.stream().filter(name -> !wasSelected.contains(name)).collect(Collectors.toList());
                                } else {
                                    Permissions.groupsWasSelected = wasSelected;
                                    Permissions.remainGroup = Permissions.originalGroups.stream().filter(name -> !wasSelected.contains(name)).collect(Collectors.toList());
                                }
                            }
                            Permissions.openUpdatePermissionWindow(record, colNum, isUpdate, tabName);
                        }
                    }
                });

                Map<String, List<String>> selectedMap = record.getAttributeAsMap(Permissions.getActionByCol(colNum));

                if (selectedMap.size() > 0) {
                    Permissions.updateCellLayout(cellLayout, record, colNum);
                    Permissions.updateCellWrapper(cellWrapper, selectedMap);
                }

                cellWrapper.addChild(cellLayout);
                return cellWrapper;
            }
        };

        activeListGrid.setWidth100();
        activeListGrid.setHeight100();
        activeListGrid.setHeaderHeight(29);
        activeListGrid.setCellHeight(80);
        activeListGrid.setShowRecordComponents(true);
        activeListGrid.setShowRecordComponentsByCell(true);
        activeListGrid.setCanSelectCells(true);
        activeListGrid.setWrapCells(true);

        activeListGrid.setShowRollOver(false);
        activeListGrid.setUseCellRollOvers(false);
        activeListGrid.setAnimateRollOver(false);
        activeListGrid.setAlternateFieldStyles(false);
        activeListGrid.setAlternateRecordStyles(false);
        activeListGrid.setAlwaysShowScrollbars(false);

        activeListGrid.setShowSortArrow(SortArrow.NONE);
        activeListGrid.setShowHeaderContextMenu(false);
        activeListGrid.setShowHeaderMenuButton(false);
        activeListGrid.setSelectHeaderOnSort(false);

        activeListGrid.setOverflow(Overflow.VISIBLE);

        ListGridField subElement = new ListGridField(PermissionsRecord.ATTRIBUTE_SUB_ELEMENT, "");
        subElement.setCanSort(false);
        subElement.setDisplayValueFromRecord(true);
        subElement.setWidth("15%");
        ListGridField createField = new ListGridField("createField", "Create");
        createField.setCanSort(false);
        createField.setWidth("15%");
        ListGridField readField = new ListGridField("readField", "Read");
        readField.setCanSort(false);
        readField.setWidth("15%");
        ListGridField updateField = new ListGridField("updateField", "Update");
        updateField.setCanSort(false);
        updateField.setWidth("15%");
        ListGridField deleteField = new ListGridField("deleteField", "Delete");
        deleteField.setCanSort(false);
        deleteField.setWidth("15%");
        ListGridField submitField = new ListGridField("submitField", "Submit to WF");
        submitField.setCanSort(false);
        submitField.setWidth("15%");

        activeListGrid.setFields(subElement, createField, readField, updateField, deleteField, submitField);

        activeLayout.addMember(activeListGrid);

        activeTab = new Tab(tabName);
        activeTab.setPane(activeLayout);

        return activeTab;
    }

    public static Tab getClosedTabLayout(String tabName) {
        // DEFINE DRAFT CONTENT
        closedLayout = new VLayout();
        closedLayout.setWidth100();
        closedLayout.setHeight100();
        closedLayout.setOverflow(Overflow.VISIBLE);
        closedLayout.setStyleName("whitebg");
        closedLayout.setPadding(17);

        closedListGrid = new ListGrid() {
            @Override
            protected Canvas createRecordComponent(ListGridRecord record, Integer colNum) {

                Canvas cellWrapper;
                VLayout cellLayout;

                if (this.getFieldName(colNum).equals(PermissionsRecord.ATTRIBUTE_SUB_ELEMENT)) {
                    cellWrapper = new Canvas();
                    cellWrapper.setHeight100();
                    cellWrapper.setWidth100();
                    // cellWrapper.disable();
                    cellWrapper.setBackgroundColor("#efefef");
                    cellWrapper.setBorder("solid #ced2d3 1px;");
                    Label label = new Label();
                    label.setPadding(2);
                    label.setWidth100();
                    label.setHeight100();
                    label.setLayoutAlign(VerticalAlignment.CENTER);
                    label.setContents(record.getAttributeAsString(PermissionsRecord.ATTRIBUTE_SUB_ELEMENT));

                    setIconForSubObjectLabelOfTab(record.getAttributeAsString(PermissionsRecord.ATTRIBUTE_SUB_ELEMENT), label);

                    cellWrapper.addChild(label);
                    return cellWrapper;
                }

                cellWrapper = new Canvas();
                cellWrapper.setOverflow(Overflow.AUTO);
                cellWrapper.setCursor(Cursor.POINTER);
                cellWrapper.setBorder("solid #ced2d3 1px;");
                cellWrapper.setHeight100();
                cellWrapper.setWidth100();

                cellLayout = new VLayout();
                cellLayout.setOverflow(Overflow.VISIBLE);
                cellLayout.setCursor(Cursor.POINTER);
                cellLayout.setHeight100();
                cellLayout.setWidth100();

                cellWrapper.addDoubleClickHandler(new DoubleClickHandler() {
                    @Override
                    public void onDoubleClick(DoubleClickEvent event) {
                        if (Permissions.edit) {
                            Permissions.rolesWasSelected.clear();
                            Permissions.remainRoles.clear();
                            Permissions.usersWasSelected.clear();
                            Permissions.remainUsers.clear();
                            Permissions.groupsWasSelected.clear();
                            Permissions.remainGroup.clear();

                            // ListGridRecord record2 = record;
                            // int colTemp = colNum;
                            boolean isUpdate = false;
                            @SuppressWarnings("unchecked")
                            Map<String, List<String>> selectedMapTemp = record.getAttributeAsMap(Permissions.getActionByCol(colNum));
                            for (Map.Entry<String, List<String>> entry : selectedMapTemp.entrySet()) {
                                isUpdate = true;
                                ArrayList<String> wasSelected = new ArrayList<>();
                                for (String string : entry.getValue()) {
                                    wasSelected.add(string);
                                }

                                if (entry.getKey().equals(Permissions.ROLES_TAB)) {
                                    Permissions.rolesWasSelected = wasSelected;
                                    Permissions.remainRoles = Permissions.originalRoles.stream().filter(name -> !wasSelected.contains(name)).collect(Collectors.toList());
                                } else if (entry.getKey().equals(Permissions.USERS_TAB)) {
                                    Permissions.usersWasSelected = wasSelected;
                                    Permissions.remainUsers = Permissions.originalUsers.stream().filter(name -> !wasSelected.contains(name)).collect(Collectors.toList());
                                } else {
                                    Permissions.groupsWasSelected = wasSelected;
                                    Permissions.remainGroup = Permissions.originalGroups.stream().filter(name -> !wasSelected.contains(name)).collect(Collectors.toList());
                                }
                            }
                            Permissions.openUpdatePermissionWindow(record, colNum, isUpdate, tabName);
                        }
                    }
                });

                Map<String, List<String>> selectedMap = record.getAttributeAsMap(Permissions.getActionByCol(colNum));

                if (selectedMap.size() > 0) {
                    Permissions.updateCellLayout(cellLayout, record, colNum);
                    Permissions.updateCellWrapper(cellWrapper, selectedMap);
                }

                cellWrapper.addChild(cellLayout);
                return cellWrapper;
            }
        };

        closedListGrid.setWidth100();
        closedListGrid.setHeight100();
        closedListGrid.setHeaderHeight(29);
        closedListGrid.setCellHeight(80);
        closedListGrid.setShowRecordComponents(true);
        closedListGrid.setShowRecordComponentsByCell(true);
        closedListGrid.setCanSelectCells(true);
        closedListGrid.setWrapCells(true);

        closedListGrid.setShowRollOver(false);
        closedListGrid.setUseCellRollOvers(false);
        closedListGrid.setAnimateRollOver(false);
        closedListGrid.setAlternateFieldStyles(false);
        closedListGrid.setAlternateRecordStyles(false);
        closedListGrid.setAlwaysShowScrollbars(false);

        closedListGrid.setShowSortArrow(SortArrow.NONE);
        closedListGrid.setShowHeaderContextMenu(false);
        closedListGrid.setShowHeaderMenuButton(false);
        closedListGrid.setSelectHeaderOnSort(false);

        closedListGrid.setOverflow(Overflow.VISIBLE);

        ListGridField subElement = new ListGridField(PermissionsRecord.ATTRIBUTE_SUB_ELEMENT, "");
        subElement.setCanSort(false);
        subElement.setDisplayValueFromRecord(true);
        subElement.setWidth("15%");
        ListGridField createField = new ListGridField("createField", "Create");
        createField.setCanSort(false);
        createField.setWidth("15%");
        ListGridField readField = new ListGridField("readField", "Read");
        readField.setCanSort(false);
        readField.setWidth("15%");
        ListGridField updateField = new ListGridField("updateField", "Update");
        updateField.setCanSort(false);
        updateField.setWidth("15%");
        ListGridField deleteField = new ListGridField("deleteField", "Delete");
        deleteField.setCanSort(false);
        deleteField.setWidth("15%");
        ListGridField submitField = new ListGridField("submitField", "Submit to WF");
        submitField.setCanSort(false);
        submitField.setWidth("15%");

        closedListGrid.setFields(subElement, createField, readField, updateField, deleteField, submitField);

        closedLayout.addMember(closedListGrid);

        closedTab = new Tab(tabName);
        closedTab.setPane(closedLayout);

        return closedTab;
    }

    public static Tab getDeletedTabLayout(String tabName) {
        // DEFINE DRAFT CONTENT
        deletedLayout = new VLayout();
        deletedLayout.setWidth100();
        deletedLayout.setHeight100();
        deletedLayout.setOverflow(Overflow.VISIBLE);
        deletedLayout.setStyleName("whitebg");
        deletedLayout.setPadding(17);

        deletedListGrid = new ListGrid() {
            @Override
            protected Canvas createRecordComponent(ListGridRecord record, Integer colNum) {

                Canvas cellWrapper;
                VLayout cellLayout;

                if (this.getFieldName(colNum).equals(PermissionsRecord.ATTRIBUTE_SUB_ELEMENT)) {
                    cellWrapper = new Canvas();
                    cellWrapper.setHeight100();
                    cellWrapper.setWidth100();
                    // cellWrapper.disable();
                    cellWrapper.setBackgroundColor("#efefef");
                    cellWrapper.setBorder("solid #ced2d3 1px;");
                    Label label = new Label();
                    label.setPadding(2);
                    label.setWidth100();
                    label.setHeight100();
                    label.setLayoutAlign(VerticalAlignment.CENTER);
                    label.setContents(record.getAttributeAsString(PermissionsRecord.ATTRIBUTE_SUB_ELEMENT));

                    setIconForSubObjectLabelOfTab(record.getAttributeAsString(PermissionsRecord.ATTRIBUTE_SUB_ELEMENT), label);

                    cellWrapper.addChild(label);
                    return cellWrapper;
                }

                cellWrapper = new Canvas();
                cellWrapper.setOverflow(Overflow.AUTO);
                cellWrapper.setCursor(Cursor.POINTER);
                cellWrapper.setBorder("solid #ced2d3 1px;");
                cellWrapper.setHeight100();
                cellWrapper.setWidth100();

                cellLayout = new VLayout();
                cellLayout.setOverflow(Overflow.VISIBLE);
                cellLayout.setCursor(Cursor.POINTER);
                cellLayout.setHeight100();
                cellLayout.setWidth100();

                cellWrapper.addDoubleClickHandler(new DoubleClickHandler() {
                    @Override
                    public void onDoubleClick(DoubleClickEvent event) {
                        if (Permissions.edit) {
                            Permissions.rolesWasSelected.clear();
                            Permissions.remainRoles.clear();
                            Permissions.usersWasSelected.clear();
                            Permissions.remainUsers.clear();
                            Permissions.groupsWasSelected.clear();
                            Permissions.remainGroup.clear();

                            // ListGridRecord record2 = record;
                            // int colTemp = colNum;
                            boolean isUpdate = false;
                            @SuppressWarnings("unchecked")
                            Map<String, List<String>> selectedMapTemp = record.getAttributeAsMap(Permissions.getActionByCol(colNum));
                            for (Map.Entry<String, List<String>> entry : selectedMapTemp.entrySet()) {
                                isUpdate = true;
                                ArrayList<String> wasSelected = new ArrayList<>();
                                for (String string : entry.getValue()) {
                                    wasSelected.add(string);
                                }

                                if (entry.getKey().equals(Permissions.ROLES_TAB)) {
                                    Permissions.rolesWasSelected = wasSelected;
                                    Permissions.remainRoles = Permissions.originalRoles.stream().filter(name -> !wasSelected.contains(name)).collect(Collectors.toList());
                                } else if (entry.getKey().equals(Permissions.USERS_TAB)) {
                                    Permissions.usersWasSelected = wasSelected;
                                    Permissions.remainUsers = Permissions.originalUsers.stream().filter(name -> !wasSelected.contains(name)).collect(Collectors.toList());
                                } else {
                                    Permissions.groupsWasSelected = wasSelected;
                                    Permissions.remainGroup = Permissions.originalGroups.stream().filter(name -> !wasSelected.contains(name)).collect(Collectors.toList());
                                }
                            }
                            Permissions.openUpdatePermissionWindow(record, colNum, isUpdate, tabName);
                        }
                    }
                });

                Map<String, List<String>> selectedMap = record.getAttributeAsMap(Permissions.getActionByCol(colNum));

                if (selectedMap.size() > 0) {
                    Permissions.updateCellLayout(cellLayout, record, colNum);
                    Permissions.updateCellWrapper(cellWrapper, selectedMap);
                }

                cellWrapper.addChild(cellLayout);
                return cellWrapper;
            }
        };

        deletedListGrid.setWidth100();
        deletedListGrid.setHeight100();
        deletedListGrid.setHeaderHeight(29);
        deletedListGrid.setCellHeight(80);
        deletedListGrid.setShowRecordComponents(true);
        deletedListGrid.setShowRecordComponentsByCell(true);
        deletedListGrid.setCanSelectCells(true);
        deletedListGrid.setWrapCells(true);

        deletedListGrid.setShowRollOver(false);
        deletedListGrid.setUseCellRollOvers(false);
        deletedListGrid.setAnimateRollOver(false);
        deletedListGrid.setAlternateFieldStyles(false);
        deletedListGrid.setAlternateRecordStyles(false);
        deletedListGrid.setAlwaysShowScrollbars(false);

        deletedListGrid.setShowSortArrow(SortArrow.NONE);
        deletedListGrid.setShowHeaderContextMenu(false);
        deletedListGrid.setShowHeaderMenuButton(false);
        deletedListGrid.setSelectHeaderOnSort(false);

        deletedListGrid.setOverflow(Overflow.VISIBLE);

        ListGridField subElement = new ListGridField(PermissionsRecord.ATTRIBUTE_SUB_ELEMENT, "");
        subElement.setCanSort(false);
        subElement.setDisplayValueFromRecord(true);
        subElement.setWidth("15%");
        ListGridField createField = new ListGridField("createField", "Create");
        createField.setCanSort(false);
        createField.setWidth("15%");
        ListGridField readField = new ListGridField("readField", "Read");
        readField.setCanSort(false);
        readField.setWidth("15%");
        ListGridField updateField = new ListGridField("updateField", "Update");
        updateField.setCanSort(false);
        updateField.setWidth("15%");
        ListGridField deleteField = new ListGridField("deleteField", "Delete");
        deleteField.setCanSort(false);
        deleteField.setWidth("15%");
        ListGridField submitField = new ListGridField("submitField", "Submit to WF");
        submitField.setCanSort(false);
        submitField.setWidth("15%");

        deletedListGrid.setFields(subElement, createField, readField, updateField, deleteField, submitField);

        deletedLayout.addMember(deletedListGrid);

        deletedTab = new Tab(tabName);
        deletedTab.setPane(deletedLayout);

        return deletedTab;
    }

    public static Tab getArchivedTabLayout(String tabName) {
        // DEFINE DRAFT CONTENT
        archivedLayout = new VLayout();
        archivedLayout.setWidth100();
        archivedLayout.setHeight100();
        archivedLayout.setOverflow(Overflow.VISIBLE);
        archivedLayout.setStyleName("whitebg");
        archivedLayout.setPadding(17);

        archivedListGrid = new ListGrid() {
            @Override
            protected Canvas createRecordComponent(ListGridRecord record, Integer colNum) {

                Canvas cellWrapper;
                VLayout cellLayout;

                if (this.getFieldName(colNum).equals(PermissionsRecord.ATTRIBUTE_SUB_ELEMENT)) {
                    cellWrapper = new Canvas();
                    cellWrapper.setHeight100();
                    cellWrapper.setWidth100();
                    // cellWrapper.disable();
                    cellWrapper.setBackgroundColor("#efefef");
                    cellWrapper.setBorder("solid #ced2d3 1px;");
                    Label label = new Label();
                    label.setPadding(2);
                    label.setWidth100();
                    label.setHeight100();
                    label.setLayoutAlign(VerticalAlignment.CENTER);
                    label.setContents(record.getAttributeAsString(PermissionsRecord.ATTRIBUTE_SUB_ELEMENT));

                    setIconForSubObjectLabelOfTab(record.getAttributeAsString(PermissionsRecord.ATTRIBUTE_SUB_ELEMENT), label);

                    cellWrapper.addChild(label);
                    return cellWrapper;
                }

                cellWrapper = new Canvas();
                cellWrapper.setOverflow(Overflow.AUTO);
                cellWrapper.setCursor(Cursor.POINTER);
                cellWrapper.setBorder("solid #ced2d3 1px;");
                cellWrapper.setHeight100();
                cellWrapper.setWidth100();

                cellLayout = new VLayout();
                cellLayout.setOverflow(Overflow.VISIBLE);
                cellLayout.setCursor(Cursor.POINTER);
                cellLayout.setHeight100();
                cellLayout.setWidth100();

                cellWrapper.addDoubleClickHandler(new DoubleClickHandler() {
                    @Override
                    public void onDoubleClick(DoubleClickEvent event) {
                        if (Permissions.edit) {
                            Permissions.rolesWasSelected.clear();
                            Permissions.remainRoles.clear();
                            Permissions.usersWasSelected.clear();
                            Permissions.remainUsers.clear();
                            Permissions.groupsWasSelected.clear();
                            Permissions.remainGroup.clear();

                            // ListGridRecord record2 = record;
                            // int colTemp = colNum;
                            boolean isUpdate = false;
                            @SuppressWarnings("unchecked")
                            Map<String, List<String>> selectedMapTemp = record.getAttributeAsMap(Permissions.getActionByCol(colNum));
                            for (Map.Entry<String, List<String>> entry : selectedMapTemp.entrySet()) {
                                isUpdate = true;
                                ArrayList<String> wasSelected = new ArrayList<>();
                                for (String string : entry.getValue()) {
                                    wasSelected.add(string);
                                }

                                if (entry.getKey().equals(Permissions.ROLES_TAB)) {
                                    Permissions.rolesWasSelected = wasSelected;
                                    Permissions.remainRoles = Permissions.originalRoles.stream().filter(name -> !wasSelected.contains(name)).collect(Collectors.toList());
                                } else if (entry.getKey().equals(Permissions.USERS_TAB)) {
                                    Permissions.usersWasSelected = wasSelected;
                                    Permissions.remainUsers = Permissions.originalUsers.stream().filter(name -> !wasSelected.contains(name)).collect(Collectors.toList());
                                } else {
                                    Permissions.groupsWasSelected = wasSelected;
                                    Permissions.remainGroup = Permissions.originalGroups.stream().filter(name -> !wasSelected.contains(name)).collect(Collectors.toList());
                                }
                            }
                            Permissions.openUpdatePermissionWindow(record, colNum, isUpdate, tabName);
                        }
                    }
                });

                Map<String, List<String>> selectedMap = record.getAttributeAsMap(Permissions.getActionByCol(colNum));

                if (selectedMap.size() > 0) {
                    Permissions.updateCellLayout(cellLayout, record, colNum);
                    Permissions.updateCellWrapper(cellWrapper, selectedMap);
                }

                cellWrapper.addChild(cellLayout);
                return cellWrapper;
            }
        };

        archivedListGrid.setWidth100();
        archivedListGrid.setHeight100();
        archivedListGrid.setHeaderHeight(29);
        archivedListGrid.setCellHeight(80);
        archivedListGrid.setShowRecordComponents(true);
        archivedListGrid.setShowRecordComponentsByCell(true);
        archivedListGrid.setCanSelectCells(true);
        archivedListGrid.setWrapCells(true);

        archivedListGrid.setShowRollOver(false);
        archivedListGrid.setUseCellRollOvers(false);
        archivedListGrid.setAnimateRollOver(false);
        archivedListGrid.setAlternateFieldStyles(false);
        archivedListGrid.setAlternateRecordStyles(false);
        archivedListGrid.setAlwaysShowScrollbars(false);

        archivedListGrid.setShowSortArrow(SortArrow.NONE);
        archivedListGrid.setShowHeaderContextMenu(false);
        archivedListGrid.setShowHeaderMenuButton(false);
        archivedListGrid.setSelectHeaderOnSort(false);

        archivedListGrid.setOverflow(Overflow.VISIBLE);

        ListGridField subElement = new ListGridField(PermissionsRecord.ATTRIBUTE_SUB_ELEMENT, "");
        subElement.setCanSort(false);
        subElement.setDisplayValueFromRecord(true);
        subElement.setWidth("15%");
        ListGridField createField = new ListGridField("createField", "Create");
        createField.setCanSort(false);
        createField.setWidth("15%");
        ListGridField readField = new ListGridField("readField", "Read");
        readField.setCanSort(false);
        readField.setWidth("15%");
        ListGridField updateField = new ListGridField("updateField", "Update");
        updateField.setCanSort(false);
        updateField.setWidth("15%");
        ListGridField deleteField = new ListGridField("deleteField", "Delete");
        deleteField.setCanSort(false);
        deleteField.setWidth("15%");
        ListGridField submitField = new ListGridField("submitField", "Submit to WF");
        submitField.setCanSort(false);
        submitField.setWidth("15%");

        archivedListGrid.setFields(subElement, createField, readField, updateField, deleteField, submitField);

        archivedLayout.addMember(archivedListGrid);

        archivedTab = new Tab(tabName);
        archivedTab.setPane(archivedLayout);

        return archivedTab;
    }

    public static void openUpdatePermissionWindow(ListGridRecord record, Integer colNum, String tabName) {
        if (Permissions.edit) {
            Permissions.rolesWasSelected.clear();
            Permissions.remainRoles.clear();
            Permissions.usersWasSelected.clear();
            Permissions.remainUsers.clear();
            Permissions.groupsWasSelected.clear();
            Permissions.remainGroup.clear();

            // ListGridRecord record2 = record;
            // int colTemp = colNum;
            boolean isUpdate = false;
            @SuppressWarnings("unchecked")
            Map<String, List<String>> selectedMapTemp = record.getAttributeAsMap(Permissions.getActionByCol(colNum));
            for (Map.Entry<String, List<String>> entry : selectedMapTemp.entrySet()) {
                isUpdate = true;
                ArrayList<String> wasSelected = new ArrayList<>();
                for (String string : entry.getValue()) {
                    wasSelected.add(string);
                }

                if (entry.getKey().equals(Permissions.ROLES_TAB)) {
                    Permissions.rolesWasSelected = wasSelected;
                    Permissions.remainRoles = Permissions.originalRoles.stream().filter(name -> !wasSelected.contains(name)).collect(Collectors.toList());
                } else if (entry.getKey().equals(Permissions.USERS_TAB)) {
                    Permissions.usersWasSelected = wasSelected;
                    Permissions.remainUsers = Permissions.originalUsers.stream().filter(name -> !wasSelected.contains(name)).collect(Collectors.toList());
                } else {
                    Permissions.groupsWasSelected = wasSelected;
                    Permissions.remainGroup = Permissions.originalGroups.stream().filter(name -> !wasSelected.contains(name)).collect(Collectors.toList());
                }
            }
            Permissions.openUpdatePermissionWindow(record, colNum, isUpdate, tabName);
        }
    }


    public static void setIconForSubObjectLabelOfTab(String subObjectValue, final Label label) {
        label.setAlign(Alignment.CENTER);
        switch (subObjectValue) {
            case PermissionConstants.TAB_PROGRAM_HEADER :
                label.setIcon("permissionIcons/propertyIcon.gif");
                break;
            case PermissionConstants.TAB_PROGRAM_DASHBOARD :
                label.setIcon("permissionIcons/moduleDashB.gif");
                break;
            case PermissionConstants.TAB_PROGRAM_DOCUMENTS :
                label.setIcon("permissionIcons/PbPartDoc.gif");
                break;
            case PermissionConstants.TAB_PROGRAM_HISTORY :
                label.setIcon("permissionIcons/history.gif");
                break;
        }
    }
}