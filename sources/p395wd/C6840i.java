package p395wd;

/* renamed from: wd.i */
/* loaded from: classes.dex */
public final class C6840i<T> implements java.util.Comparator {
    public C6840i() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // java.util.Comparator
    public final int compare(T r2, T r3) {
            r1 = this;
            od.w r3 = (p255od.C5235w) r3
            od.u r3 = r3.getIngredient()
            od.q0 r3 = r3.getTemplate()
            od.t r3 = r3.getImmutable_data()
            od.f0 r3 = r3.getRarity()
            r0 = 0
            if (r3 == 0) goto L1e
            int r3 = r3.getTacoValue()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            goto L1f
        L1e:
            r3 = r0
        L1f:
            od.w r2 = (p255od.C5235w) r2
            od.u r2 = r2.getIngredient()
            od.q0 r2 = r2.getTemplate()
            od.t r2 = r2.getImmutable_data()
            od.f0 r2 = r2.getRarity()
            if (r2 == 0) goto L3b
            int r2 = r2.getTacoValue()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
        L3b:
            int r2 = p079eh.C1850a.m4597b(r3, r0)
            return r2
    }
}
