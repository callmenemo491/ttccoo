package p221m9;

/* renamed from: m9.h1 */
/* loaded from: classes.dex */
public class C4456h1 extends p221m9.C4459i1<p221m9.C4490t.a, java.lang.Object> {
    public C4456h1(int r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    @Override // p221m9.C4459i1
    /* renamed from: g */
    public void mo10071g() {
            r3 = this;
            boolean r0 = r3.f18165b0
            if (r0 != 0) goto L59
            r0 = 0
        L5:
            int r1 = r3.m10112d()
            if (r0 >= r1) goto L2b
            java.util.Map$Entry r1 = r3.m10111c(r0)
            java.lang.Object r2 = r1.getKey()
            m9.t$a r2 = (p221m9.C4490t.a) r2
            boolean r2 = r2.mo10314f()
            if (r2 == 0) goto L28
            java.lang.Object r2 = r1.getValue()
            java.util.List r2 = (java.util.List) r2
            java.util.List r2 = java.util.Collections.unmodifiableList(r2)
            r1.setValue(r2)
        L28:
            int r0 = r0 + 1
            goto L5
        L2b:
            java.lang.Iterable r0 = r3.m10113e()
            java.util.Iterator r0 = r0.iterator()
        L33:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L59
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            m9.t$a r2 = (p221m9.C4490t.a) r2
            boolean r2 = r2.mo10314f()
            if (r2 == 0) goto L33
            java.lang.Object r2 = r1.getValue()
            java.util.List r2 = (java.util.List) r2
            java.util.List r2 = java.util.Collections.unmodifiableList(r2)
            r1.setValue(r2)
            goto L33
        L59:
            super.mo10071g()
            return
    }
}
