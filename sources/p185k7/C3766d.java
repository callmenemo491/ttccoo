package p185k7;

/* renamed from: k7.d */
/* loaded from: classes.dex */
public final class C3766d implements java.lang.Iterable<p185k7.InterfaceC3916o>, p185k7.InterfaceC3916o, p185k7.InterfaceC3864k {

    /* renamed from: Y */
    public final java.util.SortedMap<java.lang.Integer, p185k7.InterfaceC3916o> f16551Y;

    /* renamed from: Z */
    public final java.util.Map<java.lang.String, p185k7.InterfaceC3916o> f16552Z;

    public C3766d() {
            r1 = this;
            r1.<init>()
            java.util.TreeMap r0 = new java.util.TreeMap
            r0.<init>()
            r1.f16551Y = r0
            java.util.TreeMap r0 = new java.util.TreeMap
            r0.<init>()
            r1.f16552Z = r0
            return
    }

    public C3766d(java.util.List<p185k7.InterfaceC3916o> r3) {
            r2 = this;
            r2.<init>()
            if (r3 == 0) goto L18
            r0 = 0
        L6:
            int r1 = r3.size()
            if (r0 >= r1) goto L18
            java.lang.Object r1 = r3.get(r0)
            k7.o r1 = (p185k7.InterfaceC3916o) r1
            r2.m8350C(r0, r1)
            int r0 = r0 + 1
            goto L6
        L18:
            return
    }

