package p312rc;

/* renamed from: rc.b */
/* loaded from: classes.dex */
public enum EnumC5807b extends java.lang.Enum<p312rc.EnumC5807b> {

    /* renamed from: Y */
    public static final /* synthetic */ p312rc.EnumC5807b[] f22500Y = null;

    /* renamed from: rc.b$a */
    public enum a extends p312rc.EnumC5807b {
        public a(java.lang.String r2, int r3) {
                r1 = this;
                r0 = 0
                r1.<init>(r2, r3, r0)
                return
        }

        @Override // p312rc.EnumC5807b
        /* renamed from: e */
        public boolean mo12173e(int r1, int r2) {
                r0 = this;
                int r1 = r1 + r2
                r2 = 1
                r1 = r1 & r2
                if (r1 != 0) goto L6
                return r2
            L6:
                r1 = 0
                return r1
        }
    }








    static {
            rc.b$a r0 = new rc.b$a
            java.lang.String r1 = "DATA_MASK_000"
            r2 = 0
            r0.<init>(r1, r2)
            rc.b$b r1 = new rc.b$b
            java.lang.String r3 = "DATA_MASK_001"
            r4 = 1
            r1.<init>(r3, r4)
            rc.b$c r3 = new rc.b$c
            java.lang.String r5 = "DATA_MASK_010"
            r6 = 2
            r3.<init>(r5, r6)
            rc.b$d r5 = new rc.b$d
            java.lang.String r7 = "DATA_MASK_011"
            r8 = 3
            r5.<init>(r7, r8)
            rc.b$e r7 = new rc.b$e
            java.lang.String r9 = "DATA_MASK_100"
            r10 = 4
            r7.<init>(r9, r10)
            rc.b$f r9 = new rc.b$f
            java.lang.String r11 = "DATA_MASK_101"
            r12 = 5
            r9.<init>(r11, r12)
            rc.b$g r11 = new rc.b$g
            java.lang.String r13 = "DATA_MASK_110"
            r14 = 6
            r11.<init>(r13, r14)
            rc.b$h r13 = new rc.b$h
            java.lang.String r15 = "DATA_MASK_111"
            r14 = 7
            r13.<init>(r15, r14)
            r15 = 8
            rc.b[] r15 = new p312rc.EnumC5807b[r15]
            r15[r2] = r0
            r15[r4] = r1
            r15[r6] = r3
            r15[r8] = r5
            r15[r10] = r7
            r15[r12] = r9
            r0 = 6
            r15[r0] = r11
            r15[r14] = r13
            p312rc.EnumC5807b.f22500Y = r15
            return
    }

    EnumC5807b(java.lang.String r1, int r2, p312rc.EnumC5807b.a r3) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static p312rc.EnumC5807b valueOf(java.lang.String r1) {
            java.lang.Class<rc.b> r0 = p312rc.EnumC5807b.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            rc.b r1 = (p312rc.EnumC5807b) r1
            return r1
    }

    public static p312rc.EnumC5807b[] values() {
            rc.b[] r0 = p312rc.EnumC5807b.f22500Y
            java.lang.Object r0 = r0.clone()
            rc.b[] r0 = (p312rc.EnumC5807b[]) r0
            return r0
    }

    /* renamed from: e */
    public abstract boolean mo12173e(int r1, int r2);

    /* renamed from: g */
    public final void m12174g(p453zb.C7270b r5, int r6) {
            r4 = this;
            r0 = 0
            r1 = 0
        L2:
            if (r1 >= r6) goto L16
            r2 = 0
        L5:
            if (r2 >= r6) goto L13
            boolean r3 = r4.mo12173e(r1, r2)
            if (r3 == 0) goto L10
            r5.m14371a(r2, r1)
        L10:
            int r2 = r2 + 1
            goto L5
        L13:
            int r1 = r1 + 1
            goto L2
        L16:
            return
    }
}
