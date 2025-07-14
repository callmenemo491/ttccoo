package p435yc;

/* renamed from: yc.a */
/* loaded from: classes.dex */
public class C7155a {

    /* renamed from: a */
    public static final p169jb.C3467j f27612a = null;

    static {
            jb.k r0 = new jb.k
            r0.<init>()
            r1 = 1
            r0.f14960g = r1
            jb.j r0 = r0.m7939a()
            p435yc.C7155a.f27612a = r0
            return
    }

    /* renamed from: a */
    public static java.util.Map<java.lang.String, java.lang.Object> m14268a(p169jb.C3476s r6) {
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            lb.r<java.lang.String, jb.p> r1 = r6.f14968a
            java.util.Set r1 = r1.keySet()
            lb.r$c r1 = (lb.C4255r.c) r1
            lb.r r1 = r1.f17445Y
            lb.r$e<K, V> r2 = r1.f17441c0
            lb.r$e<K, V> r2 = r2.f17453b0
            int r3 = r1.f17440b0
        L15:
            lb.r$e<K, V> r4 = r1.f17441c0
            if (r2 == r4) goto L1b
            r4 = 1
            goto L1c
        L1b:
            r4 = 0
        L1c:
            if (r4 == 0) goto L45
            lb.r$e<K, V> r4 = r1.f17441c0
            if (r2 == r4) goto L3f
            int r4 = r1.f17440b0
            if (r4 != r3) goto L39
            lb.r$e<K, V> r4 = r2.f17453b0
            K r2 = r2.f17455d0
            java.lang.String r2 = (java.lang.String) r2
            jb.p r5 = r6.m7949n(r2)
            java.lang.Object r5 = m14269b(r5)
            r0.put(r2, r5)
            r2 = r4
            goto L15
        L39:
            java.util.ConcurrentModificationException r6 = new java.util.ConcurrentModificationException
            r6.<init>()
            throw r6
        L3f:
            java.util.NoSuchElementException r6 = new java.util.NoSuchElementException
            r6.<init>()
            throw r6
        L45:
            return r0
    }

    /* renamed from: b */
    public static java.lang.Object m14269b(p169jb.AbstractC3473p r2) {
            java.util.Objects.requireNonNull(r2)
            boolean r0 = r2 instanceof p169jb.C3476s
            if (r0 == 0) goto Le
            jb.s r2 = (p169jb.C3476s) r2
            java.util.Map r2 = m14268a(r2)
            return r2
        Le:
            boolean r0 = r2 instanceof p169jb.C3470m
            if (r0 == 0) goto L32
            jb.m r2 = (p169jb.C3470m) r2
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r2 = r2.iterator()
        L1d:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L31
            java.lang.Object r1 = r2.next()
            jb.p r1 = (p169jb.AbstractC3473p) r1
            java.lang.Object r1 = m14269b(r1)
            r0.add(r1)
            goto L1d
        L31:
            return r0
        L32:
            boolean r0 = r2 instanceof p169jb.C3477t
            if (r0 == 0) goto L5b
            jb.t r2 = r2.m7947e()
            java.lang.Object r0 = r2.f14969a
            boolean r1 = r0 instanceof java.lang.String
            if (r1 == 0) goto L45
            java.lang.String r2 = r2.mo7944l()
            return r2
        L45:
            boolean r1 = r0 instanceof java.lang.Number
            if (r1 == 0) goto L4e
            java.lang.Number r2 = r2.m7953n()
            return r2
        L4e:
            boolean r0 = r0 instanceof java.lang.Boolean
            if (r0 == 0) goto L5b
            boolean r2 = r2.m7952m()
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            return r2
        L5b:
            r2 = 0
            return r2
    }

    /* renamed from: c */
    public static java.lang.String m14270c(java.lang.Object r1) {
            jb.j r0 = p435yc.C7155a.f27612a
            java.lang.String r1 = r0.m7935i(r1)
            return r1
    }
}
