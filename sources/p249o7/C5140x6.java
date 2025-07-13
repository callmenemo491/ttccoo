package p249o7;

/* renamed from: o7.x6 */
/* loaded from: classes.dex */
public final class C5140x6 {

    /* renamed from: a */
    public java.lang.String f20173a;

    /* renamed from: b */
    public boolean f20174b;

    /* renamed from: c */
    public p185k7.C3840i3 f20175c;

    /* renamed from: d */
    public java.util.BitSet f20176d;

    /* renamed from: e */
    public java.util.BitSet f20177e;

    /* renamed from: f */
    public java.util.Map<java.lang.Integer, java.lang.Long> f20178f;

    /* renamed from: g */
    public java.util.Map<java.lang.Integer, java.util.List<java.lang.Long>> f20179g;

    /* renamed from: h */
    public final /* synthetic */ p249o7.C4956a7 f20180h;

    public /* synthetic */ C5140x6(p249o7.C4956a7 r1, java.lang.String r2) {
            r0 = this;
            r0.f20180h = r1
            r0.<init>()
            r0.f20173a = r2
            r1 = 1
            r0.f20174b = r1
            java.util.BitSet r1 = new java.util.BitSet
            r1.<init>()
            r0.f20176d = r1
            java.util.BitSet r1 = new java.util.BitSet
            r1.<init>()
            r0.f20177e = r1
            s.a r1 = new s.a
            r1.<init>()
            r0.f20178f = r1
            s.a r1 = new s.a
            r1.<init>()
            r0.f20179g = r1
            return
    }

    public /* synthetic */ C5140x6(p249o7.C4956a7 r1, java.lang.String r2, p185k7.C3840i3 r3, java.util.BitSet r4, java.util.BitSet r5, java.util.Map r6, java.util.Map r7) {
            r0 = this;
            r0.f20180h = r1
            r0.<init>()
            r0.f20173a = r2
            r0.f20176d = r4
            r0.f20177e = r5
            r0.f20178f = r6
            s.a r1 = new s.a
            r1.<init>()
            r0.f20179g = r1
            r1 = r7
            s.a r1 = (p319s.C5934a) r1
            java.util.Set r1 = r1.keySet()
            s.g$c r1 = (p319s.AbstractC5940g.c) r1
            java.util.Iterator r1 = r1.iterator()
        L21:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L44
            java.lang.Object r2 = r1.next()
            java.lang.Integer r2 = (java.lang.Integer) r2
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r5 = r7
            s.h r5 = (p319s.C5941h) r5
            java.lang.Object r5 = r5.get(r2)
            java.lang.Long r5 = (java.lang.Long) r5
            r4.add(r5)
            java.util.Map<java.lang.Integer, java.util.List<java.lang.Long>> r5 = r0.f20179g
            r5.put(r2, r4)
            goto L21
        L44:
            r1 = 0
            r0.f20174b = r1
            r0.f20175c = r3
            return
    }

