package p185k7;

/* renamed from: k7.a0 */
/* loaded from: classes.dex */
public final class C3725a0 extends p185k7.AbstractC3994u {
    public C3725a0() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // p185k7.AbstractC3994u
    /* renamed from: a */
    public final p185k7.InterfaceC3916o mo8180a(java.lang.String r5, p365v.C6476c r6, java.util.List<p185k7.InterfaceC3916o> r7) {
            r4 = this;
            r0 = 0
            r1 = 1
            if (r5 == 0) goto L2f
            boolean r2 = r5.isEmpty()
            if (r2 != 0) goto L2f
            boolean r2 = r6.m13122n(r5)
            if (r2 == 0) goto L2f
            k7.o r2 = r6.m13119k(r5)
            boolean r3 = r2 instanceof p185k7.AbstractC3822h
            if (r3 == 0) goto L1f
            k7.h r2 = (p185k7.AbstractC3822h) r2
            k7.o r5 = r2.mo8522b(r6, r7)
            return r5
        L1f:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.Object[] r7 = new java.lang.Object[r1]
            r7[r0] = r5
            java.lang.String r5 = "Function %s is not defined"
            java.lang.String r5 = java.lang.String.format(r5, r7)
            r6.<init>(r5)
            throw r6
        L2f:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.Object[] r7 = new java.lang.Object[r1]
            r7[r0] = r5
            java.lang.String r5 = "Command not found: %s"
            java.lang.String r5 = java.lang.String.format(r5, r7)
            r6.<init>(r5)
            throw r6
    }
}
