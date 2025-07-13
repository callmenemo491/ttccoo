package ma;

/* renamed from: ma.b */
/* loaded from: classes.dex */
public class C4508b implements ma.InterfaceC4509c {

    /* renamed from: a */
    public final /* synthetic */ int f18313a;

    /* renamed from: b */
    public final int f18314b;

    public C4508b(int r2, int r3) {
            r1 = this;
            r1.f18313a = r3
            r0 = 1
            if (r3 == r0) goto Lb
            r1.<init>()
            r1.f18314b = r2
            return
        Lb:
            r1.<init>()
            r1.f18314b = r2
            return
    }

    @Override // ma.InterfaceC4509c
    /* renamed from: a */
    public java.lang.StackTraceElement[] mo10389a(java.lang.StackTraceElement[] r18) {
            r17 = this;
            r0 = r17
            r1 = r18
            int r2 = r0.f18313a
            r3 = 0
            switch(r2) {
                case 0: goto Lb;
                default: goto La;
            }
        La:
            goto L21
        Lb:
            int r2 = r1.length
            int r4 = r0.f18314b
            if (r2 > r4) goto L11
            goto L20
        L11:
            int r2 = r4 / 2
            int r5 = r4 - r2
            java.lang.StackTraceElement[] r4 = new java.lang.StackTraceElement[r4]
            java.lang.System.arraycopy(r1, r3, r4, r3, r5)
            int r3 = r1.length
            int r3 = r3 - r2
            java.lang.System.arraycopy(r1, r3, r4, r5, r2)
            r1 = r4
        L20:
            return r1
        L21:
            int r2 = r0.f18314b
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            int r5 = r1.length
            java.lang.StackTraceElement[] r5 = new java.lang.StackTraceElement[r5]
            r6 = 1
            r7 = 0
            r8 = 0
            r9 = 1
        L2f:
            int r10 = r1.length
            if (r7 >= r10) goto L88
            r10 = r1[r7]
            java.lang.Object r11 = r4.get(r10)
            java.lang.Integer r11 = (java.lang.Integer) r11
            if (r11 == 0) goto L75
            int r12 = r11.intValue()
            int r13 = r7 - r12
            int r14 = r7 + r13
            int r15 = r1.length
            if (r14 <= r15) goto L48
            goto L59
        L48:
            r14 = 0
        L49:
            if (r14 >= r13) goto L5f
            int r15 = r12 + r14
            r15 = r1[r15]
            int r16 = r7 + r14
            r3 = r1[r16]
            boolean r3 = r15.equals(r3)
            if (r3 != 0) goto L5b
        L59:
            r3 = 0
            goto L60
        L5b:
            int r14 = r14 + 1
            r3 = 0
            goto L49
        L5f:
            r3 = 1
        L60:
            if (r3 != 0) goto L63
            goto L75
        L63:
            int r3 = r11.intValue()
            int r3 = r7 - r3
            if (r9 >= r2) goto L71
            java.lang.System.arraycopy(r1, r7, r5, r8, r3)
            int r8 = r8 + r3
            int r9 = r9 + 1
        L71:
            int r3 = r3 + (-1)
            int r3 = r3 + r7
            goto L7d
        L75:
            r3 = r1[r7]
            r5[r8] = r3
            int r8 = r8 + 1
            r3 = r7
            r9 = 1
        L7d:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r4.put(r10, r7)
            int r7 = r3 + 1
            r3 = 0
            goto L2f
        L88:
            java.lang.StackTraceElement[] r2 = new java.lang.StackTraceElement[r8]
            r3 = 0
            java.lang.System.arraycopy(r5, r3, r2, r3, r8)
            int r3 = r1.length
            if (r8 >= r3) goto L92
            r1 = r2
        L92:
            return r1
    }
}