    /* renamed from: a */
    public final p185k7.C3945q2 m11445a(int r9) {
            r8 = this;
            k7.p2 r0 = p185k7.C3945q2.m8895t()
            boolean r1 = r0.f16454a0
            r2 = 0
            if (r1 == 0) goto Le
            r0.m8203j()
            r0.f16454a0 = r2
        Le:
            MessageType extends k7.d6<MessageType, BuilderType> r1 = r0.f16453Z
            k7.q2 r1 = (p185k7.C3945q2) r1
            p185k7.C3945q2.m8897x(r1, r9)
            boolean r9 = r8.f20174b
            boolean r1 = r0.f16454a0
            if (r1 == 0) goto L20
            r0.m8203j()
            r0.f16454a0 = r2
        L20:
            MessageType extends k7.d6<MessageType, BuilderType> r1 = r0.f16453Z
            k7.q2 r1 = (p185k7.C3945q2) r1
            p185k7.C3945q2.m8894A(r1, r9)
            k7.i3 r9 = r8.f20175c
            if (r9 == 0) goto L3b
            boolean r1 = r0.f16454a0
            if (r1 == 0) goto L34
            r0.m8203j()
            r0.f16454a0 = r2
        L34:
            MessageType extends k7.d6<MessageType, BuilderType> r1 = r0.f16453Z
            k7.q2 r1 = (p185k7.C3945q2) r1
            p185k7.C3945q2.m8899z(r1, r9)
        L3b:
            k7.h3 r9 = p185k7.C3840i3.m8647x()
            java.util.BitSet r1 = r8.f20176d
            java.util.List r1 = p249o7.C5068o6.m11382I(r1)
            boolean r3 = r9.f16454a0
            if (r3 == 0) goto L4e
            r9.m8203j()
            r9.f16454a0 = r2
        L4e:
            MessageType extends k7.d6<MessageType, BuilderType> r3 = r9.f16453Z
            k7.i3 r3 = (p185k7.C3840i3) r3
            p185k7.C3840i3.m8641H(r3, r1)
            java.util.BitSet r1 = r8.f20177e
            java.util.List r1 = p249o7.C5068o6.m11382I(r1)
            boolean r3 = r9.f16454a0
            if (r3 == 0) goto L64
            r9.m8203j()
            r9.f16454a0 = r2
        L64:
            MessageType extends k7.d6<MessageType, BuilderType> r3 = r9.f16453Z
            k7.i3 r3 = (p185k7.C3840i3) r3
            p185k7.C3840i3.m8639F(r3, r1)
            java.util.Map<java.lang.Integer, java.lang.Long> r1 = r8.f20178f
            if (r1 != 0) goto L71
            r1 = 0
            goto Ld5
        L71:
            java.util.ArrayList r3 = new java.util.ArrayList
            int r1 = r1.size()
            r3.<init>(r1)
            java.util.Map<java.lang.Integer, java.lang.Long> r1 = r8.f20178f
            java.util.Set r1 = r1.keySet()
            java.util.Iterator r1 = r1.iterator()
        L84:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto Ld4
            java.lang.Object r4 = r1.next()
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            java.util.Map<java.lang.Integer, java.lang.Long> r5 = r8.f20178f
            java.lang.Integer r6 = java.lang.Integer.valueOf(r4)
            java.lang.Object r5 = r5.get(r6)
            java.lang.Long r5 = (java.lang.Long) r5
            if (r5 == 0) goto L84
            k7.r2 r6 = p185k7.C3971s2.m8942u()
            boolean r7 = r6.f16454a0
            if (r7 == 0) goto Laf
            r6.m8203j()
            r6.f16454a0 = r2
        Laf:
            MessageType extends k7.d6<MessageType, BuilderType> r7 = r6.f16453Z
            k7.s2 r7 = (p185k7.C3971s2) r7
            p185k7.C3971s2.m8944w(r7, r4)
            long r4 = r5.longValue()
            boolean r7 = r6.f16454a0
            if (r7 == 0) goto Lc3
            r6.m8203j()
            r6.f16454a0 = r2
        Lc3:
            MessageType extends k7.d6<MessageType, BuilderType> r7 = r6.f16453Z
            k7.s2 r7 = (p185k7.C3971s2) r7
            p185k7.C3971s2.m8945x(r7, r4)
            k7.d6 r4 = r6.m8201f()
            k7.s2 r4 = (p185k7.C3971s2) r4
            r3.add(r4)
            goto L84
        Ld4:
            r1 = r3
        Ld5:
            if (r1 == 0) goto Le7
            boolean r3 = r9.f16454a0
            if (r3 == 0) goto Le0
            r9.m8203j()
            r9.f16454a0 = r2
        Le0:
            MessageType extends k7.d6<MessageType, BuilderType> r3 = r9.f16453Z
            k7.i3 r3 = (p185k7.C3840i3) r3
            p185k7.C3840i3.m8643J(r3, r1)
        Le7:
            java.util.Map<java.lang.Integer, java.util.List<java.lang.Long>> r1 = r8.f20179g
            if (r1 != 0) goto Lf0
            java.util.List r1 = java.util.Collections.emptyList()
            goto L14f
        Lf0:
            java.util.ArrayList r3 = new java.util.ArrayList
            int r1 = r1.size()
            r3.<init>(r1)
            java.util.Map<java.lang.Integer, java.util.List<java.lang.Long>> r1 = r8.f20179g
            java.util.Set r1 = r1.keySet()
            java.util.Iterator r1 = r1.iterator()
        L103:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L14e
            java.lang.Object r4 = r1.next()
            java.lang.Integer r4 = (java.lang.Integer) r4
            k7.j3 r5 = p185k7.C3868k3.m8754v()
            int r6 = r4.intValue()
            boolean r7 = r5.f16454a0
            if (r7 == 0) goto L120
            r5.m8203j()
            r5.f16454a0 = r2
        L120:
            MessageType extends k7.d6<MessageType, BuilderType> r7 = r5.f16453Z
            k7.k3 r7 = (p185k7.C3868k3) r7
            p185k7.C3868k3.m8756y(r7, r6)
            java.util.Map<java.lang.Integer, java.util.List<java.lang.Long>> r6 = r8.f20179g
            java.lang.Object r4 = r6.get(r4)
            java.util.List r4 = (java.util.List) r4
            if (r4 == 0) goto L144
            java.util.Collections.sort(r4)
            boolean r6 = r5.f16454a0
            if (r6 == 0) goto L13d
            r5.m8203j()
            r5.f16454a0 = r2
        L13d:
            MessageType extends k7.d6<MessageType, BuilderType> r6 = r5.f16453Z
            k7.k3 r6 = (p185k7.C3868k3) r6
            p185k7.C3868k3.m8757z(r6, r4)
        L144:
            k7.d6 r4 = r5.m8201f()
            k7.k3 r4 = (p185k7.C3868k3) r4
            r3.add(r4)
            goto L103
        L14e:
            r1 = r3
        L14f:
            boolean r3 = r9.f16454a0
            if (r3 == 0) goto L158
            r9.m8203j()
            r9.f16454a0 = r2
        L158:
            MessageType extends k7.d6<MessageType, BuilderType> r3 = r9.f16453Z
            k7.i3 r3 = (p185k7.C3840i3) r3
            p185k7.C3840i3.m8645L(r3, r1)
            boolean r1 = r0.f16454a0
            if (r1 == 0) goto L168
            r0.m8203j()
            r0.f16454a0 = r2
        L168:
            MessageType extends k7.d6<MessageType, BuilderType> r1 = r0.f16453Z
            k7.q2 r1 = (p185k7.C3945q2) r1
            k7.d6 r9 = r9.m8201f()
            k7.i3 r9 = (p185k7.C3840i3) r9
            p185k7.C3945q2.m8898y(r1, r9)
            k7.d6 r9 = r0.m8201f()
            k7.q2 r9 = (p185k7.C3945q2) r9
            return r9
    }

