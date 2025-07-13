package p072e7;

/* renamed from: e7.o7 */
/* loaded from: classes.dex */
public final class C1700o7 extends p072e7.C1767v7 {
    public C1700o7(int r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @Override // p072e7.C1767v7
    /* renamed from: a */
    public final void mo4410a() {
            r3 = this;
            boolean r0 = r3.f7822b0
            if (r0 != 0) goto L66
            r0 = 0
        L5:
            int r1 = r3.m4463b()
            if (r0 >= r1) goto L2b
            java.util.Map$Entry r1 = r3.m4465d(r0)
            java.lang.Object r2 = r1.getKey()
            e7.r5 r2 = (p072e7.InterfaceC1728r5) r2
            boolean r2 = r2.m4433c()
            if (r2 == 0) goto L28
            java.lang.Object r2 = r1.getValue()
            java.util.List r2 = (java.util.List) r2
            java.util.List r2 = java.util.Collections.unmodifiableList(r2)
            r1.setValue(r2)
        L28:
            int r0 = r0 + 1
            goto L5
        L2b:
            java.util.Map<K extends java.lang.Comparable<K>, V> r0 = r3.f7821a0
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L36
            java.lang.Iterable<java.lang.Object> r0 = p072e7.C1730r7.f7768b
            goto L3c
        L36:
            java.util.Map<K extends java.lang.Comparable<K>, V> r0 = r3.f7821a0
            java.util.Set r0 = r0.entrySet()
        L3c:
            java.util.Iterator r0 = r0.iterator()
        L40:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L66
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            e7.r5 r2 = (p072e7.InterfaceC1728r5) r2
            boolean r2 = r2.m4433c()
            if (r2 == 0) goto L40
            java.lang.Object r2 = r1.getValue()
            java.util.List r2 = (java.util.List) r2
            java.util.List r2 = java.util.Collections.unmodifiableList(r2)
            r1.setValue(r2)
            goto L40
        L66:
            super.mo4410a()
            return
    }
}
