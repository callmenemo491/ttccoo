package p185k7;

/* renamed from: k7.t7 */
/* loaded from: classes.dex */
public final class C3989t7 extends p185k7.C4067z7 {
    public C3989t7(int r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @Override // p185k7.C4067z7
    /* renamed from: a */
    public final void mo9015a() {
            r3 = this;
            boolean r0 = r3.f16987b0
            if (r0 != 0) goto L66
            r0 = 0
        L5:
            int r1 = r3.m9161b()
            if (r0 >= r1) goto L2b
            java.util.Map$Entry r1 = r3.m9163d(r0)
            java.lang.Object r2 = r1.getKey()
            k7.u5 r2 = (p185k7.InterfaceC4000u5) r2
            boolean r2 = r2.m9056c()
            if (r2 == 0) goto L28
            java.lang.Object r2 = r1.getValue()
            java.util.List r2 = (java.util.List) r2
            java.util.List r2 = java.util.Collections.unmodifiableList(r2)
            r1.setValue(r2)
        L28:
            int r0 = r0 + 1
            goto L5
        L2b:
            java.util.Map<K extends java.lang.Comparable<K>, V> r0 = r3.f16986a0
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L36
            java.lang.Iterable<java.lang.Object> r0 = p185k7.C4002u7.f16896b
            goto L3c
        L36:
            java.util.Map<K extends java.lang.Comparable<K>, V> r0 = r3.f16986a0
            java.util.Set r0 = r0.entrySet()
        L3c:
            java.util.Iterator r0 = r0.iterator()
        L40:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L66
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            k7.u5 r2 = (p185k7.InterfaceC4000u5) r2
            boolean r2 = r2.m9056c()
            if (r2 == 0) goto L40
            java.lang.Object r2 = r1.getValue()
            java.util.List r2 = (java.util.List) r2
            java.util.List r2 = java.util.Collections.unmodifiableList(r2)
            r1.setValue(r2)
            goto L40
        L66:
            super.mo9015a()
            return
    }
}