    /* renamed from: A */
    public final void m8349A(int r5) {
            r4 = this;
            java.util.SortedMap<java.lang.Integer, k7.o> r0 = r4.f16551Y
            java.lang.Object r0 = r0.lastKey()
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            if (r5 > r0) goto L63
            if (r5 >= 0) goto L11
            goto L63
        L11:
            java.util.SortedMap<java.lang.Integer, k7.o> r1 = r4.f16551Y
            java.lang.Integer r2 = java.lang.Integer.valueOf(r5)
            r1.remove(r2)
            if (r5 != r0) goto L34
            java.util.SortedMap<java.lang.Integer, k7.o> r0 = r4.f16551Y
            int r5 = r5 + (-1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r5)
            boolean r0 = r0.containsKey(r1)
            if (r0 != 0) goto L33
            if (r5 < 0) goto L33
            java.util.SortedMap<java.lang.Integer, k7.o> r5 = r4.f16551Y
            k7.o r0 = p185k7.InterfaceC3916o.f16782G
            r5.put(r1, r0)
        L33:
            return
        L34:
            int r5 = r5 + 1
            java.util.SortedMap<java.lang.Integer, k7.o> r0 = r4.f16551Y
            java.lang.Object r0 = r0.lastKey()
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            if (r5 > r0) goto L63
            java.util.SortedMap<java.lang.Integer, k7.o> r0 = r4.f16551Y
            java.lang.Integer r1 = java.lang.Integer.valueOf(r5)
            java.lang.Object r0 = r0.get(r1)
            k7.o r0 = (p185k7.InterfaceC3916o) r0
            if (r0 == 0) goto L34
            java.util.SortedMap<java.lang.Integer, k7.o> r2 = r4.f16551Y
            int r3 = r5 + (-1)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r2.put(r3, r0)
            java.util.SortedMap<java.lang.Integer, k7.o> r0 = r4.f16551Y
            r0.remove(r1)
            goto L34
        L63:
            return
    }

    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"elements"})
    /* renamed from: C */
    public final void m8350C(int r3, p185k7.InterfaceC3916o r4) {
            r2 = this;
            r0 = 32468(0x7ed4, float:4.5497E-41)
            if (r3 > r0) goto L2a
            if (r3 < 0) goto L1c
            if (r4 != 0) goto L12
            java.util.SortedMap<java.lang.Integer, k7.o> r4 = r2.f16551Y
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r4.remove(r3)
            return
        L12:
            java.util.SortedMap<java.lang.Integer, k7.o> r0 = r2.f16551Y
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r0.put(r3, r4)
            return
        L1c:
            java.lang.IndexOutOfBoundsException r4 = new java.lang.IndexOutOfBoundsException
            r0 = 32
            java.lang.String r1 = "Out of bounds index: "
            java.lang.String r3 = p064e.C1490d.m4039a(r0, r1, r3)
            r4.<init>(r3)
            throw r4
        L2a:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "Array too large"
            r3.<init>(r4)
            throw r3
    }

    /* renamed from: D */
    public final boolean m8351D(int r4) {
            r3 = this;
            if (r4 < 0) goto L1b
            java.util.SortedMap<java.lang.Integer, k7.o> r0 = r3.f16551Y
            java.lang.Object r0 = r0.lastKey()
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            if (r4 > r0) goto L1b
            java.util.SortedMap<java.lang.Integer, k7.o> r0 = r3.f16551Y
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            boolean r4 = r0.containsKey(r4)
            return r4
        L1b:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            r1 = 32
            java.lang.String r2 = "Out of bounds index: "
            java.lang.String r4 = p064e.C1490d.m4039a(r1, r2, r4)
            r0.<init>(r4)
            throw r0
    }

    @Override // p185k7.InterfaceC3864k
    /* renamed from: a */
    public final boolean mo8352a(java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "length"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L13
            java.util.Map<java.lang.String, k7.o> r0 = r1.f16552Z
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

    @Override // p185k7.InterfaceC3916o
    /* renamed from: e */
    public final java.lang.Boolean mo8353e() {
            r1 = this;
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            return r0
    }

    public final boolean equals(java.lang.Object r6) {
            r5 = this;
            r0 = 1
            if (r6 != r5) goto L4
            return r0
        L4:
            boolean r1 = r6 instanceof p185k7.C3766d
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            k7.d r6 = (p185k7.C3766d) r6
            int r1 = r5.m8359m()
            int r3 = r6.m8359m()
            if (r1 == r3) goto L17
            return r2
        L17:
            java.util.SortedMap<java.lang.Integer, k7.o> r1 = r5.f16551Y
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L26
            java.util.SortedMap<java.lang.Integer, k7.o> r6 = r6.f16551Y
            boolean r6 = r6.isEmpty()
            return r6
        L26:
            java.util.SortedMap<java.lang.Integer, k7.o> r1 = r5.f16551Y
            java.lang.Object r1 = r1.firstKey()
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
        L32:
            java.util.SortedMap<java.lang.Integer, k7.o> r3 = r5.f16551Y
            java.lang.Object r3 = r3.lastKey()
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            if (r1 > r3) goto L52
            k7.o r3 = r5.m8362q(r1)
            k7.o r4 = r6.m8362q(r1)
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L4f
            return r2
        L4f:
            int r1 = r1 + 1
            goto L32
        L52:
            return r0
    }

    @Override // p185k7.InterfaceC3916o
    /* renamed from: f */
    public final p185k7.InterfaceC3916o mo8354f() {
            r5 = this;
            k7.d r0 = new k7.d
            r0.<init>()
            java.util.SortedMap<java.lang.Integer, k7.o> r1 = r5.f16551Y
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
        Lf:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L48
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getValue()
            boolean r3 = r3 instanceof p185k7.InterfaceC3864k
            if (r3 == 0) goto L32
            java.util.SortedMap<java.lang.Integer, k7.o> r3 = r0.f16551Y
            java.lang.Object r4 = r2.getKey()
            java.lang.Integer r4 = (java.lang.Integer) r4
            java.lang.Object r2 = r2.getValue()
            k7.o r2 = (p185k7.InterfaceC3916o) r2
            goto L44
        L32:
            java.util.SortedMap<java.lang.Integer, k7.o> r3 = r0.f16551Y
            java.lang.Object r4 = r2.getKey()
            java.lang.Integer r4 = (java.lang.Integer) r4
            java.lang.Object r2 = r2.getValue()
            k7.o r2 = (p185k7.InterfaceC3916o) r2
            k7.o r2 = r2.mo8354f()
        L44:
            r3.put(r4, r2)
            goto Lf
        L48:
            return r0
    }

    @Override // p185k7.InterfaceC3916o
    /* renamed from: g */
    public final java.lang.Double mo8355g() {
            r2 = this;
            java.util.SortedMap<java.lang.Integer, k7.o> r0 = r2.f16551Y
            int r0 = r0.size()
            r1 = 1
            if (r0 != r1) goto L13
            r0 = 0
            k7.o r0 = r2.m8362q(r0)
            java.lang.Double r0 = r0.mo8355g()
            return r0
        L13:
            java.util.SortedMap<java.lang.Integer, k7.o> r0 = r2.f16551Y
            int r0 = r0.size()
            if (r0 > 0) goto L22
            r0 = 0
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            return r0
        L22:
            r0 = 9221120237041090560(0x7ff8000000000000, double:NaN)
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            return r0
    }

    @Override // p185k7.InterfaceC3864k
    /* renamed from: h */
    public final void mo8356h(java.lang.String r2, p185k7.InterfaceC3916o r3) {
            r1 = this;
            if (r3 != 0) goto L8
            java.util.Map<java.lang.String, k7.o> r3 = r1.f16552Z
            r3.remove(r2)
            return
        L8:
            java.util.Map<java.lang.String, k7.o> r0 = r1.f16552Z
            r0.put(r2, r3)
            return
    }

    public final int hashCode() {
            r1 = this;
            java.util.SortedMap<java.lang.Integer, k7.o> r0 = r1.f16551Y
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            return r0
    }

    @Override // p185k7.InterfaceC3916o
    /* renamed from: i */
    public final java.lang.String mo8357i() {
            r1 = this;
            java.lang.String r0 = ","
            java.lang.String r0 = r1.m8363u(r0)
            return r0
    }

    @Override // java.lang.Iterable
    public final java.util.Iterator<p185k7.InterfaceC3916o> iterator() {
            r1 = this;
            k7.q r0 = new k7.q
            r0.<init>(r1)
            return r0
    }

    @Override // p185k7.InterfaceC3864k
    /* renamed from: l */
    public final p185k7.InterfaceC3916o mo8358l(java.lang.String r3) {
            r2 = this;
            java.lang.String r0 = "length"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L17
            k7.g r3 = new k7.g
            int r0 = r2.m8359m()
            double r0 = (double) r0
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            r3.<init>(r0)
            return r3
        L17:
            boolean r0 = r2.mo8352a(r3)
            if (r0 == 0) goto L28
            java.util.Map<java.lang.String, k7.o> r0 = r2.f16552Z
            java.lang.Object r3 = r0.get(r3)
            k7.o r3 = (p185k7.InterfaceC3916o) r3
            if (r3 == 0) goto L28
            return r3
        L28:
            k7.o r3 = p185k7.InterfaceC3916o.f16782G
            return r3
    }

    /* renamed from: m */
    public final int m8359m() {
            r1 = this;
            java.util.SortedMap<java.lang.Integer, k7.o> r0 = r1.f16551Y
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto La
            r0 = 0
            return r0
        La:
            java.util.SortedMap<java.lang.Integer, k7.o> r0 = r1.f16551Y
            java.lang.Object r0 = r0.lastKey()
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            int r0 = r0 + 1
            return r0
    }

    @Override // p185k7.InterfaceC3916o
    /* renamed from: n */
    public final java.util.Iterator<p185k7.InterfaceC3916o> mo8360n() {
            r3 = this;
            java.util.SortedMap<java.lang.Integer, k7.o> r0 = r3.f16551Y
            java.util.Set r0 = r0.keySet()
            java.util.Iterator r0 = r0.iterator()
            java.util.Map<java.lang.String, k7.o> r1 = r3.f16552Z
            java.util.Set r1 = r1.keySet()
            java.util.Iterator r1 = r1.iterator()
            k7.c r2 = new k7.c
            r2.<init>(r0, r1)
            return r2
    }

    @Override // p185k7.InterfaceC3916o
    /* renamed from: p */
    public final p185k7.InterfaceC3916o mo8361p(java.lang.String r21, p365v.C6476c r22, java.util.List<p185k7.InterfaceC3916o> r23) {
            r20 = this;
            r0 = r20
            r1 = r21
            r2 = r22
            r3 = r23
            java.lang.String r4 = "concat"
            boolean r5 = r4.equals(r1)
            java.lang.String r6 = "splice"
            java.lang.String r7 = "reduce"
            java.lang.String r8 = "toString"
            java.lang.String r9 = "filter"
            java.lang.String r10 = "forEach"
            java.lang.String r11 = "lastIndexOf"
            java.lang.String r12 = "map"
            java.lang.String r13 = "pop"
            java.lang.String r14 = "join"
            java.lang.String r15 = "some"
            r16 = r4
            java.lang.String r4 = "sort"
            java.lang.String r0 = "every"
            java.lang.String r2 = "shift"
            java.lang.String r3 = "slice"
            r17 = r8
            java.lang.String r8 = "reverse"
            r18 = r6
            java.lang.String r6 = "indexOf"
            if (r5 != 0) goto Ld4
            boolean r5 = r0.equals(r1)
            if (r5 != 0) goto Ld4
            boolean r5 = r9.equals(r1)
            if (r5 != 0) goto Ld4
            boolean r5 = r10.equals(r1)
            if (r5 != 0) goto Ld4
            boolean r5 = r6.equals(r1)
            if (r5 != 0) goto Ld4
            boolean r5 = r14.equals(r1)
            if (r5 != 0) goto Ld4
            boolean r5 = r11.equals(r1)
            if (r5 != 0) goto Ld4
            boolean r5 = r12.equals(r1)
            if (r5 != 0) goto Ld4
            boolean r5 = r13.equals(r1)
            if (r5 != 0) goto Ld4
            java.lang.String r5 = "push"
            boolean r5 = r5.equals(r1)
            if (r5 != 0) goto Ld4
            boolean r5 = r7.equals(r1)
            if (r5 != 0) goto Ld4
            java.lang.String r5 = "reduceRight"
            boolean r5 = r5.equals(r1)
            if (r5 != 0) goto Ld4
            boolean r5 = r8.equals(r1)
            if (r5 != 0) goto Ld4
            boolean r5 = r2.equals(r1)
            if (r5 != 0) goto Ld4
            boolean r5 = r3.equals(r1)
            if (r5 != 0) goto Ld4
            boolean r5 = r15.equals(r1)
            if (r5 != 0) goto Ld4
            boolean r5 = r4.equals(r1)
            if (r5 != 0) goto Ld4
            r5 = r18
            boolean r18 = r5.equals(r1)
            if (r18 != 0) goto Ld6
            r18 = r0
            r0 = r17
            boolean r17 = r0.equals(r1)
            if (r17 != 0) goto Lcd
            r17 = r2
            java.lang.String r2 = "unshift"
            boolean r2 = r2.equals(r1)
            if (r2 == 0) goto Lbd
            r2 = r18
            r19 = r17
            r17 = r0
            goto Ld9
        Lbd:
            k7.r r0 = new k7.r
            r0.<init>(r1)
            r2 = r20
            r3 = r22
            r1 = r23
            k7.o r0 = p185k7.C3836i.m8632q(r2, r0, r3, r1)
            return r0
        Lcd:
            r17 = r0
            r0 = r3
            r3 = r2
            r2 = r18
            goto Ldc
        Ld4:
            r5 = r18
        Ld6:
            r19 = r2
            r2 = r0
        Ld9:
            r0 = r3
            r3 = r19
        Ldc:
            int r18 = r21.hashCode()
            switch(r18) {
                case -1776922004: goto L19d;
                case -1354795244: goto L18e;
                case -1274492040: goto L186;
                case -934873754: goto L17d;
                case -895859076: goto L174;
                case -678635926: goto L16c;
                case -467511597: goto L164;
                case -277637751: goto L159;
                case 107868: goto L151;
                case 111185: goto L148;
                case 3267882: goto L140;
                case 3452698: goto L135;
                case 3536116: goto L12b;
                case 3536286: goto L121;
                case 96891675: goto L118;
                case 109407362: goto L10e;
                case 109526418: goto L104;
                case 965561430: goto Lf8;
                case 1099846370: goto Lee;
                case 1943291465: goto Le5;
                default: goto Le3;
            }
        Le3:
            goto L19a
        Le5:
            boolean r1 = r1.equals(r6)
            if (r1 == 0) goto L19a
            r1 = 4
            goto L197
        Lee:
            boolean r1 = r1.equals(r8)
            if (r1 == 0) goto L19a
            r1 = 12
            goto L197
        Lf8:
            java.lang.String r5 = "reduceRight"
            boolean r1 = r1.equals(r5)
            if (r1 == 0) goto L19a
            r1 = 11
            goto L197
        L104:
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L19a
            r1 = 14
            goto L197
        L10e:
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L19a
            r1 = 13
            goto L197
        L118:
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L19a
            r1 = 1
            goto L197
        L121:
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L19a
            r1 = 16
            goto L197
        L12b:
            boolean r1 = r1.equals(r15)
            if (r1 == 0) goto L19a
            r1 = 15
            goto L197
        L135:
            java.lang.String r5 = "push"
            boolean r1 = r1.equals(r5)
            if (r1 == 0) goto L19a
            r1 = 9
            goto L197
        L140:
            boolean r1 = r1.equals(r14)
            if (r1 == 0) goto L19a
            r1 = 5
            goto L197
        L148:
            boolean r1 = r1.equals(r13)
            if (r1 == 0) goto L19a
            r1 = 8
            goto L197
        L151:
            boolean r1 = r1.equals(r12)
            if (r1 == 0) goto L19a
            r1 = 7
            goto L197
        L159:
            java.lang.String r5 = "unshift"
            boolean r1 = r1.equals(r5)
            if (r1 == 0) goto L19a
            r1 = 19
            goto L197
        L164:
            boolean r1 = r1.equals(r11)
            if (r1 == 0) goto L19a
            r1 = 6
            goto L197
        L16c:
            boolean r1 = r1.equals(r10)
            if (r1 == 0) goto L19a
            r1 = 3
            goto L197
        L174:
            boolean r1 = r1.equals(r5)
            if (r1 == 0) goto L19a
            r1 = 17
            goto L197
        L17d:
            boolean r1 = r1.equals(r7)
            if (r1 == 0) goto L19a
            r1 = 10
            goto L197
        L186:
            boolean r1 = r1.equals(r9)
            if (r1 == 0) goto L19a
            r1 = 2
            goto L197
        L18e:
            r5 = r16
            boolean r1 = r1.equals(r5)
            if (r1 == 0) goto L19a
            r1 = 0
        L197:
            r5 = r17
            goto L1a9
        L19a:
            r5 = r17
            goto L1a8
        L19d:
            r5 = r17
            boolean r1 = r1.equals(r5)
            if (r1 == 0) goto L1a8
            r1 = 18
            goto L1a9
        L1a8:
            r1 = -1
        L1a9:
            r16 = -4616189618054758400(0xbff0000000000000, double:-1.0)
            java.lang.String r7 = "Callback should be a method"
            r18 = r2
            r2 = 0
            switch(r1) {
                case 0: goto L820;
                case 1: goto L7de;
                case 2: goto L77b;
                case 3: goto L745;
                case 4: goto L6b1;
                case 5: goto L66e;
                case 6: goto L5c2;
                case 7: goto L58e;
                case 8: goto L572;
                case 9: goto L53a;
                case 10: goto L52d;
                case 11: goto L525;
                case 12: goto L4ec;
                case 13: goto L4d2;
                case 14: goto L449;
                case 15: goto L3d3;
                case 16: goto L374;
                case 17: goto L267;
                case 18: goto L252;
                case 19: goto L1bd;
                default: goto L1b3;
            }
        L1b3:
            r0 = r20
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Command not supported"
            r1.<init>(r2)
            throw r1
        L1bd:
            boolean r0 = r23.isEmpty()
            if (r0 != 0) goto L240
            k7.d r0 = new k7.d
            r0.<init>()
            java.util.Iterator r1 = r23.iterator()
        L1cc:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L1f2
            java.lang.Object r2 = r1.next()
            k7.o r2 = (p185k7.InterfaceC3916o) r2
            r3 = r22
            k7.o r2 = r3.m13117i(r2)
            boolean r4 = r2 instanceof p185k7.C3794f
            if (r4 != 0) goto L1ea
            int r4 = r0.m8359m()
            r0.m8350C(r4, r2)
            goto L1cc
        L1ea:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Argument evaluation failed"
            r0.<init>(r1)
            throw r0
        L1f2:
            int r1 = r0.m8359m()
            java.util.Iterator r2 = r20.m8364w()
        L1fa:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L219
            java.lang.Object r3 = r2.next()
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r4 = r3.intValue()
            int r4 = r4 + r1
            int r3 = r3.intValue()
            r9 = r20
            k7.o r3 = r9.m8362q(r3)
            r0.m8350C(r4, r3)
            goto L1fa
        L219:
            r9 = r20
            java.util.SortedMap<java.lang.Integer, k7.o> r1 = r9.f16551Y
            r1.clear()
            java.util.Iterator r1 = r0.m8364w()
        L224:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L242
            java.lang.Object r2 = r1.next()
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r3 = r2.intValue()
            int r2 = r2.intValue()
            k7.o r2 = r0.m8362q(r2)
            r9.m8350C(r3, r2)
            goto L224
        L240:
            r9 = r20
        L242:
            k7.g r0 = new k7.g
            int r1 = r20.m8359m()
            double r1 = (double) r1
            java.lang.Double r1 = java.lang.Double.valueOf(r1)
            r0.<init>(r1)
            goto L76e
        L252:
            r9 = r20
            r0 = 0
            r1 = r23
            p124h7.C2939x3.m7264N(r5, r0, r1)
            k7.r r0 = new k7.r
            java.lang.String r1 = ","
            java.lang.String r1 = r9.m8363u(r1)
            r0.<init>(r1)
            goto L76e
        L267:
            r9 = r20
            r3 = r22
            r1 = r23
            r0 = 0
            boolean r4 = r23.isEmpty()
            if (r4 == 0) goto L27b
            k7.d r0 = new k7.d
            r0.<init>()
            goto L76e
        L27b:
            java.lang.Object r4 = r1.get(r0)
            k7.o r4 = (p185k7.InterfaceC3916o) r4
            k7.o r4 = r3.m13117i(r4)
            java.lang.Double r4 = r4.mo8355g()
            double r4 = r4.doubleValue()
            double r4 = p124h7.C2939x3.m7290p(r4)
            int r4 = (int) r4
            if (r4 >= 0) goto L29e
            int r5 = r20.m8359m()
            int r5 = r5 + r4
            int r4 = java.lang.Math.max(r0, r5)
            goto L2a8
        L29e:
            int r0 = r20.m8359m()
            if (r4 <= r0) goto L2a8
            int r4 = r20.m8359m()
        L2a8:
            int r0 = r20.m8359m()
            k7.d r5 = new k7.d
            r5.<init>()
            int r6 = r23.size()
            r7 = 1
            if (r6 <= r7) goto L35e
            java.lang.Object r2 = r1.get(r7)
            k7.o r2 = (p185k7.InterfaceC3916o) r2
            k7.o r2 = r3.m13117i(r2)
            java.lang.Double r2 = r2.mo8355g()
            double r6 = r2.doubleValue()
            double r6 = p124h7.C2939x3.m7290p(r6)
            int r2 = (int) r6
            r6 = 0
            int r2 = java.lang.Math.max(r6, r2)
            if (r2 <= 0) goto L2f0
            r6 = r4
        L2d7:
            int r7 = r4 + r2
            int r7 = java.lang.Math.min(r0, r7)
            if (r6 >= r7) goto L2f0
            k7.o r7 = r9.m8362q(r4)
            int r8 = r5.m8359m()
            r5.m8350C(r8, r7)
            r9.m8349A(r4)
            int r6 = r6 + 1
            goto L2d7
        L2f0:
            int r0 = r23.size()
            r2 = 2
            if (r0 <= r2) goto L371
            r0 = 2
        L2f8:
            int r2 = r23.size()
            if (r0 >= r2) goto L371
            java.lang.Object r2 = r1.get(r0)
            k7.o r2 = (p185k7.InterfaceC3916o) r2
            k7.o r2 = r3.m13117i(r2)
            boolean r6 = r2 instanceof p185k7.C3794f
            if (r6 != 0) goto L356
            int r6 = r4 + r0
            int r6 = r6 + (-2)
            if (r6 < 0) goto L348
            int r7 = r20.m8359m()
            if (r6 < r7) goto L319
            goto L342
        L319:
            java.util.SortedMap<java.lang.Integer, k7.o> r7 = r9.f16551Y
            java.lang.Object r7 = r7.lastKey()
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
        L325:
            if (r7 < r6) goto L342
            java.util.SortedMap<java.lang.Integer, k7.o> r8 = r9.f16551Y
            java.lang.Integer r10 = java.lang.Integer.valueOf(r7)
            java.lang.Object r8 = r8.get(r10)
            k7.o r8 = (p185k7.InterfaceC3916o) r8
            if (r8 == 0) goto L33f
            int r11 = r7 + 1
            r9.m8350C(r11, r8)
            java.util.SortedMap<java.lang.Integer, k7.o> r8 = r9.f16551Y
            r8.remove(r10)
        L33f:
            int r7 = r7 + (-1)
            goto L325
        L342:
            r9.m8350C(r6, r2)
            int r0 = r0 + 1
            goto L2f8
        L348:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = 32
            java.lang.String r2 = "Invalid value index: "
            java.lang.String r1 = p064e.C1490d.m4039a(r1, r2, r6)
            r0.<init>(r1)
            throw r0
        L356:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Failed to parse elements to add"
            r0.<init>(r1)
            throw r0
        L35e:
            if (r4 >= r0) goto L371
            k7.o r1 = r9.m8362q(r4)
            int r3 = r5.m8359m()
            r5.m8350C(r3, r1)
            r9.m8350C(r4, r2)
            int r4 = r4 + 1
            goto L35e
        L371:
            r0 = r5
            goto L76e
        L374:
            r9 = r20
            r3 = r22
            r1 = r23
            r0 = 1
            p124h7.C2939x3.m7268R(r4, r0, r1)
            int r0 = r20.m8359m()
            r4 = 2
            if (r0 >= r4) goto L387
            goto L522
        L387:
            java.util.List r0 = r20.m8365z()
            boolean r4 = r23.isEmpty()
            if (r4 != 0) goto L3ac
            r2 = 0
            java.lang.Object r1 = r1.get(r2)
            k7.o r1 = (p185k7.InterfaceC3916o) r1
            k7.o r1 = r3.m13117i(r1)
            boolean r2 = r1 instanceof p185k7.AbstractC3822h
            if (r2 == 0) goto L3a4
            r2 = r1
            k7.h r2 = (p185k7.AbstractC3822h) r2
            goto L3ac
        L3a4:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Comparator should be a method"
            r0.<init>(r1)
            throw r0
        L3ac:
            k7.x r1 = new k7.x
            r1.<init>(r2, r3)
            java.util.Collections.sort(r0, r1)
            java.util.SortedMap<java.lang.Integer, k7.o> r1 = r9.f16551Y
            r1.clear()
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            java.util.Iterator r0 = r0.iterator()
            r1 = 0
        L3c0:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L522
            int r2 = r1 + 1
            java.lang.Object r3 = r0.next()
            k7.o r3 = (p185k7.InterfaceC3916o) r3
            r9.m8350C(r1, r3)
            r1 = r2
            goto L3c0
        L3d3:
            r9 = r20
            r3 = r22
            r1 = r23
            r0 = 1
            p124h7.C2939x3.m7264N(r15, r0, r1)
            r0 = 0
            java.lang.Object r0 = r1.get(r0)
            k7.o r0 = (p185k7.InterfaceC3916o) r0
            k7.o r0 = r3.m13117i(r0)
            boolean r1 = r0 instanceof p185k7.AbstractC3822h
            if (r1 == 0) goto L443
            int r1 = r20.m8359m()
            if (r1 != 0) goto L3f3
            goto L43f
        L3f3:
            k7.h r0 = (p185k7.AbstractC3822h) r0
            java.util.Iterator r1 = r20.m8364w()
        L3f9:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L43f
            java.lang.Object r2 = r1.next()
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            boolean r4 = r9.m8351D(r2)
            if (r4 == 0) goto L3f9
            r4 = 3
            k7.o[] r4 = new p185k7.InterfaceC3916o[r4]
            k7.o r5 = r9.m8362q(r2)
            r6 = 0
            r4[r6] = r5
            k7.g r5 = new k7.g
            double r6 = (double) r2
            java.lang.Double r2 = java.lang.Double.valueOf(r6)
            r5.<init>(r2)
            r2 = 1
            r4[r2] = r5
            r2 = 2
            r4[r2] = r9
            java.util.List r2 = java.util.Arrays.asList(r4)
            k7.o r2 = r0.mo8522b(r3, r2)
            java.lang.Boolean r2 = r2.mo8353e()
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L3f9
            k7.o r0 = p185k7.InterfaceC3916o.f16787L
            goto L76e
        L43f:
            k7.o r0 = p185k7.InterfaceC3916o.f16788M
            goto L76e
        L443:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r7)
            throw r0
        L449:
            r9 = r20
            r3 = r22
            r1 = r23
            r2 = 2
            p124h7.C2939x3.m7268R(r0, r2, r1)
            boolean r0 = r23.isEmpty()
            if (r0 == 0) goto L45f
            k7.o r0 = r20.mo8354f()
            goto L76e
        L45f:
            int r0 = r20.m8359m()
            double r4 = (double) r0
            r0 = 0
            java.lang.Object r0 = r1.get(r0)
            k7.o r0 = (p185k7.InterfaceC3916o) r0
            k7.o r0 = r3.m13117i(r0)
            java.lang.Double r0 = r0.mo8355g()
            double r6 = r0.doubleValue()
            double r6 = p124h7.C2939x3.m7290p(r6)
            r10 = 0
            int r0 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r0 >= 0) goto L487
            double r6 = r6 + r4
            double r6 = java.lang.Math.max(r6, r10)
            goto L48b
        L487:
            double r6 = java.lang.Math.min(r6, r4)
        L48b:
            int r0 = r23.size()
            r2 = 2
            if (r0 != r2) goto L4b9
            r0 = 1
            java.lang.Object r0 = r1.get(r0)
            k7.o r0 = (p185k7.InterfaceC3916o) r0
            k7.o r0 = r3.m13117i(r0)
            java.lang.Double r0 = r0.mo8355g()
            double r0 = r0.doubleValue()
            double r0 = p124h7.C2939x3.m7290p(r0)
            r2 = 0
            int r8 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r8 >= 0) goto L4b5
            double r4 = r4 + r0
            double r4 = java.lang.Math.max(r4, r2)
            goto L4b9
        L4b5:
            double r4 = java.lang.Math.min(r4, r0)
        L4b9:
            k7.d r0 = new k7.d
            r0.<init>()
            int r1 = (int) r6
        L4bf:
            double r2 = (double) r1
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 >= 0) goto L76e
            k7.o r2 = r9.m8362q(r1)
            int r3 = r0.m8359m()
            r0.m8350C(r3, r2)
            int r1 = r1 + 1
            goto L4bf
        L4d2:
            r9 = r20
            r1 = r23
            r0 = r3
            r2 = 0
            p124h7.C2939x3.m7264N(r0, r2, r1)
            int r0 = r20.m8359m()
            if (r0 != 0) goto L4e3
            goto L76c
        L4e3:
            k7.o r0 = r9.m8362q(r2)
            r9.m8349A(r2)
            goto L76e
        L4ec:
            r9 = r20
            r1 = r23
            r0 = 0
            p124h7.C2939x3.m7264N(r8, r0, r1)
            int r0 = r20.m8359m()
            if (r0 == 0) goto L522
            r1 = 0
        L4fb:
            int r3 = r0 / 2
            if (r1 >= r3) goto L522
            boolean r3 = r9.m8351D(r1)
            if (r3 == 0) goto L51f
            k7.o r3 = r9.m8362q(r1)
            r9.m8350C(r1, r2)
            int r4 = r0 + (-1)
            int r4 = r4 - r1
            boolean r5 = r9.m8351D(r4)
            if (r5 == 0) goto L51c
            k7.o r5 = r9.m8362q(r4)
            r9.m8350C(r1, r5)
        L51c:
            r9.m8350C(r4, r3)
        L51f:
            int r1 = r1 + 1
            goto L4fb
        L522:
            r0 = r9
            goto L882
        L525:
            r9 = r20
            r3 = r22
            r1 = r23
            r0 = 0
            goto L534
        L52d:
            r9 = r20
            r3 = r22
            r1 = r23
            r0 = 1
        L534:
            k7.o r0 = p185k7.C3836i.m8636u(r9, r3, r1, r0)
            goto L76e
        L53a:
            r9 = r20
            r3 = r22
            r1 = r23
            boolean r0 = r23.isEmpty()
            if (r0 != 0) goto L562
            java.util.Iterator r0 = r23.iterator()
        L54a:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L562
            java.lang.Object r1 = r0.next()
            k7.o r1 = (p185k7.InterfaceC3916o) r1
            k7.o r1 = r3.m13117i(r1)
            int r2 = r20.m8359m()
            r9.m8350C(r2, r1)
            goto L54a
        L562:
            k7.g r0 = new k7.g
            int r1 = r20.m8359m()
            double r1 = (double) r1
            java.lang.Double r1 = java.lang.Double.valueOf(r1)
            r0.<init>(r1)
            goto L76e
        L572:
            r9 = r20
            r1 = r23
            r0 = 0
            p124h7.C2939x3.m7264N(r13, r0, r1)
            int r0 = r20.m8359m()
            if (r0 != 0) goto L582
            goto L76c
        L582:
            int r0 = r0 + (-1)
            k7.o r1 = r9.m8362q(r0)
            r9.m8349A(r0)
        L58b:
            r0 = r1
            goto L76e
        L58e:
            r9 = r20
            r3 = r22
            r1 = r23
            r0 = 0
            r4 = 1
            p124h7.C2939x3.m7264N(r12, r4, r1)
            java.lang.Object r0 = r1.get(r0)
            k7.o r0 = (p185k7.InterfaceC3916o) r0
            k7.o r0 = r3.m13117i(r0)
            boolean r1 = r0 instanceof p185k7.C3903n
            if (r1 == 0) goto L5bc
            int r1 = r20.m8359m()
            if (r1 != 0) goto L5b4
            k7.d r0 = new k7.d
            r0.<init>()
            goto L76e
        L5b4:
            k7.n r0 = (p185k7.C3903n) r0
            k7.d r0 = p185k7.C3836i.m8634s(r9, r3, r0, r2, r2)
            goto L76e
        L5bc:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r7)
            throw r0
        L5c2:
            r9 = r20
            r3 = r22
            r1 = r23
            r0 = 2
            p124h7.C2939x3.m7268R(r11, r0, r1)
            k7.o r0 = p185k7.InterfaceC3916o.f16782G
            boolean r2 = r23.isEmpty()
            if (r2 != 0) goto L5df
            r0 = 0
            java.lang.Object r0 = r1.get(r0)
            k7.o r0 = (p185k7.InterfaceC3916o) r0
            k7.o r0 = r3.m13117i(r0)
        L5df:
            int r2 = r20.m8359m()
            int r2 = r2 + (-1)
            double r4 = (double) r2
            int r2 = r23.size()
            r6 = 1
            if (r2 <= r6) goto L627
            java.lang.Object r1 = r1.get(r6)
            k7.o r1 = (p185k7.InterfaceC3916o) r1
            k7.o r1 = r3.m13117i(r1)
            java.lang.Double r2 = r1.mo8355g()
            double r2 = r2.doubleValue()
            boolean r2 = java.lang.Double.isNaN(r2)
            if (r2 == 0) goto L60d
            int r1 = r20.m8359m()
            int r1 = r1 + (-1)
            double r1 = (double) r1
            goto L619
        L60d:
            java.lang.Double r1 = r1.mo8355g()
            double r1 = r1.doubleValue()
            double r1 = p124h7.C2939x3.m7290p(r1)
        L619:
            r4 = r1
            r1 = 0
            int r3 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r3 >= 0) goto L629
            int r3 = r20.m8359m()
            double r6 = (double) r3
            double r4 = r4 + r6
            goto L629
        L627:
            r1 = 0
        L629:
            int r3 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r3 >= 0) goto L638
            k7.g r0 = new k7.g
            java.lang.Double r1 = java.lang.Double.valueOf(r16)
            r0.<init>(r1)
            goto L76e
        L638:
            int r1 = r20.m8359m()
            double r1 = (double) r1
            double r1 = java.lang.Math.min(r1, r4)
            int r1 = (int) r1
        L642:
            if (r1 < 0) goto L663
            boolean r2 = r9.m8351D(r1)
            if (r2 == 0) goto L660
            k7.o r2 = r9.m8362q(r1)
            boolean r2 = p124h7.C2939x3.m7272V(r2, r0)
            if (r2 == 0) goto L660
            k7.g r0 = new k7.g
            double r1 = (double) r1
            java.lang.Double r1 = java.lang.Double.valueOf(r1)
            r0.<init>(r1)
            goto L76e
        L660:
            int r1 = r1 + (-1)
            goto L642
        L663:
            k7.g r0 = new k7.g
            java.lang.Double r1 = java.lang.Double.valueOf(r16)
            r0.<init>(r1)
            goto L76e
        L66e:
            r9 = r20
            r3 = r22
            r1 = r23
            r0 = 1
            p124h7.C2939x3.m7268R(r14, r0, r1)
            int r0 = r20.m8359m()
            if (r0 != 0) goto L682
            k7.o r0 = p185k7.InterfaceC3916o.f16789N
            goto L76e
        L682:
            int r0 = r23.size()
            if (r0 <= 0) goto L6a4
            r0 = 0
            java.lang.Object r0 = r1.get(r0)
            k7.o r0 = (p185k7.InterfaceC3916o) r0
            k7.o r0 = r3.m13117i(r0)
            boolean r1 = r0 instanceof p185k7.C3890m
            if (r1 != 0) goto L6a1
            boolean r1 = r0 instanceof p185k7.C3968s
            if (r1 == 0) goto L69c
            goto L6a1
        L69c:
            java.lang.String r0 = r0.mo8357i()
            goto L6a6
        L6a1:
            java.lang.String r0 = ""
            goto L6a6
        L6a4:
            java.lang.String r0 = ","
        L6a6:
            k7.r r1 = new k7.r
            java.lang.String r0 = r9.m8363u(r0)
            r1.<init>(r0)
            goto L58b
        L6b1:
            r9 = r20
            r3 = r22
            r1 = r23
            r0 = 2
            p124h7.C2939x3.m7268R(r6, r0, r1)
            k7.o r0 = p185k7.InterfaceC3916o.f16782G
            boolean r2 = r23.isEmpty()
            if (r2 != 0) goto L6ce
            r0 = 0
            java.lang.Object r0 = r1.get(r0)
            k7.o r0 = (p185k7.InterfaceC3916o) r0
            k7.o r0 = r3.m13117i(r0)
        L6ce:
            int r2 = r23.size()
            r4 = 1
            if (r2 <= r4) goto L70c
            java.lang.Object r1 = r1.get(r4)
            k7.o r1 = (p185k7.InterfaceC3916o) r1
            k7.o r1 = r3.m13117i(r1)
            java.lang.Double r1 = r1.mo8355g()
            double r1 = r1.doubleValue()
            double r1 = p124h7.C2939x3.m7290p(r1)
            int r3 = r20.m8359m()
            double r3 = (double) r3
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 < 0) goto L6ff
            k7.g r0 = new k7.g
            java.lang.Double r1 = java.lang.Double.valueOf(r16)
            r0.<init>(r1)
            goto L76e
        L6ff:
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 >= 0) goto L70e
            int r3 = r20.m8359m()
            double r3 = (double) r3
            double r1 = r1 + r3
            goto L70e
        L70c:
            r1 = 0
        L70e:
            java.util.Iterator r3 = r20.m8364w()
        L712:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L73b
            java.lang.Object r4 = r3.next()
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            double r5 = (double) r4
            int r7 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r7 < 0) goto L712
            k7.o r4 = r9.m8362q(r4)
            boolean r4 = p124h7.C2939x3.m7272V(r4, r0)
            if (r4 == 0) goto L712
            k7.g r0 = new k7.g
            java.lang.Double r1 = java.lang.Double.valueOf(r5)
            r0.<init>(r1)
            goto L76e
        L73b:
            k7.g r0 = new k7.g
            java.lang.Double r1 = java.lang.Double.valueOf(r16)
            r0.<init>(r1)
            goto L76e
        L745:
            r9 = r20
            r3 = r22
            r1 = r23
            r0 = 1
            p124h7.C2939x3.m7264N(r10, r0, r1)
            r0 = 0
            java.lang.Object r0 = r1.get(r0)
            k7.o r0 = (p185k7.InterfaceC3916o) r0
            k7.o r0 = r3.m13117i(r0)
            boolean r1 = r0 instanceof p185k7.C3903n
            if (r1 == 0) goto L775
            java.util.SortedMap<java.lang.Integer, k7.o> r1 = r9.f16551Y
            int r1 = r1.size()
            if (r1 != 0) goto L767
            goto L76c
        L767:
            k7.n r0 = (p185k7.C3903n) r0
            p185k7.C3836i.m8634s(r9, r3, r0, r2, r2)
        L76c:
            k7.o r0 = p185k7.InterfaceC3916o.f16782G
        L76e:
            r19 = r9
            r9 = r0
            r0 = r19
            goto L882
        L775:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r7)
            throw r0
        L77b:
            r0 = r20
            r3 = r22
            r1 = r23
            r4 = 1
            p124h7.C2939x3.m7264N(r9, r4, r1)
            r4 = 0
            java.lang.Object r1 = r1.get(r4)
            k7.o r1 = (p185k7.InterfaceC3916o) r1
            k7.o r1 = r3.m13117i(r1)
            boolean r4 = r1 instanceof p185k7.C3903n
            if (r4 == 0) goto L7d8
            java.util.SortedMap<java.lang.Integer, k7.o> r4 = r0.f16551Y
            int r4 = r4.size()
            if (r4 != 0) goto L7a4
            k7.d r1 = new k7.d
            r1.<init>()
        L7a1:
            r9 = r1
            goto L882
        L7a4:
            k7.o r4 = r20.mo8354f()
            k7.n r1 = (p185k7.C3903n) r1
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
            k7.d r1 = p185k7.C3836i.m8634s(r0, r3, r1, r2, r5)
            k7.d r9 = new k7.d
            r9.<init>()
            java.util.Iterator r1 = r1.m8364w()
        L7b9:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L882
            java.lang.Object r2 = r1.next()
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r3 = r4
            k7.d r3 = (p185k7.C3766d) r3
            k7.o r2 = r3.m8362q(r2)
            int r3 = r9.m8359m()
            r9.m8350C(r3, r2)
            goto L7b9
        L7d8:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            r1.<init>(r7)
            throw r1
        L7de:
            r0 = r20
            r3 = r22
            r1 = r23
            r2 = r18
            r4 = 1
            p124h7.C2939x3.m7264N(r2, r4, r1)
            r2 = 0
            java.lang.Object r1 = r1.get(r2)
            k7.o r1 = (p185k7.InterfaceC3916o) r1
            k7.o r1 = r3.m13117i(r1)
            boolean r2 = r1 instanceof p185k7.C3903n
            if (r2 == 0) goto L81a
            int r2 = r20.m8359m()
            if (r2 != 0) goto L800
            goto L817
        L800:
            k7.n r1 = (p185k7.C3903n) r1
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            k7.d r1 = p185k7.C3836i.m8634s(r0, r3, r1, r2, r4)
            int r1 = r1.m8359m()
            int r2 = r20.m8359m()
            if (r1 == r2) goto L817
            k7.o r1 = p185k7.InterfaceC3916o.f16788M
            goto L7a1
        L817:
            k7.o r1 = p185k7.InterfaceC3916o.f16787L
            goto L7a1
        L81a:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            r1.<init>(r7)
            throw r1
        L820:
            r0 = r20
            r3 = r22
            r1 = r23
            k7.o r9 = r20.mo8354f()
            boolean r2 = r23.isEmpty()
            if (r2 != 0) goto L882
            java.util.Iterator r1 = r23.iterator()
        L834:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L882
            java.lang.Object r2 = r1.next()
            k7.o r2 = (p185k7.InterfaceC3916o) r2
            k7.o r2 = r3.m13117i(r2)
            boolean r4 = r2 instanceof p185k7.C3794f
            if (r4 != 0) goto L87a
            r4 = r9
            k7.d r4 = (p185k7.C3766d) r4
            int r5 = r4.m8359m()
            boolean r6 = r2 instanceof p185k7.C3766d
            if (r6 == 0) goto L876
            k7.d r2 = (p185k7.C3766d) r2
            java.util.Iterator r6 = r2.m8364w()
        L859:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L834
            java.lang.Object r7 = r6.next()
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r8 = r7.intValue()
            int r7 = r7.intValue()
            k7.o r7 = r2.m8362q(r7)
            int r8 = r8 + r5
            r4.m8350C(r8, r7)
            goto L859
        L876:
            r4.m8350C(r5, r2)
            goto L834
        L87a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "Failed evaluation of arguments"
            r1.<init>(r2)
            throw r1
        L882:
            return r9
    }

    /* renamed from: q */
    public final p185k7.InterfaceC3916o m8362q(int r2) {
            r1 = this;
            int r0 = r1.m8359m()
            if (r2 >= r0) goto L1e
            boolean r0 = r1.m8351D(r2)
            if (r0 == 0) goto L1b
            java.util.SortedMap<java.lang.Integer, k7.o> r0 = r1.f16551Y
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object r2 = r0.get(r2)
            k7.o r2 = (p185k7.InterfaceC3916o) r2
            if (r2 == 0) goto L1b
            return r2
        L1b:
            k7.o r2 = p185k7.InterfaceC3916o.f16782G
            return r2
        L1e:
            java.lang.IndexOutOfBoundsException r2 = new java.lang.IndexOutOfBoundsException
            java.lang.String r0 = "Attempting to get element outside of current array"
            r2.<init>(r0)
            throw r2
    }

    public final java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = ","
            java.lang.String r0 = r1.m8363u(r0)
            return r0
    }

    /* renamed from: u */
    public final java.lang.String m8363u(java.lang.String r6) {
            r5 = this;
            if (r6 != 0) goto L4
            java.lang.String r6 = ""
        L4:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.util.SortedMap<java.lang.Integer, k7.o> r1 = r5.f16551Y
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L39
            r1 = 0
            r2 = 0
        L13:
            int r3 = r5.m8359m()
            if (r2 >= r3) goto L32
            k7.o r3 = r5.m8362q(r2)
            r0.append(r6)
            boolean r4 = r3 instanceof p185k7.C3968s
            if (r4 != 0) goto L2f
            boolean r4 = r3 instanceof p185k7.C3890m
            if (r4 != 0) goto L2f
            java.lang.String r3 = r3.mo8357i()
            r0.append(r3)
        L2f:
            int r2 = r2 + 1
            goto L13
        L32:
            int r6 = r6.length()
            r0.delete(r1, r6)
        L39:
            java.lang.String r6 = r0.toString()
            return r6
    }

    /* renamed from: w */
    public final java.util.Iterator<java.lang.Integer> m8364w() {
            r1 = this;
            java.util.SortedMap<java.lang.Integer, k7.o> r0 = r1.f16551Y
            java.util.Set r0 = r0.keySet()
            java.util.Iterator r0 = r0.iterator()
            return r0
    }

    /* renamed from: z */
    public final java.util.List<p185k7.InterfaceC3916o> m8365z() {
            r3 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r3.m8359m()
            r0.<init>(r1)
            r1 = 0
        La:
            int r2 = r3.m8359m()
            if (r1 >= r2) goto L1a
            k7.o r2 = r3.m8362q(r1)
            r0.add(r2)
            int r1 = r1 + 1
            goto La
        L1a:
            return r0
    }
}
