package p185k7;

/* renamed from: k7.x */
/* loaded from: classes.dex */
public final class C4033x implements java.util.Comparator<p185k7.InterfaceC3916o> {

    /* renamed from: Y */
    public final /* synthetic */ p185k7.AbstractC3822h f16934Y;

    /* renamed from: Z */
    public final /* synthetic */ p365v.C6476c f16935Z;

    public C4033x(p185k7.AbstractC3822h r1, p365v.C6476c r2) {
            r0 = this;
            r0.f16934Y = r1
            r0.f16935Z = r2
            r0.<init>()
            return
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(p185k7.InterfaceC3916o r6, p185k7.InterfaceC3916o r7) {
            r5 = this;
            k7.o r6 = (p185k7.InterfaceC3916o) r6
            k7.o r7 = (p185k7.InterfaceC3916o) r7
            k7.h r0 = r5.f16934Y
            v.c r1 = r5.f16935Z
            boolean r2 = r6 instanceof p185k7.C3968s
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L14
            boolean r6 = r7 instanceof p185k7.C3968s
            if (r6 != 0) goto L13
            goto L45
        L13:
            return r4
        L14:
            boolean r2 = r7 instanceof p185k7.C3968s
            if (r2 == 0) goto L1a
            r3 = -1
            goto L45
        L1a:
            if (r0 != 0) goto L29
            java.lang.String r6 = r6.mo8357i()
            java.lang.String r7 = r7.mo8357i()
            int r3 = r6.compareTo(r7)
            goto L45
        L29:
            r2 = 2
            k7.o[] r2 = new p185k7.InterfaceC3916o[r2]
            r2[r4] = r6
            r2[r3] = r7
            java.util.List r6 = java.util.Arrays.asList(r2)
            k7.o r6 = r0.mo8522b(r1, r6)
            java.lang.Double r6 = r6.mo8355g()
            double r6 = r6.doubleValue()
            double r6 = p124h7.C2939x3.m7290p(r6)
            int r3 = (int) r6
        L45:
            return r3
    }
}
