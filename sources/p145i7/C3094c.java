package p145i7;

/* renamed from: i7.c */
/* loaded from: classes.dex */
public final class C3094c implements qa.InterfaceC5609f {

    /* renamed from: f */
    public static final java.nio.charset.Charset f12468f = null;

    /* renamed from: g */
    public static final qa.C5607d f12469g = null;

    /* renamed from: h */
    public static final qa.C5607d f12470h = null;

    /* renamed from: i */
    public static final qa.InterfaceC5608e<java.util.Map.Entry<java.lang.Object, java.lang.Object>> f12471i = null;

    /* renamed from: a */
    public java.io.OutputStream f12472a;

    /* renamed from: b */
    public final java.util.Map<java.lang.Class<?>, qa.InterfaceC5608e<?>> f12473b;

    /* renamed from: c */
    public final java.util.Map<java.lang.Class<?>, qa.InterfaceC5610g<?>> f12474c;

    /* renamed from: d */
    public final qa.InterfaceC5608e<java.lang.Object> f12475d;

    /* renamed from: e */
    public final p145i7.C3097f f12476e;

    static {
            java.lang.String r0 = "UTF-8"
            java.nio.charset.Charset r0 = java.nio.charset.Charset.forName(r0)
            p145i7.C3094c.f12468f = r0
            r4.g r0 = new r4.g
            r1 = 2
            r0.<init>(r1)
            r2 = 1
            r0.f22417b = r2
            i7.s r0 = r0.m12139e()
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            java.lang.Class r3 = r0.annotationType()
            r2.put(r3, r0)
            qa.d r0 = new qa.d
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>(r2)
            java.util.Map r2 = java.util.Collections.unmodifiableMap(r3)
            java.lang.String r3 = "key"
            r4 = 0
            r0.<init>(r3, r2, r4)
            p145i7.C3094c.f12469g = r0
            r4.g r0 = new r4.g
            r0.<init>(r1)
            r0.f22417b = r1
            i7.s r0 = r0.m12139e()
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            java.lang.Class r2 = r0.annotationType()
            r1.put(r2, r0)
            qa.d r0 = new qa.d
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>(r1)
            java.util.Map r1 = java.util.Collections.unmodifiableMap(r2)
            java.lang.String r2 = "value"
            r0.<init>(r2, r1, r4)
            p145i7.C3094c.f12470h = r0
            qa.e r0 = p145i7.C3093b.f12467a
            p145i7.C3094c.f12471i = r0
            return
    }

    public C3094c(java.io.OutputStream r2, java.util.Map<java.lang.Class<?>, qa.InterfaceC5608e<?>> r3, java.util.Map<java.lang.Class<?>, qa.InterfaceC5610g<?>> r4, qa.InterfaceC5608e<java.lang.Object> r5) {
            r1 = this;
            r1.<init>()
            i7.f r0 = new i7.f
            r0.<init>(r1)
            r1.f12476e = r0
            r1.f12472a = r2
            r1.f12473b = r3
            r1.f12474c = r4
            r1.f12475d = r5
            return
    }

    /* renamed from: i */
    public static java.nio.ByteBuffer m7553i(int r1) {
            java.nio.ByteBuffer r1 = java.nio.ByteBuffer.allocate(r1)
            java.nio.ByteOrder r0 = java.nio.ByteOrder.LITTLE_ENDIAN
            java.nio.ByteBuffer r1 = r1.order(r0)
            return r1
    }

    /* renamed from: j */
    public static int m7554j(qa.C5607d r1) {
            java.lang.Class<i7.s> r0 = p145i7.C3110s.class
            java.util.Map<java.lang.Class<?>, java.lang.Object> r1 = r1.f21773b
            java.lang.Object r1 = r1.get(r0)
            java.lang.annotation.Annotation r1 = (java.lang.annotation.Annotation) r1
            i7.s r1 = (p145i7.C3110s) r1
            if (r1 == 0) goto L11
            int r1 = r1.f12498a
            return r1
        L11:
            qa.c r1 = new qa.c
            java.lang.String r0 = "Field has no @Protobuf config"
            r1.<init>(r0)
            throw r1
    }

    /* renamed from: k */
    public static p145i7.C3110s m7555k(qa.C5607d r1) {
            java.lang.Class<i7.s> r0 = p145i7.C3110s.class
            java.util.Map<java.lang.Class<?>, java.lang.Object> r1 = r1.f21773b
            java.lang.Object r1 = r1.get(r0)
            java.lang.annotation.Annotation r1 = (java.lang.annotation.Annotation) r1
            i7.s r1 = (p145i7.C3110s) r1
            if (r1 == 0) goto Lf
            return r1
        Lf:
            qa.c r1 = new qa.c
            java.lang.String r0 = "Field has no @Protobuf config"
            r1.<init>(r0)
            throw r1
    }

