package p070e5;

/* renamed from: e5.d */
/* loaded from: classes.dex */
public final /* synthetic */ class C1519d implements java.util.Comparator {

    /* renamed from: Z */
    public static final /* synthetic */ p070e5.C1519d f7377Z = null;

    /* renamed from: a0 */
    public static final /* synthetic */ p070e5.C1519d f7378a0 = null;

    /* renamed from: b0 */
    public static final /* synthetic */ p070e5.C1519d f7379b0 = null;

    /* renamed from: Y */
    public final /* synthetic */ int f7380Y;

    static {
            e5.d r0 = new e5.d
            r1 = 1
            r0.<init>(r1)
            p070e5.C1519d.f7377Z = r0
            e5.d r0 = new e5.d
            r1 = 2
            r0.<init>(r1)
            p070e5.C1519d.f7378a0 = r0
            e5.d r0 = new e5.d
            r1 = 3
            r0.<init>(r1)
            p070e5.C1519d.f7379b0 = r0
            return
    }

    public /* synthetic */ C1519d(int r1) {
            r0 = this;
            r0.f7380Y = r1
            r0.<init>()
            return
    }

    @Override // java.util.Comparator
    public final int compare(java.lang.Object r6, java.lang.Object r7) {
            r5 = this;
            int r0 = r5.f7380Y
            switch(r0) {
                case 0: goto L51;
                case 1: goto L29;
                case 2: goto L6;
                default: goto L5;
            }
        L5:
            goto L74
        L6:
            com.google.android.exoplayer2.ui.b$c r6 = (com.google.android.exoplayer2.p044ui.C1054b.c) r6
            com.google.android.exoplayer2.ui.b$c r7 = (com.google.android.exoplayer2.p044ui.C1054b.c) r7
            int r0 = r7.f5323a
            int r1 = r6.f5323a
            int r0 = java.lang.Integer.compare(r0, r1)
            if (r0 == 0) goto L15
            goto L28
        L15:
            java.lang.String r0 = r7.f5325c
            java.lang.String r1 = r6.f5325c
            int r0 = r0.compareTo(r1)
            if (r0 == 0) goto L20
            goto L28
        L20:
            java.lang.String r7 = r7.f5326d
            java.lang.String r6 = r6.f5326d
            int r0 = r7.compareTo(r6)
        L28:
            return r0
        L29:
            java.lang.Integer r6 = (java.lang.Integer) r6
            java.lang.Integer r7 = (java.lang.Integer) r7
            int[] r0 = p325s5.C5964d.f22933d
            int r0 = r6.intValue()
            r1 = -1
            if (r0 != r1) goto L3e
            int r6 = r7.intValue()
            if (r6 != r1) goto L50
            r1 = 0
            goto L50
        L3e:
            int r0 = r7.intValue()
            if (r0 != r1) goto L46
            r1 = 1
            goto L50
        L46:
            int r6 = r6.intValue()
            int r7 = r7.intValue()
            int r1 = r6 - r7
        L50:
            return r1
        L51:
            e5.c$b r6 = (p070e5.C1518c.b) r6
            e5.c$b r7 = (p070e5.C1518c.b) r7
            b9.j r0 = p026b9.AbstractC0706j.f3964a
            long r1 = r6.f7374Y
            long r3 = r7.f7374Y
            b9.j r0 = r0.mo2292b(r1, r3)
            long r1 = r6.f7375Z
            long r3 = r7.f7375Z
            b9.j r0 = r0.mo2292b(r1, r3)
            int r6 = r6.f7376a0
            int r7 = r7.f7376a0
            b9.j r6 = r0.mo2291a(r6, r7)
            int r6 = r6.mo2296f()
            return r6
        L74:
            fa.a0$c r6 = (p094fa.AbstractC2103a0.c) r6
            fa.a0$c r7 = (p094fa.AbstractC2103a0.c) r7
            java.lang.String r6 = r6.mo5576a()
            java.lang.String r7 = r7.mo5576a()
            int r6 = r6.compareTo(r7)
            return r6
    }
}
