package p229n2;

import p229n2.InterfaceC4681k;

/* renamed from: n2.f */
/* loaded from: classes.dex */
public class C4676f<K extends p229n2.InterfaceC4681k, V> {

    /* renamed from: a */
    public final p229n2.C4676f.a<K, V> f18611a;

    /* renamed from: b */
    public final java.util.Map<K, p229n2.C4676f.a<K, V>> f18612b;

    /* renamed from: n2.f$a */
    public static class a<K, V> {

        /* renamed from: a */
        public final K f18613a;

        /* renamed from: b */
        public java.util.List<V> f18614b;

        /* renamed from: c */
        public p229n2.C4676f.a<K, V> f18615c;

        /* renamed from: d */
        public p229n2.C4676f.a<K, V> f18616d;

        public a() {
                r1 = this;
                r0 = 0
                r1.<init>(r0)
                return
        }

        public a(K r1) {
                r0 = this;
                r0.<init>()
                r0.f18616d = r0
                r0.f18615c = r0
                r0.f18613a = r1
                return
        }

        /* renamed from: a */
        public V m10698a() {
                r2 = this;
                java.util.List<V> r0 = r2.f18614b
                if (r0 == 0) goto L9
                int r0 = r0.size()
                goto La
            L9:
                r0 = 0
            La:
                if (r0 <= 0) goto L15
                java.util.List<V> r1 = r2.f18614b
                int r0 = r0 + (-1)
                java.lang.Object r0 = r1.remove(r0)
                goto L16
            L15:
                r0 = 0
            L16:
                return r0
        }
    }

    public C4676f() {
            r2 = this;
            r2.<init>()
            n2.f$a r0 = new n2.f$a
            r1 = 0
            r0.<init>(r1)
            r2.f18611a = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r2.f18612b = r0
            return
    }

    /* renamed from: a */
    public V m10695a(K r3) {
            r2 = this;
            java.util.Map<K extends n2.k, n2.f$a<K extends n2.k, V>> r0 = r2.f18612b
            java.lang.Object r0 = r0.get(r3)
            n2.f$a r0 = (p229n2.C4676f.a) r0
            if (r0 != 0) goto L15
            n2.f$a r0 = new n2.f$a
            r0.<init>(r3)
            java.util.Map<K extends n2.k, n2.f$a<K extends n2.k, V>> r1 = r2.f18612b
            r1.put(r3, r0)
            goto L18
        L15:
            r3.mo10704a()
        L18:
            n2.f$a<K, V> r3 = r0.f18616d
            n2.f$a<K, V> r1 = r0.f18615c
            r3.f18615c = r1
            n2.f$a<K, V> r1 = r0.f18615c
            r1.f18616d = r3
            n2.f$a<K extends n2.k, V> r3 = r2.f18611a
            r0.f18616d = r3
            n2.f$a<K, V> r3 = r3.f18615c
            r0.f18615c = r3
            r3.f18616d = r0
            n2.f$a<K, V> r3 = r0.f18616d
            r3.f18615c = r0
            java.lang.Object r3 = r0.m10698a()
            return r3
    }

    /* renamed from: b */
    public void m10696b(K r4, V r5) {
            r3 = this;
            java.util.Map<K extends n2.k, n2.f$a<K extends n2.k, V>> r0 = r3.f18612b
            java.lang.Object r0 = r0.get(r4)
            n2.f$a r0 = (p229n2.C4676f.a) r0
            if (r0 != 0) goto L2d
            n2.f$a r0 = new n2.f$a
            r0.<init>(r4)
            n2.f$a<K, V> r1 = r0.f18616d
            n2.f$a<K, V> r2 = r0.f18615c
            r1.f18615c = r2
            n2.f$a<K, V> r2 = r0.f18615c
            r2.f18616d = r1
            n2.f$a<K extends n2.k, V> r1 = r3.f18611a
            n2.f$a<K, V> r2 = r1.f18616d
            r0.f18616d = r2
            r0.f18615c = r1
            r1.f18616d = r0
            n2.f$a<K, V> r1 = r0.f18616d
            r1.f18615c = r0
            java.util.Map<K extends n2.k, n2.f$a<K extends n2.k, V>> r1 = r3.f18612b
            r1.put(r4, r0)
            goto L30
        L2d:
            r4.mo10704a()
        L30:
            java.util.List<V> r4 = r0.f18614b
            if (r4 != 0) goto L3b
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r0.f18614b = r4
        L3b:
            java.util.List<V> r4 = r0.f18614b
            r4.add(r5)
            return
    }

    /* renamed from: c */
    public V m10697c() {
            r3 = this;
            n2.f$a<K extends n2.k, V> r0 = r3.f18611a
        L2:
            n2.f$a<K, V> r0 = r0.f18616d
            n2.f$a<K extends n2.k, V> r1 = r3.f18611a
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L2c
            java.lang.Object r1 = r0.m10698a()
            if (r1 == 0) goto L13
            return r1
        L13:
            n2.f$a<K, V> r1 = r0.f18616d
            n2.f$a<K, V> r2 = r0.f18615c
            r1.f18615c = r2
            n2.f$a<K, V> r2 = r0.f18615c
            r2.f18616d = r1
            java.util.Map<K extends n2.k, n2.f$a<K extends n2.k, V>> r1 = r3.f18612b
            K r2 = r0.f18613a
            r1.remove(r2)
            K r1 = r0.f18613a
            n2.k r1 = (p229n2.InterfaceC4681k) r1
            r1.mo10704a()
            goto L2
        L2c:
            r0 = 0
            return r0
    }

    public java.lang.String toString() {
            r5 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "GroupedLinkedMap( "
            r0.<init>(r1)
            n2.f$a<K extends n2.k, V> r1 = r5.f18611a
            n2.f$a<K, V> r1 = r1.f18615c
            r2 = 0
            r3 = 0
        Ld:
            n2.f$a<K extends n2.k, V> r4 = r5.f18611a
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L3a
            r3 = 1
            r4 = 123(0x7b, float:1.72E-43)
            r0.append(r4)
            K r4 = r1.f18613a
            r0.append(r4)
            r4 = 58
            r0.append(r4)
            java.util.List<V> r4 = r1.f18614b
            if (r4 == 0) goto L2e
            int r4 = r4.size()
            goto L2f
        L2e:
            r4 = 0
        L2f:
            r0.append(r4)
            java.lang.String r4 = "}, "
            r0.append(r4)
            n2.f$a<K, V> r1 = r1.f18615c
            goto Ld
        L3a:
            if (r3 == 0) goto L49
            int r1 = r0.length()
            int r1 = r1 + (-2)
            int r2 = r0.length()
            r0.delete(r1, r2)
        L49:
            java.lang.String r1 = " )"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
