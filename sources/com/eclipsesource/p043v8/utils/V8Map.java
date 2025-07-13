package com.eclipsesource.p043v8.utils;

/* loaded from: classes.dex */
public class V8Map<V> implements java.util.Map<com.eclipsesource.p043v8.V8Value, V>, com.eclipsesource.p043v8.Releasable {
    private java.util.Map<com.eclipsesource.p043v8.V8Value, V> map;
    private java.util.Map<com.eclipsesource.p043v8.V8Value, com.eclipsesource.p043v8.V8Value> twinMap;

    public V8Map() {
            r1 = this;
            r1.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.map = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.twinMap = r0
            return
    }

    @Override // java.util.Map
    public void clear() {
            r2 = this;
            java.util.Map<com.eclipsesource.v8.V8Value, V> r0 = r2.map
            r0.clear()
            java.util.Map<com.eclipsesource.v8.V8Value, com.eclipsesource.v8.V8Value> r0 = r2.twinMap
            java.util.Set r0 = r0.keySet()
            java.util.Iterator r0 = r0.iterator()
        Lf:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1f
            java.lang.Object r1 = r0.next()
            com.eclipsesource.v8.V8Value r1 = (com.eclipsesource.p043v8.V8Value) r1
            r1.close()
            goto Lf
        L1f:
            java.util.Map<com.eclipsesource.v8.V8Value, com.eclipsesource.v8.V8Value> r0 = r2.twinMap
            r0.clear()
            return
    }

    @Override // com.eclipsesource.p043v8.Releasable, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
            r0 = this;
            r0.clear()
            return
    }

    @Override // java.util.Map
    public boolean containsKey(java.lang.Object r2) {
            r1 = this;
            java.util.Map<com.eclipsesource.v8.V8Value, V> r0 = r1.map
            boolean r2 = r0.containsKey(r2)
            return r2
    }

    @Override // java.util.Map
    public boolean containsValue(java.lang.Object r2) {
            r1 = this;
            java.util.Map<com.eclipsesource.v8.V8Value, V> r0 = r1.map
            boolean r2 = r0.containsValue(r2)
            return r2
    }

    @Override // java.util.Map
    public java.util.Set<java.util.Map.Entry<com.eclipsesource.p043v8.V8Value, V>> entrySet() {
            r1 = this;
            java.util.Map<com.eclipsesource.v8.V8Value, V> r0 = r1.map
            java.util.Set r0 = r0.entrySet()
            return r0
    }

    @Override // java.util.Map
    public V get(java.lang.Object r2) {
            r1 = this;
            java.util.Map<com.eclipsesource.v8.V8Value, V> r0 = r1.map
            java.lang.Object r2 = r0.get(r2)
            return r2
    }

    @Override // java.util.Map
    public boolean isEmpty() {
            r1 = this;
            java.util.Map<com.eclipsesource.v8.V8Value, V> r0 = r1.map
            boolean r0 = r0.isEmpty()
            return r0
    }

    @Override // java.util.Map
    public java.util.Set<com.eclipsesource.p043v8.V8Value> keySet() {
            r1 = this;
            java.util.Map<com.eclipsesource.v8.V8Value, V> r0 = r1.map
            java.util.Set r0 = r0.keySet()
            return r0
    }

    /* renamed from: put, reason: avoid collision after fix types in other method */
    public V put2(com.eclipsesource.p043v8.V8Value r2, V r3) {
            r1 = this;
            r1.remove(r2)
            com.eclipsesource.v8.V8Value r2 = r2.twin()
            java.util.Map<com.eclipsesource.v8.V8Value, com.eclipsesource.v8.V8Value> r0 = r1.twinMap
            r0.put(r2, r2)
            java.util.Map<com.eclipsesource.v8.V8Value, V> r0 = r1.map
            java.lang.Object r2 = r0.put(r2, r3)
            return r2
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ java.lang.Object put(com.eclipsesource.p043v8.V8Value r1, java.lang.Object r2) {
            r0 = this;
            com.eclipsesource.v8.V8Value r1 = (com.eclipsesource.p043v8.V8Value) r1
            java.lang.Object r1 = r0.put2(r1, r2)
            return r1
    }

    @Override // java.util.Map
    public void putAll(java.util.Map<? extends com.eclipsesource.p043v8.V8Value, ? extends V> r3) {
            r2 = this;
            java.util.Set r3 = r3.entrySet()
            java.util.Iterator r3 = r3.iterator()
        L8:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L22
            java.lang.Object r0 = r3.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getKey()
            com.eclipsesource.v8.V8Value r1 = (com.eclipsesource.p043v8.V8Value) r1
            java.lang.Object r0 = r0.getValue()
            r2.put2(r1, r0)
            goto L8
        L22:
            return
    }

    @Override // com.eclipsesource.p043v8.Releasable
    @java.lang.Deprecated
    public void release() {
            r0 = this;
            r0.close()
            return
    }

    @Override // java.util.Map
    public V remove(java.lang.Object r3) {
            r2 = this;
            java.util.Map<com.eclipsesource.v8.V8Value, V> r0 = r2.map
            java.lang.Object r0 = r0.remove(r3)
            java.util.Map<com.eclipsesource.v8.V8Value, com.eclipsesource.v8.V8Value> r1 = r2.twinMap
            java.lang.Object r3 = r1.remove(r3)
            com.eclipsesource.v8.V8Value r3 = (com.eclipsesource.p043v8.V8Value) r3
            if (r3 == 0) goto L13
            r3.close()
        L13:
            return r0
    }

    @Override // java.util.Map
    public int size() {
            r1 = this;
            java.util.Map<com.eclipsesource.v8.V8Value, V> r0 = r1.map
            int r0 = r0.size()
            return r0
    }

    @Override // java.util.Map
    public java.util.Collection<V> values() {
            r1 = this;
            java.util.Map<com.eclipsesource.v8.V8Value, V> r0 = r1.map
            java.util.Collection r0 = r0.values()
            return r0
    }
}
