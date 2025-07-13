package p072e7;

import java.lang.Comparable;

/* renamed from: e7.v7 */
/* loaded from: classes.dex */
public class C1767v7<K extends java.lang.Comparable<K>, V> extends java.util.AbstractMap<K, V> {

    /* renamed from: e0 */
    public static final /* synthetic */ int f7818e0 = 0;

    /* renamed from: Y */
    public final int f7819Y;

    /* renamed from: Z */
    public java.util.List<p072e7.C1740s7> f7820Z;

    /* renamed from: a0 */
    public java.util.Map<K, V> f7821a0;

    /* renamed from: b0 */
    public boolean f7822b0;

    /* renamed from: c0 */
    public volatile p072e7.C1758u7 f7823c0;

    /* renamed from: d0 */
    public java.util.Map<K, V> f7824d0;

    public /* synthetic */ C1767v7(int r1) {
            r0 = this;
            r0.<init>()
            r0.f7819Y = r1
            java.util.List r1 = java.util.Collections.emptyList()
            r0.f7820Z = r1
            java.util.Map r1 = java.util.Collections.emptyMap()
            r0.f7821a0 = r1
            java.util.Map r1 = java.util.Collections.emptyMap()
            r0.f7824d0 = r1
            return
    }

    /* renamed from: a */
    public void mo4410a() {
            r1 = this;
            boolean r0 = r1.f7822b0
            if (r0 != 0) goto L31
            java.util.Map<K extends java.lang.Comparable<K>, V> r0 = r1.f7821a0
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L11
            java.util.Map r0 = java.util.Collections.emptyMap()
            goto L17
        L11:
            java.util.Map<K extends java.lang.Comparable<K>, V> r0 = r1.f7821a0
            java.util.Map r0 = java.util.Collections.unmodifiableMap(r0)
        L17:
            r1.f7821a0 = r0
            java.util.Map<K extends java.lang.Comparable<K>, V> r0 = r1.f7824d0
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L26
            java.util.Map r0 = java.util.Collections.emptyMap()
            goto L2c
        L26:
            java.util.Map<K extends java.lang.Comparable<K>, V> r0 = r1.f7824d0
            java.util.Map r0 = java.util.Collections.unmodifiableMap(r0)
        L2c:
            r1.f7824d0 = r0
            r0 = 1
            r1.f7822b0 = r0
        L31:
            return
    }

    /* renamed from: b */
    public final int m4463b() {
            r1 = this;
            java.util.List<e7.s7> r0 = r1.f7820Z
            int r0 = r0.size()
            return r0
    }