    /* renamed from: b */
    public final void m11446b(p249o7.AbstractC5156z6 r11) {
            r10 = this;
            r0 = r11
            o7.y6 r0 = (p249o7.C5148y6) r0
            int r1 = r0.f20196g
            switch(r1) {
                case 0: goto L9;
                default: goto L8;
            }
        L8:
            goto L12
        L9:
            java.lang.Object r1 = r0.f20197h
            k7.s1 r1 = (p185k7.C3970s1) r1
            int r1 = r1.m8937t()
            goto L1a
        L12:
            java.lang.Object r1 = r0.f20197h
            k7.a2 r1 = (p185k7.C3727a2) r1
            int r1 = r1.m8190s()
        L1a:
            java.lang.Boolean r2 = r11.f20209c
            if (r2 == 0) goto L27
            java.util.BitSet r3 = r10.f20177e
            boolean r2 = r2.booleanValue()
            r3.set(r1, r2)
        L27:
            java.lang.Boolean r2 = r11.f20210d
            if (r2 == 0) goto L34
            java.util.BitSet r3 = r10.f20176d
            boolean r2 = r2.booleanValue()
            r3.set(r1, r2)
        L34:
            java.lang.Long r2 = r11.f20211e
            r3 = 1000(0x3e8, double:4.94E-321)
            if (r2 == 0) goto L60
            java.util.Map<java.lang.Integer, java.lang.Long> r2 = r10.f20178f
            java.lang.Integer r5 = java.lang.Integer.valueOf(r1)
            java.lang.Object r2 = r2.get(r5)
            java.lang.Long r2 = (java.lang.Long) r2
            java.lang.Long r6 = r11.f20211e
            long r6 = r6.longValue()
            long r6 = r6 / r3
            if (r2 == 0) goto L57
            long r8 = r2.longValue()
            int r2 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r2 <= 0) goto L60
        L57:
            java.util.Map<java.lang.Integer, java.lang.Long> r2 = r10.f20178f
            java.lang.Long r6 = java.lang.Long.valueOf(r6)
            r2.put(r5, r6)
        L60:
            java.lang.Long r2 = r11.f20212f
            if (r2 == 0) goto Ld9
            java.util.Map<java.lang.Integer, java.util.List<java.lang.Long>> r2 = r10.f20179g
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object r2 = r2.get(r1)
            java.util.List r2 = (java.util.List) r2
            if (r2 != 0) goto L7c
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Map<java.lang.Integer, java.util.List<java.lang.Long>> r5 = r10.f20179g
            r5.put(r1, r2)
        L7c:
            int r1 = r0.f20196g
            r5 = 0
            switch(r1) {
                case 0: goto L84;
                default: goto L82;
            }
        L82:
            r1 = 1
            goto L85
        L84:
            r1 = 0
        L85:
            if (r1 == 0) goto L8a
            r2.clear()
        L8a:
            p185k7.C4030w9.m9080c()
            o7.a7 r1 = r10.f20180h
            com.google.android.gms.measurement.internal.d r1 = r1.f5736a
            o7.f r1 = r1.f5716g
            java.lang.String r6 = r10.f20173a
            o7.u2<java.lang.Boolean> r7 = p249o7.C5120v2.f20080Y
            boolean r1 = r1.m11162v(r6, r7)
            if (r1 == 0) goto Lb0
            int r1 = r0.f20196g
            switch(r1) {
                case 0: goto La3;
                default: goto La2;
            }
        La2:
            goto Lab
        La3:
            java.lang.Object r0 = r0.f20197h
            k7.s1 r0 = (p185k7.C3970s1) r0
            boolean r5 = r0.m8933F()
        Lab:
            if (r5 == 0) goto Lb0
            r2.clear()
        Lb0:
            p185k7.C4030w9.m9080c()
            o7.a7 r0 = r10.f20180h
            com.google.android.gms.measurement.internal.d r0 = r0.f5736a
            o7.f r0 = r0.f5716g
            java.lang.String r1 = r10.f20173a
            boolean r0 = r0.m11162v(r1, r7)
            java.lang.Long r11 = r11.f20212f
            long r5 = r11.longValue()
            long r5 = r5 / r3
            java.lang.Long r11 = java.lang.Long.valueOf(r5)
            if (r0 == 0) goto Ld6
            boolean r0 = r2.contains(r11)
            if (r0 != 0) goto Ld9
            r2.add(r11)
            return
        Ld6:
            r2.add(r11)
        Ld9:
            return
    }
}
