package com.eclipsesource.p043v8.utils;

/* loaded from: classes.dex */
class V8PropertyMap<V> implements java.util.Map<java.lang.String, V> {
    private java.util.Hashtable<java.lang.String, V> map;
    private java.util.Set<java.lang.String> nulls;

    public V8PropertyMap() {
            r1 = this;
            r1.<init>()
            java.util.Hashtable r0 = new java.util.Hashtable
            r0.<init>()
            r1.map = r0
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r1.nulls = r0
            return
    }

    @Override // java.util.Map
    public void clear() {
            r1 = this;
            java.util.Hashtable<java.lang.String, V> r0 = r1.map
            r0.clear()
            java.util.Set<java.lang.String> r0 = r1.nulls
            r0.clear()
            return
    }

    @Override // java.util.Map
    public boolean containsKey(java.lang.Object r2) {
            r1 = this;
            java.util.Hashtable<java.lang.String, V> r0 = r1.map
            boolean r0 = r0.containsKey(r2)
            if (r0 != 0) goto L13
            java.util.Set<java.lang.String> r0 = r1.nulls
            boolean r2 = r0.contains(r2)
            if (r2 == 0) goto L11
            goto L13
        L11:
            r2 = 0
            goto L14
        L13:
            r2 = 1
        L14:
            return r2
    }

    @Override // java.util.Map
    public boolean containsValue(java.lang.Object r2) {
            r1 = this;
            if (r2 != 0) goto Lc
            java.util.Set<java.lang.String> r0 = r1.nulls
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto Lc
            r2 = 1
            return r2
        Lc:
            if (r2 != 0) goto L10
            r2 = 0
            return r2
        L10:
            java.util.Hashtable<java.lang.String, V> r0 = r1.map
            boolean r2 = r0.containsValue(r2)
            return r2
    }

    @Override // java.util.Map
    public java.util.Set<java.util.Map.Entry<java.lang.String, V>> entrySet() {
            r5 = this;
            java.util.HashSet r0 = new java.util.HashSet
            java.util.Hashtable<java.lang.String, V> r1 = r5.map
            java.util.Set r1 = r1.entrySet()
            r0.<init>(r1)
            java.util.Set<java.lang.String> r1 = r5.nulls
            java.util.Iterator r1 = r1.iterator()
        L11:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L27
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            java.util.AbstractMap$SimpleEntry r3 = new java.util.AbstractMap$SimpleEntry
            r4 = 0
            r3.<init>(r2, r4)
            r0.add(r3)
            goto L11
        L27:
            return r0
    }

    @Override // java.util.Map
    public V get(java.lang.Object r2) {
            r1 = this;
            java.util.Set<java.lang.String> r0 = r1.nulls
            boolean r0 = r0.contains(r2)
            if (r0 == 0) goto La
            r2 = 0
            return r2
        La:
            java.util.Hashtable<java.lang.String, V> r0 = r1.map
            java.lang.Object r2 = r0.get(r2)
            return r2
    }

    @Override // java.util.Map
    public boolean isEmpty() {
            r1 = this;
            java.util.Hashtable<java.lang.String, V> r0 = r1.map
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L12
            java.util.Set<java.lang.String> r0 = r1.nulls
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L12
            r0 = 1
            goto L13
        L12:
            r0 = 0
        L13:
            return r0
    }

    @Override // java.util.Map
    public java.util.Set<java.lang.String> keySet() {
            r2 = this;
            java.util.HashSet r0 = new java.util.HashSet
            java.util.Hashtable<java.lang.String, V> r1 = r2.map
            java.util.Set r1 = r1.keySet()
            r0.<init>(r1)
            java.util.Set<java.lang.String> r1 = r2.nulls
            r0.addAll(r1)
            return r0
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ java.lang.Object put(java.lang.String r1, java.lang.Object r2) {
            r0 = this;
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r1 = r0.put2(r1, r2)
            return r1
    }

    /* renamed from: put, reason: avoid collision after fix types in other method */
    public V put2(java.lang.String r2, V r3) {
            r1 = this;
            if (r3 != 0) goto L16
            java.util.Hashtable<java.lang.String, V> r3 = r1.map
            boolean r3 = r3.containsKey(r2)
            if (r3 == 0) goto Lf
            java.util.Hashtable<java.lang.String, V> r3 = r1.map
            r3.remove(r2)
        Lf:
            java.util.Set<java.lang.String> r3 = r1.nulls
            r3.add(r2)
            r2 = 0
            return r2
        L16:
            java.util.Set<java.lang.String> r0 = r1.nulls
            boolean r0 = r0.contains(r2)
            if (r0 == 0) goto L23
            java.util.Set<java.lang.String> r0 = r1.nulls
            r0.remove(r2)
        L23:
            java.util.Hashtable<java.lang.String, V> r0 = r1.map
            java.lang.Object r2 = r0.put(r2, r3)
            return r2
    }

    @Override // java.util.Map
    public void putAll(java.util.Map<? extends java.lang.String, ? extends V> r3) {
            r2 = this;
            java.util.Set r3 = r3.entrySet()
            java.util.Iterator r3 = r3.iterator()
        L8:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L22
            java.lang.Object r0 = r3.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getKey()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r0 = r0.getValue()
            r2.put2(r1, r0)
            goto L8
        L22:
            return
    }

    @Override // java.util.Map
    public V remove(java.lang.Object r2) {
            r1 = this;
            java.util.Set<java.lang.String> r0 = r1.nulls
            boolean r0 = r0.contains(r2)
            if (r0 == 0) goto Lf
            java.util.Set<java.lang.String> r0 = r1.nulls
            r0.remove(r2)
            r2 = 0
            return r2
        Lf:
            java.util.Hashtable<java.lang.String, V> r0 = r1.map
            java.lang.Object r2 = r0.remove(r2)
            return r2
    }

    @Override // java.util.Map
    public int size() {
            r2 = this;
            java.util.Hashtable<java.lang.String, V> r0 = r2.map
            int r0 = r0.size()
            java.util.Set<java.lang.String> r1 = r2.nulls
            int r1 = r1.size()
            int r1 = r1 + r0
            return r1
    }

    @Override // java.util.Map
    public java.util.Collection<V> values() {
            r3 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            java.util.Hashtable<java.lang.String, V> r1 = r3.map
            java.util.Collection r1 = r1.values()
            r0.<init>(r1)
            r1 = 0
        Lc:
            java.util.Set<java.lang.String> r2 = r3.nulls
            int r2 = r2.size()
            if (r1 >= r2) goto L1b
            r2 = 0
            r0.add(r2)
            int r1 = r1 + 1
            goto Lc
        L1b:
            return r0
    }
}