    /* renamed from: a */
    public final qa.InterfaceC5609f m7556a(qa.C5607d r5, java.lang.Object r6, boolean r7) {
            r4 = this;
            if (r6 != 0) goto L3
            return r4
        L3:
            boolean r0 = r6 instanceof java.lang.CharSequence
            if (r0 == 0) goto L31
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6
            if (r7 == 0) goto L12
            int r7 = r6.length()
            if (r7 != 0) goto L12
            return r4
        L12:
            int r5 = m7554j(r5)
            int r5 = r5 << 3
            r5 = r5 | 2
            r4.m7564l(r5)
            java.lang.String r5 = r6.toString()
            java.nio.charset.Charset r6 = p145i7.C3094c.f12468f
            byte[] r5 = r5.getBytes(r6)
            int r6 = r5.length
            r4.m7564l(r6)
            java.io.OutputStream r6 = r4.f12472a
            r6.write(r5)
            return r4
        L31:
            boolean r0 = r6 instanceof java.util.Collection
            r1 = 0
            if (r0 == 0) goto L4b
            java.util.Collection r6 = (java.util.Collection) r6
            java.util.Iterator r6 = r6.iterator()
        L3c:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L4a
            java.lang.Object r7 = r6.next()
            r4.m7556a(r5, r7, r1)
            goto L3c
        L4a:
            return r4
        L4b:
            boolean r0 = r6 instanceof java.util.Map
            if (r0 == 0) goto L6c
            java.util.Map r6 = (java.util.Map) r6
            java.util.Set r6 = r6.entrySet()
            java.util.Iterator r6 = r6.iterator()
        L59:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L6b
            java.lang.Object r7 = r6.next()
            java.util.Map$Entry r7 = (java.util.Map.Entry) r7
            qa.e<java.util.Map$Entry<java.lang.Object, java.lang.Object>> r0 = p145i7.C3094c.f12471i
            r4.m7563h(r0, r5, r7, r1)
            goto L59
        L6b:
            return r4
        L6c:
            boolean r0 = r6 instanceof java.lang.Double
            r2 = 1
            if (r0 == 0) goto L9e
            java.lang.Double r6 = (java.lang.Double) r6
            double r0 = r6.doubleValue()
            if (r7 == 0) goto L80
            r6 = 0
            int r3 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r3 != 0) goto L80
            goto L9d
        L80:
            int r5 = m7554j(r5)
            int r5 = r5 << 3
            r5 = r5 | r2
            r4.m7564l(r5)
            java.io.OutputStream r5 = r4.f12472a
            r6 = 8
            java.nio.ByteBuffer r6 = m7553i(r6)
            java.nio.ByteBuffer r6 = r6.putDouble(r0)
            byte[] r6 = r6.array()
            r5.write(r6)
        L9d:
            return r4
        L9e:
            boolean r0 = r6 instanceof java.lang.Float
            if (r0 == 0) goto Lce
            java.lang.Float r6 = (java.lang.Float) r6
            float r6 = r6.floatValue()
            if (r7 == 0) goto Lb0
            r7 = 0
            int r7 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r7 != 0) goto Lb0
            goto Lcd
        Lb0:
            int r5 = m7554j(r5)
            int r5 = r5 << 3
            r5 = r5 | 5
            r4.m7564l(r5)
            java.io.OutputStream r5 = r4.f12472a
            r7 = 4
            java.nio.ByteBuffer r7 = m7553i(r7)
            java.nio.ByteBuffer r6 = r7.putFloat(r6)
            byte[] r6 = r6.array()
            r5.write(r6)
        Lcd:
            return r4
        Lce:
            boolean r0 = r6 instanceof java.lang.Number
            if (r0 == 0) goto Ldc
            java.lang.Number r6 = (java.lang.Number) r6
            long r0 = r6.longValue()
            r4.m7562g(r5, r0, r7)
            return r4
        Ldc:
            boolean r0 = r6 instanceof java.lang.Boolean
            if (r0 == 0) goto Lea
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            r4.m7557b(r5, r6, r7)
            return r4
        Lea:
            boolean r0 = r6 instanceof byte[]
            if (r0 == 0) goto L10b
            byte[] r6 = (byte[]) r6
            if (r7 == 0) goto Lf6
            int r7 = r6.length
            if (r7 != 0) goto Lf6
            return r4
        Lf6:
            int r5 = m7554j(r5)
            int r5 = r5 << 3
            r5 = r5 | 2
            r4.m7564l(r5)
            int r5 = r6.length
            r4.m7564l(r5)
            java.io.OutputStream r5 = r4.f12472a
            r5.write(r6)
            return r4
        L10b:
            java.util.Map<java.lang.Class<?>, qa.e<?>> r0 = r4.f12473b
            java.lang.Class r3 = r6.getClass()
            java.lang.Object r0 = r0.get(r3)
            qa.e r0 = (qa.InterfaceC5608e) r0
            if (r0 == 0) goto L11d
            r4.m7563h(r0, r5, r6, r7)
            return r4
        L11d:
            java.util.Map<java.lang.Class<?>, qa.g<?>> r0 = r4.f12474c
            java.lang.Class r3 = r6.getClass()
            java.lang.Object r0 = r0.get(r3)
            qa.g r0 = (qa.InterfaceC5610g) r0
            if (r0 == 0) goto L137
            i7.f r2 = r4.f12476e
            r2.f12482a = r1
            r2.f12484c = r5
            r2.f12483b = r7
            r0.mo5556a(r6, r2)
            return r4
        L137:
            boolean r0 = r6 instanceof p145i7.InterfaceC3112u
            if (r0 == 0) goto L145
            i7.u r6 = (p145i7.InterfaceC3112u) r6
            int r6 = r6.mo4566d()
            r4.m7557b(r5, r6, r2)
            return r4
        L145:
            boolean r0 = r6 instanceof java.lang.Enum
            if (r0 == 0) goto L153
            java.lang.Enum r6 = (java.lang.Enum) r6
            int r6 = r6.ordinal()
            r4.m7557b(r5, r6, r2)
            return r4
        L153:
            qa.e<java.lang.Object> r0 = r4.f12475d
            r4.m7563h(r0, r5, r6, r7)
            return r4
    }

    /* renamed from: b */
    public final p145i7.C3094c m7557b(qa.C5607d r2, int r3, boolean r4) {
            r1 = this;
            if (r4 == 0) goto L6
            if (r3 == 0) goto L5
            goto L6
        L5:
            return r1
        L6:
            i7.s r2 = m7555k(r2)
            i7.v r4 = r2.f12499b
            int r4 = r4.ordinal()
            if (r4 == 0) goto L45
            r0 = 1
            if (r4 == r0) goto L35
            r0 = 2
            if (r4 == r0) goto L19
            goto L4f
        L19:
            int r2 = r2.f12498a
            int r2 = r2 << 3
            r2 = r2 | 5
            r1.m7564l(r2)
            java.io.OutputStream r2 = r1.f12472a
            r4 = 4
            java.nio.ByteBuffer r4 = m7553i(r4)
            java.nio.ByteBuffer r3 = r4.putInt(r3)
            byte[] r3 = r3.array()
            r2.write(r3)
            goto L4f
        L35:
            int r2 = r2.f12498a
            int r2 = r2 << 3
            r1.m7564l(r2)
            int r2 = r3 + r3
            int r3 = r3 >> 31
            r2 = r2 ^ r3
            r1.m7564l(r2)
            goto L4f
        L45:
            int r2 = r2.f12498a
            int r2 = r2 << 3
            r1.m7564l(r2)
            r1.m7564l(r3)
        L4f:
            return r1
    }

    @Override // qa.InterfaceC5609f
    /* renamed from: c */
    public final qa.InterfaceC5609f mo7558c(qa.C5607d r2, java.lang.Object r3) {
            r1 = this;
            r0 = 1
            r1.m7556a(r2, r3, r0)
            return r1
    }

    @Override // qa.InterfaceC5609f
    /* renamed from: d */
    public final /* bridge */ /* synthetic */ qa.InterfaceC5609f mo7559d(qa.C5607d r2, long r3) {
            r1 = this;
            r0 = 1
            r1.m7562g(r2, r3, r0)
            return r1
    }

    @Override // qa.InterfaceC5609f
    /* renamed from: e */
    public final /* bridge */ /* synthetic */ qa.InterfaceC5609f mo7560e(qa.C5607d r2, int r3) {
            r1 = this;
            r0 = 1
            r1.m7557b(r2, r3, r0)
            return r1
    }

    @Override // qa.InterfaceC5609f
    /* renamed from: f */
    public final /* bridge */ /* synthetic */ qa.InterfaceC5609f mo7561f(qa.C5607d r2, boolean r3) {
            r1 = this;
            r0 = 1
            r1.m7557b(r2, r3, r0)
            return r1
    }

    /* renamed from: g */
    public final p145i7.C3094c m7562g(qa.C5607d r3, long r4, boolean r6) {
            r2 = this;
            if (r6 == 0) goto La
            r0 = 0
            int r6 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r6 == 0) goto L9
            goto La
        L9:
            return r2
        La:
            i7.s r3 = m7555k(r3)
            i7.v r6 = r3.f12499b
            int r6 = r6.ordinal()
            if (r6 == 0) goto L4b
            r0 = 1
            if (r6 == r0) goto L39
            r1 = 2
            if (r6 == r1) goto L1d
            goto L55
        L1d:
            int r3 = r3.f12498a
            int r3 = r3 << 3
            r3 = r3 | r0
            r2.m7564l(r3)
            java.io.OutputStream r3 = r2.f12472a
            r6 = 8
            java.nio.ByteBuffer r6 = m7553i(r6)
            java.nio.ByteBuffer r4 = r6.putLong(r4)
            byte[] r4 = r4.array()
            r3.write(r4)
            goto L55
        L39:
            int r3 = r3.f12498a
            int r3 = r3 << 3
            r2.m7564l(r3)
            long r0 = r4 + r4
            r3 = 63
            long r3 = r4 >> r3
            long r3 = r3 ^ r0
            r2.m7565m(r3)
            goto L55
        L4b:
            int r3 = r3.f12498a
            int r3 = r3 << 3
            r2.m7564l(r3)
            r2.m7565m(r4)
        L55:
            return r2
    }

    /* renamed from: h */
    public final <T> p145i7.C3094c m7563h(qa.InterfaceC5608e<T> r6, qa.C5607d r7, T r8, boolean r9) {
            r5 = this;
            i7.t r0 = new i7.t
            r0.<init>()
            java.io.OutputStream r1 = r5.f12472a     // Catch: java.lang.Throwable -> L32
            r5.f12472a = r0     // Catch: java.lang.Throwable -> L32
            r6.mo5556a(r8, r5)     // Catch: java.lang.Throwable -> L2e
            r5.f12472a = r1     // Catch: java.lang.Throwable -> L32
            long r1 = r0.f12500Y     // Catch: java.lang.Throwable -> L32
            r0.close()
            if (r9 == 0) goto L1c
            r3 = 0
            int r9 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r9 != 0) goto L1c
            return r5
        L1c:
            int r7 = m7554j(r7)
            int r7 = r7 << 3
            r7 = r7 | 2
            r5.m7564l(r7)
            r5.m7565m(r1)
            r6.mo5556a(r8, r5)
            return r5
        L2e:
            r6 = move-exception
            r5.f12472a = r1     // Catch: java.lang.Throwable -> L32
            throw r6     // Catch: java.lang.Throwable -> L32
        L32:
            r6 = move-exception
            r0.close()     // Catch: java.lang.Throwable -> L37
            goto L3d
        L37:
            r7 = move-exception
            t1.f r8 = p145i7.C3109r.f12497a
            r8.mo7571f(r6, r7)
        L3d:
            throw r6
    }

    /* renamed from: l */
    public final void m7564l(int r6) {
            r5 = this;
        L0:
            r0 = r6 & (-128(0xffffffffffffff80, float:NaN))
            long r0 = (long) r0
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            java.io.OutputStream r0 = r5.f12472a
            if (r4 == 0) goto L15
            r1 = r6 & 127(0x7f, float:1.78E-43)
            r1 = r1 | 128(0x80, float:1.8E-43)
            r0.write(r1)
            int r6 = r6 >>> 7
            goto L0
        L15:
            r6 = r6 & 127(0x7f, float:1.78E-43)
            r0.write(r6)
            return
    }

    /* renamed from: m */
    public final void m7565m(long r6) {
            r5 = this;
        L0:
            r0 = -128(0xffffffffffffff80, double:NaN)
            long r0 = r0 & r6
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            java.io.OutputStream r0 = r5.f12472a
            if (r4 == 0) goto L16
            int r1 = (int) r6
            r1 = r1 & 127(0x7f, float:1.78E-43)
            r1 = r1 | 128(0x80, float:1.8E-43)
            r0.write(r1)
            r0 = 7
            long r6 = r6 >>> r0
            goto L0
        L16:
            int r7 = (int) r6
            r6 = r7 & 127(0x7f, float:1.78E-43)
            r0.write(r6)
            return
    }
}
