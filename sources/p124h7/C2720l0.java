package p124h7;

/* renamed from: h7.l0 */
/* loaded from: classes.dex */
public final class C2720l0 extends p124h7.C2846s0 {
    public C2720l0(int r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @Override // p124h7.C2846s0
    /* renamed from: a */
    public final void mo6953a() {
            r3 = this;
            boolean r0 = r3.f11899b0
            if (r0 != 0) goto L66
            r0 = 0
        L5:
            int r1 = r3.m7113b()
            if (r0 >= r1) goto L2b
            java.util.Map$Entry r1 = r3.m7115d(r0)
            java.lang.Object r2 = r1.getKey()
            h7.qg r2 = (p124h7.InterfaceC2826qg) r2
            boolean r2 = r2.m7051c()
            if (r2 == 0) goto L28
            java.lang.Object r2 = r1.getValue()
            java.util.List r2 = (java.util.List) r2
            java.util.List r2 = java.util.Collections.unmodifiableList(r2)
            r1.setValue(r2)
        L28:
            int r0 = r0 + 1
            goto L5
        L2b:
            java.util.Map<K extends java.lang.Comparable<K>, V> r0 = r3.f11898a0
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L36
            java.lang.Iterable<java.lang.Object> r0 = p124h7.C2774o0.f11795b
            goto L3c
        L36:
            java.util.Map<K extends java.lang.Comparable<K>, V> r0 = r3.f11898a0
            java.util.Set r0 = r0.entrySet()
        L3c:
            java.util.Iterator r0 = r0.iterator()
        L40:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L66
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            h7.qg r2 = (p124h7.InterfaceC2826qg) r2
            boolean r2 = r2.m7051c()
            if (r2 == 0) goto L40
            java.lang.Object r2 = r1.getValue()
            java.util.List r2 = (java.util.List) r2
            java.util.List r2 = java.util.Collections.unmodifiableList(r2)
            r1.setValue(r2)
            goto L40
        L66:
            super.mo6953a()
            return
    }
}
