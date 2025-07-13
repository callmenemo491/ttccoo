package p062dh;

/* renamed from: dh.p */
/* loaded from: classes.dex */
public class C1480p extends p185k7.C4038x4 {
    /* renamed from: s */
    public static final <K, V> java.util.Map<K, V> m4014s(kotlin.Pair<? extends K, ? extends V>... r5) {
            int r0 = r5.length
            if (r0 <= 0) goto L1d
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            int r1 = r5.length
            int r1 = p185k7.C4038x4.m9097j(r1)
            r0.<init>(r1)
            int r1 = r5.length
            r2 = 0
        Lf:
            if (r2 >= r1) goto L1f
            r3 = r5[r2]
            A r4 = r3.f5050Y
            B r3 = r3.f5051Z
            r0.put(r4, r3)
            int r2 = r2 + 1
            goto Lf
        L1d:
            dh.l r0 = p062dh.C1476l.f7238Y
        L1f:
            return r0
    }

    /* renamed from: t */
    public static final <K, V> java.util.List<ch.C0978e<K, V>> m4015t(java.util.Map<? extends K, ? extends V> r4) {
            java.lang.String r0 = "<this>"
            p214m2.C4339q.m9706k(r4, r0)
            int r0 = r4.size()
            if (r0 != 0) goto Le
            dh.k r4 = p062dh.C1475k.f7237Y
            return r4
        Le:
            java.util.Set r0 = r4.entrySet()
            java.util.Iterator r0 = r0.iterator()
            boolean r1 = r0.hasNext()
            if (r1 != 0) goto L1f
            dh.k r4 = p062dh.C1475k.f7237Y
            return r4
        L1f:
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            boolean r2 = r0.hasNext()
            if (r2 != 0) goto L3d
            ch.e r4 = new ch.e
            java.lang.Object r0 = r1.getKey()
            java.lang.Object r1 = r1.getValue()
            r4.<init>(r0, r1)
            java.util.List r4 = p074e9.C1805a.m4528m(r4)
            return r4
        L3d:
            java.util.ArrayList r2 = new java.util.ArrayList
            int r4 = r4.size()
            r2.<init>(r4)
            ch.e r4 = new ch.e
            java.lang.Object r3 = r1.getKey()
            java.lang.Object r1 = r1.getValue()
            r4.<init>(r3, r1)
            r2.add(r4)
        L56:
            java.lang.Object r4 = r0.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            ch.e r1 = new ch.e
            java.lang.Object r3 = r4.getKey()
            java.lang.Object r4 = r4.getValue()
            r1.<init>(r3, r4)
            r2.add(r1)
            boolean r4 = r0.hasNext()
            if (r4 != 0) goto L56
            return r2
    }

    /* renamed from: u */
    public static final <K, V> java.util.Map<K, V> m4016u(java.lang.Iterable<? extends ch.C0978e<? extends K, ? extends V>> r3) {
            r0 = 1
            r1 = r3
            java.util.Collection r1 = (java.util.Collection) r1
            int r2 = r1.size()
            if (r2 == 0) goto L2b
            if (r2 == r0) goto L1d
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            int r1 = r1.size()
            int r1 = p185k7.C4038x4.m9097j(r1)
            r0.<init>(r1)
            m4017v(r3, r0)
            goto L2d
        L1d:
            java.util.List r3 = (java.util.List) r3
            r0 = 0
            java.lang.Object r3 = r3.get(r0)
            ch.e r3 = (ch.C0978e) r3
            java.util.Map r0 = p185k7.C4038x4.m9098k(r3)
            goto L2d
        L2b:
            dh.l r0 = p062dh.C1476l.f7238Y
        L2d:
            return r0
    }

    /* renamed from: v */
    public static final <K, V, M extends java.util.Map<? super K, ? super V>> M m4017v(java.lang.Iterable<? extends ch.C0978e<? extends K, ? extends V>> r2, M r3) {
            java.util.Iterator r2 = r2.iterator()
        L4:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L18
            java.lang.Object r0 = r2.next()
            ch.e r0 = (ch.C0978e) r0
            A r1 = r0.f5050Y
            B r0 = r0.f5051Z
            r3.put(r1, r0)
            goto L4
        L18:
            return r3
    }
}
