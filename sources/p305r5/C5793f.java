package p305r5;

/* renamed from: r5.f */
/* loaded from: classes.dex */
public final /* synthetic */ class C5793f implements java.util.Comparator {

    /* renamed from: Z */
    public static final /* synthetic */ p305r5.C5793f f22471Z = null;

    /* renamed from: a0 */
    public static final /* synthetic */ p305r5.C5793f f22472a0 = null;

    /* renamed from: Y */
    public final /* synthetic */ int f22473Y;

    static {
            r5.f r0 = new r5.f
            r1 = 0
            r0.<init>(r1)
            p305r5.C5793f.f22471Z = r0
            r5.f r0 = new r5.f
            r1 = 1
            r0.<init>(r1)
            p305r5.C5793f.f22472a0 = r0
            return
    }

    public /* synthetic */ C5793f(int r1) {
            r0 = this;
            r0.f22473Y = r1
            r0.<init>()
            return
    }

    @Override // java.util.Comparator
    public final int compare(java.lang.Object r2, java.lang.Object r3) {
            r1 = this;
            int r0 = r1.f22473Y
            switch(r0) {
                case 0: goto L6;
                default: goto L5;
            }
        L5:
            goto L17
        L6:
            r5.e$b r2 = (p305r5.C5792e.b) r2
            r5.e$b r3 = (p305r5.C5792e.b) r3
            r5.e$c r2 = r2.f22452a
            int r2 = r2.f22455b
            r5.e$c r3 = r3.f22452a
            int r3 = r3.f22455b
            int r2 = java.lang.Integer.compare(r2, r3)
            return r2
        L17:
            java.lang.Integer r2 = (java.lang.Integer) r2
            java.lang.Integer r3 = (java.lang.Integer) r3
            int[] r2 = p325s5.C5964d.f22933d
            r2 = 0
            return r2
    }
}