    /* renamed from: c */
    public final V m4464c(K r5, V r6) {
            r4 = this;
            r4.m4469h()
            int r0 = r4.m4466e(r5)
            if (r0 < 0) goto L1b
            java.util.List<e7.s7> r5 = r4.f7820Z
            java.lang.Object r5 = r5.get(r0)
            e7.s7 r5 = (p072e7.C1740s7) r5
            e7.v7 r0 = r5.f7782a0
            r0.m4469h()
            java.lang.Object r0 = r5.f7781Z
            r5.f7781Z = r6
            return r0
        L1b:
            r4.m4469h()
            java.util.List<e7.s7> r1 = r4.f7820Z
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L35
            java.util.List<e7.s7> r1 = r4.f7820Z
            boolean r1 = r1 instanceof java.util.ArrayList
            if (r1 != 0) goto L35
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = r4.f7819Y
            r1.<init>(r2)
            r4.f7820Z = r1
        L35:
            int r0 = r0 + 1
            int r0 = -r0
            int r1 = r4.f7819Y
            if (r0 < r1) goto L45
            java.util.SortedMap r0 = r4.m4468g()
            java.lang.Object r5 = r0.put(r5, r6)
            return r5
        L45:
            java.util.List<e7.s7> r1 = r4.f7820Z
            int r1 = r1.size()
            int r2 = r4.f7819Y
            if (r1 != r2) goto L64
            java.util.List<e7.s7> r1 = r4.f7820Z
            int r2 = r2 + (-1)
            java.lang.Object r1 = r1.remove(r2)
            e7.s7 r1 = (p072e7.C1740s7) r1
            java.util.SortedMap r2 = r4.m4468g()
            java.lang.Comparable r3 = r1.f7780Y
            java.lang.Object r1 = r1.f7781Z
            r2.put(r3, r1)
        L64:
            java.util.List<e7.s7> r1 = r4.f7820Z
            e7.s7 r2 = new e7.s7
            r2.<init>(r4, r5, r6)
            r1.add(r0, r2)
            r5 = 0
            return r5
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
            r1 = this;
            r1.m4469h()
            java.util.List<e7.s7> r0 = r1.f7820Z
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L10
            java.util.List<e7.s7> r0 = r1.f7820Z
            r0.clear()
        L10:
            java.util.Map<K extends java.lang.Comparable<K>, V> r0 = r1.f7821a0
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L1d
            java.util.Map<K extends java.lang.Comparable<K>, V> r0 = r1.f7821a0
            r0.clear()
        L1d:
            return
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(java.lang.Object r2) {
            r1 = this;
            java.lang.Comparable r2 = (java.lang.Comparable) r2
            int r0 = r1.m4466e(r2)
            if (r0 >= 0) goto L13
            java.util.Map<K extends java.lang.Comparable<K>, V> r0 = r1.f7821a0
            boolean r2 = r0.containsKey(r2)
            if (r2 == 0) goto L11
            goto L13
        L11:
            r2 = 0
            return r2
        L13:
            r2 = 1
            return r2
    }

    /* renamed from: d */
    public final java.util.Map.Entry<K, V> m4465d(int r2) {
            r1 = this;
            java.util.List<e7.s7> r0 = r1.f7820Z
            java.lang.Object r2 = r0.get(r2)
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            return r2
    }

    /* renamed from: e */
    public final int m4466e(K r5) {
            r4 = this;
            java.util.List<e7.s7> r0 = r4.f7820Z
            int r0 = r0.size()
            int r0 = r0 + (-1)
            r1 = 0
            if (r0 < 0) goto L23
            java.util.List<e7.s7> r2 = r4.f7820Z
            java.lang.Object r2 = r2.get(r0)
            e7.s7 r2 = (p072e7.C1740s7) r2
            java.lang.Comparable r2 = r2.f7780Y
            int r2 = r5.compareTo(r2)
            if (r2 <= 0) goto L1f
            int r0 = r0 + 2
            int r5 = -r0
            return r5
        L1f:
            if (r2 == 0) goto L22
            goto L23
        L22:
            return r0
        L23:
            if (r1 > r0) goto L44
            int r2 = r1 + r0
            int r2 = r2 / 2
            java.util.List<e7.s7> r3 = r4.f7820Z
            java.lang.Object r3 = r3.get(r2)
            e7.s7 r3 = (p072e7.C1740s7) r3
            java.lang.Comparable r3 = r3.f7780Y
            int r3 = r5.compareTo(r3)
            if (r3 >= 0) goto L3d
            int r2 = r2 + (-1)
            r0 = r2
            goto L23
        L3d:
            if (r3 <= 0) goto L43
            int r2 = r2 + 1
            r1 = r2
            goto L23
        L43:
            return r2
        L44:
            int r1 = r1 + 1
            int r5 = -r1
            return r5
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final java.util.Set<java.util.Map.Entry<K, V>> entrySet() {
            r1 = this;
            e7.u7 r0 = r1.f7823c0
            if (r0 != 0) goto Lb
            e7.u7 r0 = new e7.u7
            r0.<init>(r1)
            r1.f7823c0 = r0
        Lb:
            e7.u7 r0 = r1.f7823c0
            return r0
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(java.lang.Object r8) {
            r7 = this;
            r0 = 1
            if (r7 != r8) goto L4
            return r0
        L4:
            boolean r1 = r8 instanceof p072e7.C1767v7
            if (r1 != 0) goto Ld
            boolean r8 = super.equals(r8)
            return r8
        Ld:
            e7.v7 r8 = (p072e7.C1767v7) r8
            int r1 = r7.size()
            int r2 = r8.size()
            r3 = 0
            if (r1 == r2) goto L1b
            return r3
        L1b:
            int r2 = r7.m4463b()
            int r4 = r8.m4463b()
            if (r2 != r4) goto L46
            r4 = 0
        L26:
            if (r4 >= r2) goto L3a
            java.util.Map$Entry r5 = r7.m4465d(r4)
            java.util.Map$Entry r6 = r8.m4465d(r4)
            boolean r5 = r5.equals(r6)
            if (r5 != 0) goto L37
            return r3
        L37:
            int r4 = r4 + 1
            goto L26
        L3a:
            if (r2 == r1) goto L45
            java.util.Map<K extends java.lang.Comparable<K>, V> r0 = r7.f7821a0
            java.util.Map<K extends java.lang.Comparable<K>, V> r8 = r8.f7821a0
            boolean r8 = r0.equals(r8)
            return r8
        L45:
            return r0
        L46:
            java.util.Set r0 = r7.entrySet()
            java.util.Set r8 = r8.entrySet()
            java.util.AbstractSet r0 = (java.util.AbstractSet) r0
            boolean r8 = r0.equals(r8)
            return r8
    }

    /* renamed from: f */
    public final V m4467f(int r6) {
            r5 = this;
            r5.m4469h()
            java.util.List<e7.s7> r0 = r5.f7820Z
            java.lang.Object r6 = r0.remove(r6)
            e7.s7 r6 = (p072e7.C1740s7) r6
            java.lang.Object r6 = r6.f7781Z
            java.util.Map<K extends java.lang.Comparable<K>, V> r0 = r5.f7821a0
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L3e
            java.util.SortedMap r0 = r5.m4468g()
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
            java.util.List<e7.s7> r1 = r5.f7820Z
            e7.s7 r2 = new e7.s7
            java.lang.Object r3 = r0.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r3.getKey()
            java.lang.Comparable r4 = (java.lang.Comparable) r4
            java.lang.Object r3 = r3.getValue()
            r2.<init>(r5, r4, r3)
            r1.add(r2)
            r0.remove()
        L3e:
            return r6
    }

    /* renamed from: g */
    public final java.util.SortedMap<K, V> m4468g() {
            r1 = this;
            r1.m4469h()
            java.util.Map<K extends java.lang.Comparable<K>, V> r0 = r1.f7821a0
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L20
            java.util.Map<K extends java.lang.Comparable<K>, V> r0 = r1.f7821a0
            boolean r0 = r0 instanceof java.util.TreeMap
            if (r0 != 0) goto L20
            java.util.TreeMap r0 = new java.util.TreeMap
            r0.<init>()
            r1.f7821a0 = r0
            java.util.TreeMap r0 = (java.util.TreeMap) r0
            java.util.NavigableMap r0 = r0.descendingMap()
            r1.f7824d0 = r0
        L20:
            java.util.Map<K extends java.lang.Comparable<K>, V> r0 = r1.f7821a0
            java.util.SortedMap r0 = (java.util.SortedMap) r0
            return r0
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V get(java.lang.Object r2) {
            r1 = this;
            java.lang.Comparable r2 = (java.lang.Comparable) r2
            int r0 = r1.m4466e(r2)
            if (r0 < 0) goto L13
            java.util.List<e7.s7> r2 = r1.f7820Z
            java.lang.Object r2 = r2.get(r0)
            e7.s7 r2 = (p072e7.C1740s7) r2
            java.lang.Object r2 = r2.f7781Z
            return r2
        L13:
            java.util.Map<K extends java.lang.Comparable<K>, V> r0 = r1.f7821a0
            java.lang.Object r2 = r0.get(r2)
            return r2
    }

    /* renamed from: h */
    public final void m4469h() {
            r1 = this;
            boolean r0 = r1.f7822b0
            if (r0 != 0) goto L5
            return
        L5:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
            r4 = this;
            int r0 = r4.m4463b()
            r1 = 0
            r2 = 0
        L6:
            if (r1 >= r0) goto L18
            java.util.List<e7.s7> r3 = r4.f7820Z
            java.lang.Object r3 = r3.get(r1)
            e7.s7 r3 = (p072e7.C1740s7) r3
            int r3 = r3.hashCode()
            int r2 = r2 + r3
            int r1 = r1 + 1
            goto L6
        L18:
            java.util.Map<K extends java.lang.Comparable<K>, V> r0 = r4.f7821a0
            int r0 = r0.size()
            if (r0 <= 0) goto L28
            java.util.Map<K extends java.lang.Comparable<K>, V> r0 = r4.f7821a0
            int r0 = r0.hashCode()
            int r0 = r0 + r2
            return r0
        L28:
            return r2
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ java.lang.Object put(java.lang.Object r1, java.lang.Object r2) {
            r0 = this;
            java.lang.Comparable r1 = (java.lang.Comparable) r1
            java.lang.Object r1 = r0.m4464c(r1, r2)
            return r1
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V remove(java.lang.Object r2) {
            r1 = this;
            r1.m4469h()
            java.lang.Comparable r2 = (java.lang.Comparable) r2
            int r0 = r1.m4466e(r2)
            if (r0 < 0) goto L10
            java.lang.Object r2 = r1.m4467f(r0)
            return r2
        L10:
            java.util.Map<K extends java.lang.Comparable<K>, V> r0 = r1.f7821a0
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L1a
            r2 = 0
            return r2
        L1a:
            java.util.Map<K extends java.lang.Comparable<K>, V> r0 = r1.f7821a0
            java.lang.Object r2 = r0.remove(r2)
            return r2
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
            r2 = this;
            java.util.List<e7.s7> r0 = r2.f7820Z
            int r0 = r0.size()
            java.util.Map<K extends java.lang.Comparable<K>, V> r1 = r2.f7821a0
            int r1 = r1.size()
            int r1 = r1 + r0
            return r1
    }
}
