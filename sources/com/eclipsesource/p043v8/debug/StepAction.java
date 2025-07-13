package com.eclipsesource.p043v8.debug;

/* loaded from: classes.dex */
public enum StepAction extends java.lang.Enum<com.eclipsesource.p043v8.debug.StepAction> {
    private static final /* synthetic */ com.eclipsesource.p043v8.debug.StepAction[] $VALUES = null;
    public static final com.eclipsesource.p043v8.debug.StepAction STEP_FRAME = null;
    public static final com.eclipsesource.p043v8.debug.StepAction STEP_IN = null;
    public static final com.eclipsesource.p043v8.debug.StepAction STEP_NEXT = null;
    public static final com.eclipsesource.p043v8.debug.StepAction STEP_OUT = null;
    public int index;

    static {
            com.eclipsesource.v8.debug.StepAction r0 = new com.eclipsesource.v8.debug.StepAction
            java.lang.String r1 = "STEP_OUT"
            r2 = 0
            r0.<init>(r1, r2, r2)
            com.eclipsesource.p043v8.debug.StepAction.STEP_OUT = r0
            com.eclipsesource.v8.debug.StepAction r1 = new com.eclipsesource.v8.debug.StepAction
            java.lang.String r3 = "STEP_NEXT"
            r4 = 1
            r1.<init>(r3, r4, r4)
            com.eclipsesource.p043v8.debug.StepAction.STEP_NEXT = r1
            com.eclipsesource.v8.debug.StepAction r3 = new com.eclipsesource.v8.debug.StepAction
            java.lang.String r5 = "STEP_IN"
            r6 = 2
            r3.<init>(r5, r6, r6)
            com.eclipsesource.p043v8.debug.StepAction.STEP_IN = r3
            com.eclipsesource.v8.debug.StepAction r5 = new com.eclipsesource.v8.debug.StepAction
            java.lang.String r7 = "STEP_FRAME"
            r8 = 3
            r5.<init>(r7, r8, r8)
            com.eclipsesource.p043v8.debug.StepAction.STEP_FRAME = r5
            r7 = 4
            com.eclipsesource.v8.debug.StepAction[] r7 = new com.eclipsesource.p043v8.debug.StepAction[r7]
            r7[r2] = r0
            r7[r4] = r1
            r7[r6] = r3
            r7[r8] = r5
            com.eclipsesource.p043v8.debug.StepAction.$VALUES = r7
            return
    }

    StepAction(java.lang.String r1, int r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.index = r3
            return
    }

    public static com.eclipsesource.p043v8.debug.StepAction valueOf(java.lang.String r1) {
            java.lang.Class<com.eclipsesource.v8.debug.StepAction> r0 = com.eclipsesource.p043v8.debug.StepAction.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            com.eclipsesource.v8.debug.StepAction r1 = (com.eclipsesource.p043v8.debug.StepAction) r1
            return r1
    }

    public static com.eclipsesource.p043v8.debug.StepAction[] values() {
            com.eclipsesource.v8.debug.StepAction[] r0 = com.eclipsesource.p043v8.debug.StepAction.$VALUES
            java.lang.Object r0 = r0.clone()
            com.eclipsesource.v8.debug.StepAction[] r0 = (com.eclipsesource.p043v8.debug.StepAction[]) r0
            return r0
    }
}
