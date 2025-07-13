package p163j5;

/* renamed from: j5.b */
/* loaded from: classes.dex */
public final /* synthetic */ class C3423b implements java.util.Comparator {

    /* renamed from: Z */
    public static final /* synthetic */ p163j5.C3423b f14809Z = null;

    /* renamed from: a0 */
    public static final /* synthetic */ p163j5.C3423b f14810a0 = null;

    /* renamed from: b0 */
    public static final /* synthetic */ p163j5.C3423b f14811b0 = null;

    /* renamed from: c0 */
    public static final /* synthetic */ p163j5.C3423b f14812c0 = null;

    /* renamed from: Y */
    public final /* synthetic */ int f14813Y;

    static {
            j5.b r0 = new j5.b
            r1 = 0
            r0.<init>(r1)
            p163j5.C3423b.f14809Z = r0
            j5.b r0 = new j5.b
            r1 = 1
            r0.<init>(r1)
            p163j5.C3423b.f14810a0 = r0
            j5.b r0 = new j5.b
            r1 = 2
            r0.<init>(r1)
            p163j5.C3423b.f14811b0 = r0
            j5.b r0 = new j5.b
            r1 = 3
            r0.<init>(r1)
            p163j5.C3423b.f14812c0 = r0
            return
    }

    public /* synthetic */ C3423b(int r1) {
            r0 = this;
            r0.f14813Y = r1
            r0.<init>()
            return
    }

    @Override // java.util.Comparator
    public final int compare(java.lang.Object r3, java.lang.Object r4) {
            r2 = this;
            int r0 = r2.f14813Y
            switch(r0) {
                case 0: goto L1f;
                case 1: goto L12;
                case 2: goto L6;
                default: goto L5;
            }
        L5:
            goto L2c
        L6:
            u5.e0$b r3 = (p352u5.C6313e0.b) r3
            u5.e0$b r4 = (p352u5.C6313e0.b) r4
            java.util.Comparator<u5.e0$b> r0 = p352u5.C6313e0.f24667h
            int r3 = r3.f24676a
            int r4 = r4.f24676a
            int r3 = r3 - r4
            return r3
        L12:
            r5.d r3 = (p305r5.C5791d) r3
            r5.d r4 = (p305r5.C5791d) r4
            long r0 = r3.f22445b
            long r3 = r4.f22445b
            int r3 = java.lang.Long.compare(r0, r3)
            return r3
        L1f:
            j5.c$a r3 = (p163j5.C3424c.a) r3
            j5.c$a r4 = (p163j5.C3424c.a) r4
            int r4 = r4.f14825b
            int r3 = r3.f14825b
            int r3 = java.lang.Integer.compare(r4, r3)
            return r3
        L2c:
            java.io.File r3 = (java.io.File) r3
            java.io.File r4 = (java.io.File) r4
            java.nio.charset.Charset r0 = p148ia.C3123e.f12521g
            java.lang.String r3 = r3.getName()
            int r0 = p148ia.C3123e.f12522h
            r1 = 0
            java.lang.String r3 = r3.substring(r1, r0)
            java.lang.String r4 = r4.getName()
            java.lang.String r4 = r4.substring(r1, r0)
            int r3 = r3.compareTo(r4)
            return r3
    }
}
