package p124h7;

import p124h7.InterfaceC2826qg;

/* renamed from: h7.rg */
/* loaded from: classes.dex */
public final class C2844rg<T extends p124h7.InterfaceC2826qg<T>> {

    /* renamed from: d */
    public static final /* synthetic */ int f11889d = 0;

    /* renamed from: a */
    public final p124h7.C2846s0<T, java.lang.Object> f11890a;

    /* renamed from: b */
    public boolean f11891b;

    /* renamed from: c */
    public boolean f11892c;

    static {
            h7.rg r0 = new h7.rg
            r1 = 1
            r0.<init>(r1)
            return
    }

    public C2844rg() {
            r2 = this;
            r2.<init>()
            h7.l0 r0 = new h7.l0
            r1 = 16
            r0.<init>(r1)
            r2.f11890a = r0
            return
    }

    public C2844rg(boolean r3) {
            r2 = this;
            h7.l0 r3 = new h7.l0
            r0 = 0
            r3.<init>(r0)
            r2.<init>()
            r2.f11890a = r3
            boolean r0 = r2.f11891b
            r1 = 1
            if (r0 == 0) goto L11
            goto L16
        L11:
            r3.mo6953a()
            r2.f11891b = r1
        L16:
            boolean r0 = r2.f11891b
            if (r0 == 0) goto L1b
            goto L20
        L1b:
            r3.mo6953a()
            r2.f11891b = r1
        L20:
            return
    }

    /* renamed from: b */
    public static final void m7108b(T r4, java.lang.Object r5) {
            h7.h1 r0 = r4.m7050b()
            java.nio.charset.Charset r1 = p124h7.C2575d.f11429a
            java.util.Objects.requireNonNull(r5)
            h7.h1 r1 = p124h7.EnumC2649h1.f11565Z
            h7.i1 r1 = p124h7.EnumC2667i1.f11597Z
            h7.i1 r0 = r0.f11567Y
            int r0 = r0.ordinal()
            switch(r0) {
                case 0: goto L3d;
                case 1: goto L3a;
                case 2: goto L37;
                case 3: goto L34;
                case 4: goto L31;
                case 5: goto L2e;
                case 6: goto L25;
                case 7: goto L1c;
                case 8: goto L17;
                default: goto L16;
            }
        L16:
            goto L42
        L17:
            boolean r0 = r5 instanceof p124h7.InterfaceC2935x
            if (r0 == 0) goto L42
            goto L41
        L1c:
            boolean r0 = r5 instanceof java.lang.Integer
            if (r0 != 0) goto L41
            boolean r0 = r5 instanceof p124h7.InterfaceC2538ah
            if (r0 == 0) goto L42
            goto L41
        L25:
            boolean r0 = r5 instanceof p124h7.AbstractC2574cg
            if (r0 != 0) goto L41
            boolean r0 = r5 instanceof byte[]
            if (r0 == 0) goto L42
            goto L41
        L2e:
            boolean r0 = r5 instanceof java.lang.String
            goto L3f
        L31:
            boolean r0 = r5 instanceof java.lang.Boolean
            goto L3f
        L34:
            boolean r0 = r5 instanceof java.lang.Double
            goto L3f
        L37:
            boolean r0 = r5 instanceof java.lang.Float
            goto L3f
        L3a:
            boolean r0 = r5 instanceof java.lang.Long
            goto L3f
        L3d:
            boolean r0 = r5 instanceof java.lang.Integer
        L3f:
            if (r0 == 0) goto L42
        L41:
            return
        L42:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = 3
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            int r3 = r4.m7049a()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r1[r2] = r3
            r2 = 1
            h7.h1 r4 = r4.m7050b()
            h7.i1 r4 = r4.f11567Y
            r1[r2] = r4
            r4 = 2
            java.lang.Class r5 = r5.getClass()
            java.lang.String r5 = r5.getName()
            r1[r4] = r5
            java.lang.String r4 = "Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n"
            java.lang.String r4 = java.lang.String.format(r4, r1)
            r0.<init>(r4)
            throw r0
    }

    /* renamed from: a */
    public final void m7109a(T r4, java.lang.Object r5) {
            r3 = this;
            boolean r0 = r4.m7051c()
            if (r0 == 0) goto L2f
            boolean r0 = r5 instanceof java.util.List
            if (r0 == 0) goto L27
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.List r5 = (java.util.List) r5
            r0.addAll(r5)
            int r5 = r0.size()
            r1 = 0
        L19:
            if (r1 >= r5) goto L25
            java.lang.Object r2 = r0.get(r1)
            m7108b(r4, r2)
            int r1 = r1 + 1
            goto L19
        L25:
            r5 = r0
            goto L32
        L27:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "Wrong object type used with protocol message reflection."
            r4.<init>(r5)
            throw r4
        L2f:
            m7108b(r4, r5)
        L32:
            h7.s0<T extends h7.qg<T>, java.lang.Object> r0 = r3.f11890a
            r0.m7114c(r4, r5)
            return
    }

    public final java.lang.Object clone() {
            r4 = this;
            h7.rg r0 = new h7.rg
            r0.<init>()
            r1 = 0
        L6:
            h7.s0<T extends h7.qg<T>, java.lang.Object> r2 = r4.f11890a
            int r2 = r2.m7113b()
            if (r1 >= r2) goto L24
            h7.s0<T extends h7.qg<T>, java.lang.Object> r2 = r4.f11890a
            java.util.Map$Entry r2 = r2.m7115d(r1)
            java.lang.Object r3 = r2.getKey()
            h7.qg r3 = (p124h7.InterfaceC2826qg) r3
            java.lang.Object r2 = r2.getValue()
            r0.m7109a(r3, r2)
            int r1 = r1 + 1
            goto L6
        L24:
            h7.s0<T extends h7.qg<T>, java.lang.Object> r1 = r4.f11890a
            java.util.Map<K extends java.lang.Comparable<K>, V> r2 = r1.f11898a0
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L31
            java.lang.Iterable<java.lang.Object> r1 = p124h7.C2774o0.f11795b
            goto L37
        L31:
            java.util.Map<K extends java.lang.Comparable<K>, V> r1 = r1.f11898a0
            java.util.Set r1 = r1.entrySet()
        L37:
            java.util.Iterator r1 = r1.iterator()
        L3b:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L55
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getKey()
            h7.qg r3 = (p124h7.InterfaceC2826qg) r3
            java.lang.Object r2 = r2.getValue()
            r0.m7109a(r3, r2)
            goto L3b
        L55:
            boolean r1 = r4.f11892c
            r0.f11892c = r1
            return r0
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            if (r1 != r2) goto L4
            r2 = 1
            return r2
        L4:
            boolean r0 = r2 instanceof p124h7.C2844rg
            if (r0 != 0) goto La
            r2 = 0
            return r2
        La:
            h7.rg r2 = (p124h7.C2844rg) r2
            h7.s0<T extends h7.qg<T>, java.lang.Object> r0 = r1.f11890a
            h7.s0<T extends h7.qg<T>, java.lang.Object> r2 = r2.f11890a
            boolean r2 = r0.equals(r2)
            return r2
    }

    public final int hashCode() {
            r1 = this;
            h7.s0<T extends h7.qg<T>, java.lang.Object> r0 = r1.f11890a
            int r0 = r0.hashCode()
            return r0
    }
}
