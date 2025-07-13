package p185k7;

import p185k7.InterfaceC4000u5;

/* renamed from: k7.v5 */
/* loaded from: classes.dex */
public final class C4013v5<T extends p185k7.InterfaceC4000u5<T>> {

    /* renamed from: d */
    public static final /* synthetic */ int f16905d = 0;

    /* renamed from: a */
    public final p185k7.C4067z7<T, java.lang.Object> f16906a;

    /* renamed from: b */
    public boolean f16907b;

    /* renamed from: c */
    public boolean f16908c;

    static {
            k7.v5 r0 = new k7.v5
            r1 = 1
            r0.<init>(r1)
            return
    }

    public C4013v5() {
            r2 = this;
            r2.<init>()
            k7.t7 r0 = new k7.t7
            r1 = 16
            r0.<init>(r1)
            r2.f16906a = r0
            return
    }

    public C4013v5(boolean r3) {
            r2 = this;
            k7.t7 r3 = new k7.t7
            r0 = 0
            r3.<init>(r0)
            r2.<init>()
            r2.f16906a = r3
            boolean r0 = r2.f16907b
            r1 = 1
            if (r0 == 0) goto L11
            goto L16
        L11:
            r3.mo9015a()
            r2.f16907b = r1
        L16:
            boolean r0 = r2.f16907b
            if (r0 == 0) goto L1b
            goto L20
        L1b:
            r3.mo9015a()
            r2.f16907b = r1
        L20:
            return
    }

    /* renamed from: b */
    public static final void m9073b(T r4, java.lang.Object r5) {
            k7.n8 r0 = r4.m9055b()
            java.nio.charset.Charset r1 = p185k7.C3871k6.f16722a
            java.util.Objects.requireNonNull(r5)
            k7.n8 r1 = p185k7.EnumC3912n8.f16773Z
            k7.o8 r1 = p185k7.EnumC3925o8.f16812Z
            k7.o8 r0 = r0.f16775Y
            int r0 = r0.ordinal()
            switch(r0) {
                case 0: goto L39;
                case 1: goto L36;
                case 2: goto L33;
                case 3: goto L30;
                case 4: goto L2d;
                case 5: goto L2a;
                case 6: goto L21;
                case 7: goto L1c;
                case 8: goto L17;
                default: goto L16;
            }
        L16:
            goto L3e
        L17:
            boolean r0 = r5 instanceof p185k7.InterfaceC3802f7
            if (r0 == 0) goto L3e
            goto L3d
        L1c:
            boolean r0 = r5 instanceof java.lang.Integer
            if (r0 == 0) goto L3e
            goto L3d
        L21:
            boolean r0 = r5 instanceof p185k7.AbstractC3842i5
            if (r0 != 0) goto L3d
            boolean r0 = r5 instanceof byte[]
            if (r0 == 0) goto L3e
            goto L3d
        L2a:
            boolean r0 = r5 instanceof java.lang.String
            goto L3b
        L2d:
            boolean r0 = r5 instanceof java.lang.Boolean
            goto L3b
        L30:
            boolean r0 = r5 instanceof java.lang.Double
            goto L3b
        L33:
            boolean r0 = r5 instanceof java.lang.Float
            goto L3b
        L36:
            boolean r0 = r5 instanceof java.lang.Long
            goto L3b
        L39:
            boolean r0 = r5 instanceof java.lang.Integer
        L3b:
            if (r0 == 0) goto L3e
        L3d:
            return
        L3e:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = 3
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            int r3 = r4.m9054a()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r1[r2] = r3
            r2 = 1
            k7.n8 r4 = r4.m9055b()
            k7.o8 r4 = r4.f16775Y
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
    public final void m9074a(T r4, java.lang.Object r5) {
            r3 = this;
            boolean r0 = r4.m9056c()
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
            m9073b(r4, r2)
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
            m9073b(r4, r5)
        L32:
            k7.z7<T extends k7.u5<T>, java.lang.Object> r0 = r3.f16906a
            r0.m9162c(r4, r5)
            return
    }

    public final java.lang.Object clone() {
            r4 = this;
            k7.v5 r0 = new k7.v5
            r0.<init>()
            r1 = 0
        L6:
            k7.z7<T extends k7.u5<T>, java.lang.Object> r2 = r4.f16906a
            int r2 = r2.m9161b()
            if (r1 >= r2) goto L24
            k7.z7<T extends k7.u5<T>, java.lang.Object> r2 = r4.f16906a
            java.util.Map$Entry r2 = r2.m9163d(r1)
            java.lang.Object r3 = r2.getKey()
            k7.u5 r3 = (p185k7.InterfaceC4000u5) r3
            java.lang.Object r2 = r2.getValue()
            r0.m9074a(r3, r2)
            int r1 = r1 + 1
            goto L6
        L24:
            k7.z7<T extends k7.u5<T>, java.lang.Object> r1 = r4.f16906a
            java.util.Map<K extends java.lang.Comparable<K>, V> r2 = r1.f16986a0
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L31
            java.lang.Iterable<java.lang.Object> r1 = p185k7.C4002u7.f16896b
            goto L37
        L31:
            java.util.Map<K extends java.lang.Comparable<K>, V> r1 = r1.f16986a0
            java.util.Set r1 = r1.entrySet()
        L37:
            java.util.Iterator r1 = r1.iterator()
        L3b:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L55
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getKey()
            k7.u5 r3 = (p185k7.InterfaceC4000u5) r3
            java.lang.Object r2 = r2.getValue()
            r0.m9074a(r3, r2)
            goto L3b
        L55:
            boolean r1 = r4.f16908c
            r0.f16908c = r1
            return r0
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            if (r1 != r2) goto L4
            r2 = 1
            return r2
        L4:
            boolean r0 = r2 instanceof p185k7.C4013v5
            if (r0 != 0) goto La
            r2 = 0
            return r2
        La:
            k7.v5 r2 = (p185k7.C4013v5) r2
            k7.z7<T extends k7.u5<T>, java.lang.Object> r0 = r1.f16906a
            k7.z7<T extends k7.u5<T>, java.lang.Object> r2 = r2.f16906a
            boolean r2 = r0.equals(r2)
            return r2
    }

    public final int hashCode() {
            r1 = this;
            k7.z7<T extends k7.u5<T>, java.lang.Object> r0 = r1.f16906a
            int r0 = r0.hashCode()
            return r0
    }
}
