package p072e7;

import p072e7.InterfaceC1728r5;

/* renamed from: e7.s5 */
/* loaded from: classes.dex */
public final class C1738s5<T extends p072e7.InterfaceC1728r5<T>> {

    /* renamed from: d */
    public static final /* synthetic */ int f7774d = 0;

    /* renamed from: a */
    public final p072e7.C1767v7<T, java.lang.Object> f7775a;

    /* renamed from: b */
    public boolean f7776b;

    /* renamed from: c */
    public boolean f7777c;

    static {
            e7.s5 r0 = new e7.s5
            r1 = 1
            r0.<init>(r1)
            return
    }

    public C1738s5() {
            r2 = this;
            r2.<init>()
            e7.o7 r0 = new e7.o7
            r1 = 16
            r0.<init>(r1)
            r2.f7775a = r0
            return
    }

    public C1738s5(boolean r3) {
            r2 = this;
            e7.o7 r3 = new e7.o7
            r0 = 0
            r3.<init>(r0)
            r2.<init>()
            r2.f7775a = r3
            boolean r0 = r2.f7776b
            r1 = 1
            if (r0 == 0) goto L11
            goto L16
        L11:
            r3.mo4410a()
            r2.f7776b = r1
        L16:
            boolean r0 = r2.f7776b
            if (r0 == 0) goto L1b
            goto L20
        L1b:
            r3.mo4410a()
            r2.f7776b = r1
        L20:
            return
    }

    /* renamed from: b */
    public static final void m4437b(T r4, java.lang.Object r5) {
            e7.n8 r0 = r4.m4432b()
            java.nio.charset.Charset r1 = p072e7.C1619g6.f7568a
            java.util.Objects.requireNonNull(r5)
            e7.n8 r1 = p072e7.EnumC1691n8.f7707Z
            e7.o8 r1 = p072e7.EnumC1701o8.f7716Z
            e7.o8 r0 = r0.f7709Y
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
            boolean r0 = r5 instanceof p072e7.InterfaceC1560a7
            if (r0 == 0) goto L42
            goto L41
        L1c:
            boolean r0 = r5 instanceof java.lang.Integer
            if (r0 != 0) goto L41
            boolean r0 = r5 instanceof p072e7.InterfaceC1559a6
            if (r0 == 0) goto L42
            goto L41
        L25:
            boolean r0 = r5 instanceof p072e7.AbstractC1638i5
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
            int r3 = r4.m4431a()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r1[r2] = r3
            r2 = 1
            e7.n8 r4 = r4.m4432b()
            e7.o8 r4 = r4.f7709Y
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
    public final void m4438a(T r4, java.lang.Object r5) {
            r3 = this;
            boolean r0 = r4.m4433c()
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
            m4437b(r4, r2)
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
            m4437b(r4, r5)
        L32:
            e7.v7<T extends e7.r5<T>, java.lang.Object> r0 = r3.f7775a
            r0.m4464c(r4, r5)
            return
    }

    public final java.lang.Object clone() {
            r4 = this;
            e7.s5 r0 = new e7.s5
            r0.<init>()
            r1 = 0
        L6:
            e7.v7<T extends e7.r5<T>, java.lang.Object> r2 = r4.f7775a
            int r2 = r2.m4463b()
            if (r1 >= r2) goto L24
            e7.v7<T extends e7.r5<T>, java.lang.Object> r2 = r4.f7775a
            java.util.Map$Entry r2 = r2.m4465d(r1)
            java.lang.Object r3 = r2.getKey()
            e7.r5 r3 = (p072e7.InterfaceC1728r5) r3
            java.lang.Object r2 = r2.getValue()
            r0.m4438a(r3, r2)
            int r1 = r1 + 1
            goto L6
        L24:
            e7.v7<T extends e7.r5<T>, java.lang.Object> r1 = r4.f7775a
            java.util.Map<K extends java.lang.Comparable<K>, V> r2 = r1.f7821a0
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L31
            java.lang.Iterable<java.lang.Object> r1 = p072e7.C1730r7.f7768b
            goto L37
        L31:
            java.util.Map<K extends java.lang.Comparable<K>, V> r1 = r1.f7821a0
            java.util.Set r1 = r1.entrySet()
        L37:
            java.util.Iterator r1 = r1.iterator()
        L3b:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L55
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getKey()
            e7.r5 r3 = (p072e7.InterfaceC1728r5) r3
            java.lang.Object r2 = r2.getValue()
            r0.m4438a(r3, r2)
            goto L3b
        L55:
            boolean r1 = r4.f7777c
            r0.f7777c = r1
            return r0
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            if (r1 != r2) goto L4
            r2 = 1
            return r2
        L4:
            boolean r0 = r2 instanceof p072e7.C1738s5
            if (r0 != 0) goto La
            r2 = 0
            return r2
        La:
            e7.s5 r2 = (p072e7.C1738s5) r2
            e7.v7<T extends e7.r5<T>, java.lang.Object> r0 = r1.f7775a
            e7.v7<T extends e7.r5<T>, java.lang.Object> r2 = r2.f7775a
            boolean r2 = r0.equals(r2)
            return r2
    }

    public final int hashCode() {
            r1 = this;
            e7.v7<T extends e7.r5<T>, java.lang.Object> r0 = r1.f7775a
            int r0 = r0.hashCode()
            return r0
    }
}
