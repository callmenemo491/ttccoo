package p325s5;

/* renamed from: s5.b */
/* loaded from: classes.dex */
public final /* synthetic */ class C5962b implements java.util.Comparator {

    /* renamed from: Z */
    public static final /* synthetic */ p325s5.C5962b f22923Z = null;

    /* renamed from: a0 */
    public static final /* synthetic */ p325s5.C5962b f22924a0 = null;

    /* renamed from: b0 */
    public static final /* synthetic */ p325s5.C5962b f22925b0 = null;

    /* renamed from: c0 */
    public static final /* synthetic */ p325s5.C5962b f22926c0 = null;

    /* renamed from: Y */
    public final /* synthetic */ int f22927Y;

    static {
            s5.b r0 = new s5.b
            r1 = 0
            r0.<init>(r1)
            p325s5.C5962b.f22923Z = r0
            s5.b r0 = new s5.b
            r1 = 1
            r0.<init>(r1)
            p325s5.C5962b.f22924a0 = r0
            s5.b r0 = new s5.b
            r1 = 2
            r0.<init>(r1)
            p325s5.C5962b.f22925b0 = r0
            s5.b r0 = new s5.b
            r1 = 3
            r0.<init>(r1)
            p325s5.C5962b.f22926c0 = r0
            return
    }

    public /* synthetic */ C5962b(int r1) {
            r0 = this;
            r0.f22927Y = r1
            r0.<init>()
            return
    }

    @Override // java.util.Comparator
    public final int compare(java.lang.Object r3, java.lang.Object r4) {
            r2 = this;
            int r0 = r2.f22927Y
            switch(r0) {
                case 0: goto L38;
                case 1: goto L15;
                case 2: goto L6;
                default: goto L5;
            }
        L5:
            goto L42
        L6:
            u5.e0$b r3 = (p352u5.C6313e0.b) r3
            u5.e0$b r4 = (p352u5.C6313e0.b) r4
            java.util.Comparator<u5.e0$b> r0 = p352u5.C6313e0.f24667h
            float r3 = r3.f24678c
            float r4 = r4.f24678c
            int r3 = java.lang.Float.compare(r3, r4)
            return r3
        L15:
            com.google.android.exoplayer2.ui.b$c r3 = (com.google.android.exoplayer2.p044ui.C1054b.c) r3
            com.google.android.exoplayer2.ui.b$c r4 = (com.google.android.exoplayer2.p044ui.C1054b.c) r4
            int r0 = r4.f5324b
            int r1 = r3.f5324b
            int r0 = java.lang.Integer.compare(r0, r1)
            if (r0 == 0) goto L24
            goto L37
        L24:
            java.lang.String r0 = r3.f5325c
            java.lang.String r1 = r4.f5325c
            int r0 = r0.compareTo(r1)
            if (r0 == 0) goto L2f
            goto L37
        L2f:
            java.lang.String r3 = r3.f5326d
            java.lang.String r4 = r4.f5326d
            int r0 = r3.compareTo(r4)
        L37:
            return r0
        L38:
            f4.e0 r3 = (p088f4.C2003e0) r3
            f4.e0 r4 = (p088f4.C2003e0) r4
            int r4 = r4.f8892f0
            int r3 = r3.f8892f0
            int r4 = r4 - r3
            return r4
        L42:
            java.io.File r3 = (java.io.File) r3
            java.io.File r4 = (java.io.File) r4
            java.nio.charset.Charset r0 = p148ia.C3123e.f12521g
            java.lang.String r4 = r4.getName()
            java.lang.String r3 = r3.getName()
            int r3 = r4.compareTo(r3)
            return r3
    }
}
