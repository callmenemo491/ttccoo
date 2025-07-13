package p319s;

/* renamed from: s.f */
/* loaded from: classes.dex */
public class C5939f<K, V> {

    /* renamed from: a */
    public final java.util.LinkedHashMap<K, V> f22783a;

    /* renamed from: b */
    public int f22784b;

    /* renamed from: c */
    public int f22785c;

    /* renamed from: d */
    public int f22786d;

    /* renamed from: e */
    public int f22787e;

    /* renamed from: f */
    public int f22788f;

    /* renamed from: g */
    public int f22789g;

    /* renamed from: h */
    public int f22790h;

    public C5939f(int r4) {
            r3 = this;
            r3.<init>()
            if (r4 <= 0) goto L13
            r3.f22785c = r4
            java.util.LinkedHashMap r4 = new java.util.LinkedHashMap
            r0 = 0
            r1 = 1061158912(0x3f400000, float:0.75)
            r2 = 1
            r4.<init>(r0, r1, r2)
            r3.f22783a = r4
            return
        L13:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "maxSize <= 0"
            r4.<init>(r0)
            throw r4
    }

    /* renamed from: a */
    public V mo11453a(K r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    /* renamed from: b */
    public final V m12329b(K r4) {
            r3 = this;
            java.lang.String r0 = "key == null"
            java.util.Objects.requireNonNull(r4, r0)
            monitor-enter(r3)
            java.util.LinkedHashMap<K, V> r0 = r3.f22783a     // Catch: java.lang.Throwable -> L4d
            java.lang.Object r0 = r0.get(r4)     // Catch: java.lang.Throwable -> L4d
            if (r0 == 0) goto L16
            int r4 = r3.f22789g     // Catch: java.lang.Throwable -> L4d
            int r4 = r4 + 1
            r3.f22789g = r4     // Catch: java.lang.Throwable -> L4d
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L4d
            return r0
        L16:
            int r0 = r3.f22790h     // Catch: java.lang.Throwable -> L4d
            int r0 = r0 + 1
            r3.f22790h = r0     // Catch: java.lang.Throwable -> L4d
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L4d
            java.lang.Object r0 = r3.mo11453a(r4)
            if (r0 != 0) goto L25
            r4 = 0
            return r4
        L25:
            monitor-enter(r3)
            int r1 = r3.f22787e     // Catch: java.lang.Throwable -> L4a
            int r1 = r1 + 1
            r3.f22787e = r1     // Catch: java.lang.Throwable -> L4a
            java.util.LinkedHashMap<K, V> r1 = r3.f22783a     // Catch: java.lang.Throwable -> L4a
            java.lang.Object r1 = r1.put(r4, r0)     // Catch: java.lang.Throwable -> L4a
            if (r1 == 0) goto L3a
            java.util.LinkedHashMap<K, V> r2 = r3.f22783a     // Catch: java.lang.Throwable -> L4a
            r2.put(r4, r1)     // Catch: java.lang.Throwable -> L4a
            goto L40
        L3a:
            int r4 = r3.f22784b     // Catch: java.lang.Throwable -> L4a
            int r4 = r4 + 1
            r3.f22784b = r4     // Catch: java.lang.Throwable -> L4a
        L40:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L4a
            if (r1 == 0) goto L44
            return r1
        L44:
            int r4 = r3.f22785c
            r3.m12331d(r4)
            return r0
        L4a:
            r4 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L4a
            throw r4
        L4d:
            r4 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L4d
            throw r4
    }

    /* renamed from: c */
    public final V m12330c(K r2, V r3) {
            r1 = this;
            if (r2 == 0) goto L29
            if (r3 == 0) goto L29
            monitor-enter(r1)
            int r0 = r1.f22786d     // Catch: java.lang.Throwable -> L26
            int r0 = r0 + 1
            r1.f22786d = r0     // Catch: java.lang.Throwable -> L26
            int r0 = r1.f22784b     // Catch: java.lang.Throwable -> L26
            int r0 = r0 + 1
            r1.f22784b = r0     // Catch: java.lang.Throwable -> L26
            java.util.LinkedHashMap<K, V> r0 = r1.f22783a     // Catch: java.lang.Throwable -> L26
            java.lang.Object r2 = r0.put(r2, r3)     // Catch: java.lang.Throwable -> L26
            if (r2 == 0) goto L1f
            int r3 = r1.f22784b     // Catch: java.lang.Throwable -> L26
            int r3 = r3 + (-1)
            r1.f22784b = r3     // Catch: java.lang.Throwable -> L26
        L1f:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L26
            int r3 = r1.f22785c
            r1.m12331d(r3)
            return r2
        L26:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L26
            throw r2
        L29:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r3 = "key == null || value == null"
            r2.<init>(r3)
            throw r2
    }

    /* renamed from: d */
    public void m12331d(int r3) {
            r2 = this;
        L0:
            monitor-enter(r2)
            int r0 = r2.f22784b     // Catch: java.lang.Throwable -> L69
            if (r0 < 0) goto L4a
            java.util.LinkedHashMap<K, V> r0 = r2.f22783a     // Catch: java.lang.Throwable -> L69
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L69
            if (r0 == 0) goto L11
            int r0 = r2.f22784b     // Catch: java.lang.Throwable -> L69
            if (r0 != 0) goto L4a
        L11:
            int r0 = r2.f22784b     // Catch: java.lang.Throwable -> L69
            if (r0 <= r3) goto L48
            java.util.LinkedHashMap<K, V> r0 = r2.f22783a     // Catch: java.lang.Throwable -> L69
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L69
            if (r0 == 0) goto L1e
            goto L48
        L1e:
            java.util.LinkedHashMap<K, V> r0 = r2.f22783a     // Catch: java.lang.Throwable -> L69
            java.util.Set r0 = r0.entrySet()     // Catch: java.lang.Throwable -> L69
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L69
            java.lang.Object r0 = r0.next()     // Catch: java.lang.Throwable -> L69
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch: java.lang.Throwable -> L69
            java.lang.Object r1 = r0.getKey()     // Catch: java.lang.Throwable -> L69
            r0.getValue()     // Catch: java.lang.Throwable -> L69
            java.util.LinkedHashMap<K, V> r0 = r2.f22783a     // Catch: java.lang.Throwable -> L69
            r0.remove(r1)     // Catch: java.lang.Throwable -> L69
            int r0 = r2.f22784b     // Catch: java.lang.Throwable -> L69
            int r0 = r0 + (-1)
            r2.f22784b = r0     // Catch: java.lang.Throwable -> L69
            int r0 = r2.f22788f     // Catch: java.lang.Throwable -> L69
            int r0 = r0 + 1
            r2.f22788f = r0     // Catch: java.lang.Throwable -> L69
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L69
            goto L0
        L48:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L69
            return
        L4a:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L69
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L69
            r0.<init>()     // Catch: java.lang.Throwable -> L69
            java.lang.Class r1 = r2.getClass()     // Catch: java.lang.Throwable -> L69
            java.lang.String r1 = r1.getName()     // Catch: java.lang.Throwable -> L69
            r0.append(r1)     // Catch: java.lang.Throwable -> L69
            java.lang.String r1 = ".sizeOf() is reporting inconsistent results!"
            r0.append(r1)     // Catch: java.lang.Throwable -> L69
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L69
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L69
            throw r3     // Catch: java.lang.Throwable -> L69
        L69:
            r3 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L69
            throw r3
    }

    public final synchronized java.lang.String toString() {
            r6 = this;
            monitor-enter(r6)
            int r0 = r6.f22789g     // Catch: java.lang.Throwable -> L3c
            int r1 = r6.f22790h     // Catch: java.lang.Throwable -> L3c
            int r1 = r1 + r0
            r2 = 0
            if (r1 == 0) goto Ld
            int r0 = r0 * 100
            int r0 = r0 / r1
            goto Le
        Ld:
            r0 = 0
        Le:
            java.util.Locale r1 = java.util.Locale.US     // Catch: java.lang.Throwable -> L3c
            java.lang.String r3 = "LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]"
            r4 = 4
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch: java.lang.Throwable -> L3c
            int r5 = r6.f22785c     // Catch: java.lang.Throwable -> L3c
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.Throwable -> L3c
            r4[r2] = r5     // Catch: java.lang.Throwable -> L3c
            r2 = 1
            int r5 = r6.f22789g     // Catch: java.lang.Throwable -> L3c
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.Throwable -> L3c
            r4[r2] = r5     // Catch: java.lang.Throwable -> L3c
            r2 = 2
            int r5 = r6.f22790h     // Catch: java.lang.Throwable -> L3c
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.Throwable -> L3c
            r4[r2] = r5     // Catch: java.lang.Throwable -> L3c
            r2 = 3
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> L3c
            r4[r2] = r0     // Catch: java.lang.Throwable -> L3c
            java.lang.String r0 = java.lang.String.format(r1, r3, r4)     // Catch: java.lang.Throwable -> L3c
            monitor-exit(r6)
            return r0
        L3c:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
    }
}
