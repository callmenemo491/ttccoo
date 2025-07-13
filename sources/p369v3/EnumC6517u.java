package p369v3;

/* renamed from: v3.u */
/* loaded from: classes.dex */
public enum EnumC6517u extends java.lang.Enum<p369v3.EnumC6517u> {

    /* renamed from: Y */
    public static final p369v3.EnumC6517u f25266Y = null;

    /* renamed from: Z */
    public static final /* synthetic */ p369v3.EnumC6517u[] f25267Z = null;

    static {
            v3.u r0 = new v3.u
            java.lang.String r1 = "DEFAULT"
            r2 = 0
            r0.<init>(r1, r2, r2)
            p369v3.EnumC6517u.f25266Y = r0
            v3.u r1 = new v3.u
            java.lang.String r3 = "UNMETERED_ONLY"
            r4 = 1
            r1.<init>(r3, r4, r4)
            v3.u r3 = new v3.u
            java.lang.String r5 = "UNMETERED_OR_DAILY"
            r6 = 2
            r3.<init>(r5, r6, r6)
            v3.u r5 = new v3.u
            java.lang.String r7 = "FAST_IF_RADIO_AWAKE"
            r8 = 3
            r5.<init>(r7, r8, r8)
            v3.u r7 = new v3.u
            java.lang.String r9 = "NEVER"
            r10 = 4
            r7.<init>(r9, r10, r10)
            v3.u r9 = new v3.u
            java.lang.String r11 = "UNRECOGNIZED"
            r12 = 5
            r13 = -1
            r9.<init>(r11, r12, r13)
            r11 = 6
            v3.u[] r11 = new p369v3.EnumC6517u[r11]
            r11[r2] = r0
            r11[r4] = r1
            r11[r6] = r3
            r11[r8] = r5
            r11[r10] = r7
            r11[r12] = r9
            p369v3.EnumC6517u.f25267Z = r11
            android.util.SparseArray r11 = new android.util.SparseArray
            r11.<init>()
            r11.put(r2, r0)
            r11.put(r4, r1)
            r11.put(r6, r3)
            r11.put(r8, r5)
            r11.put(r10, r7)
            r11.put(r13, r9)
            return
    }

    EnumC6517u(java.lang.String r1, int r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static p369v3.EnumC6517u valueOf(java.lang.String r1) {
            java.lang.Class<v3.u> r0 = p369v3.EnumC6517u.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            v3.u r1 = (p369v3.EnumC6517u) r1
            return r1
    }

    public static p369v3.EnumC6517u[] values() {
            v3.u[] r0 = p369v3.EnumC6517u.f25267Z
            java.lang.Object r0 = r0.clone()
            v3.u[] r0 = (p369v3.EnumC6517u[]) r0
            return r0
    }
}
