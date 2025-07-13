package sa;

/* renamed from: sa.f */
/* loaded from: classes.dex */
public final class C6006f implements qa.InterfaceC5609f, qa.InterfaceC5611h {

    /* renamed from: a */
    public boolean f23145a;

    /* renamed from: b */
    public final android.util.JsonWriter f23146b;

    /* renamed from: c */
    public final java.util.Map<java.lang.Class<?>, qa.InterfaceC5608e<?>> f23147c;

    /* renamed from: d */
    public final java.util.Map<java.lang.Class<?>, qa.InterfaceC5610g<?>> f23148d;

    /* renamed from: e */
    public final qa.InterfaceC5608e<java.lang.Object> f23149e;

    /* renamed from: f */
    public final boolean f23150f;

    public C6006f(java.io.Writer r2, java.util.Map<java.lang.Class<?>, qa.InterfaceC5608e<?>> r3, java.util.Map<java.lang.Class<?>, qa.InterfaceC5610g<?>> r4, qa.InterfaceC5608e<java.lang.Object> r5, boolean r6) {
            r1 = this;
            r1.<init>()
            r0 = 1
            r1.f23145a = r0
            android.util.JsonWriter r0 = new android.util.JsonWriter
            r0.<init>(r2)
            r1.f23146b = r0
            r1.f23147c = r3
            r1.f23148d = r4
            r1.f23149e = r5
            r1.f23150f = r6
            return
    }

    @Override // qa.InterfaceC5611h
    /* renamed from: a */
    public qa.InterfaceC5611h mo7567a(java.lang.String r2) {
            r1 = this;
            r1.m12489i()
            android.util.JsonWriter r0 = r1.f23146b
            r0.value(r2)
            return r1
    }

    @Override // qa.InterfaceC5611h
    /* renamed from: b */
    public qa.InterfaceC5611h mo7568b(boolean r2) {
            r1 = this;
            r1.m12489i()
            android.util.JsonWriter r0 = r1.f23146b
            r0.value(r2)
            return r1
    }

    @Override // qa.InterfaceC5609f
    /* renamed from: c */
    public qa.InterfaceC5609f mo7558c(qa.C5607d r1, java.lang.Object r2) {
            r0 = this;
            java.lang.String r1 = r1.f21772a
            sa.f r1 = r0.m12488h(r1, r2)
            return r1
    }

    @Override // qa.InterfaceC5609f
    /* renamed from: d */
    public qa.InterfaceC5609f mo7559d(qa.C5607d r2, long r3) {
            r1 = this;
            java.lang.String r2 = r2.f21772a
            r1.m12489i()
            android.util.JsonWriter r0 = r1.f23146b
            r0.name(r2)
            r1.m12489i()
            android.util.JsonWriter r2 = r1.f23146b
            r2.value(r3)
            return r1
    }

    @Override // qa.InterfaceC5609f
    /* renamed from: e */
    public qa.InterfaceC5609f mo7560e(qa.C5607d r3, int r4) {
            r2 = this;
            java.lang.String r3 = r3.f21772a
            r2.m12489i()
            android.util.JsonWriter r0 = r2.f23146b
            r0.name(r3)
            r2.m12489i()
            android.util.JsonWriter r3 = r2.f23146b
            long r0 = (long) r4
            r3.value(r0)
            return r2
    }

    @Override // qa.InterfaceC5609f
    /* renamed from: f */
    public qa.InterfaceC5609f mo7561f(qa.C5607d r2, boolean r3) {
            r1 = this;
            java.lang.String r2 = r2.f21772a
            r1.m12489i()
            android.util.JsonWriter r0 = r1.f23146b
            r0.name(r2)
            r1.m12489i()
            android.util.JsonWriter r2 = r1.f23146b
            r2.value(r3)
            return r1
    }

    /* renamed from: g */
    public sa.C6006f m12487g(java.lang.Object r6, boolean r7) {
            r5 = this;
            r0 = 0
            r1 = 1
            if (r7 == 0) goto L3e
            if (r6 == 0) goto L23
            java.lang.Class r2 = r6.getClass()
            boolean r2 = r2.isArray()
            if (r2 != 0) goto L23
            boolean r2 = r6 instanceof java.util.Collection
            if (r2 != 0) goto L23
            boolean r2 = r6 instanceof java.util.Date
            if (r2 != 0) goto L23
            boolean r2 = r6 instanceof java.lang.Enum
            if (r2 != 0) goto L23
            boolean r2 = r6 instanceof java.lang.Number
            if (r2 == 0) goto L21
            goto L23
        L21:
            r2 = 0
            goto L24
        L23:
            r2 = 1
        L24:
            if (r2 == 0) goto L3e
            qa.c r7 = new qa.c
            java.lang.Object[] r1 = new java.lang.Object[r1]
            if (r6 != 0) goto L2e
            r6 = 0
            goto L32
        L2e:
            java.lang.Class r6 = r6.getClass()
        L32:
            r1[r0] = r6
            java.lang.String r6 = "%s cannot be encoded inline"
            java.lang.String r6 = java.lang.String.format(r6, r1)
            r7.<init>(r6)
            throw r7
        L3e:
            if (r6 != 0) goto L46
            android.util.JsonWriter r6 = r5.f23146b
            r6.nullValue()
            return r5
        L46:
            boolean r2 = r6 instanceof java.lang.Number
            if (r2 == 0) goto L52
            android.util.JsonWriter r7 = r5.f23146b
            java.lang.Number r6 = (java.lang.Number) r6
            r7.value(r6)
            return r5
        L52:
            java.lang.Class r2 = r6.getClass()
            boolean r2 = r2.isArray()
            r3 = 2
            if (r2 == 0) goto Leb
            boolean r7 = r6 instanceof byte[]
            if (r7 == 0) goto L70
            byte[] r6 = (byte[]) r6
            r5.m12489i()
            android.util.JsonWriter r7 = r5.f23146b
            java.lang.String r6 = android.util.Base64.encodeToString(r6, r3)
            r7.value(r6)
            return r5
        L70:
            android.util.JsonWriter r7 = r5.f23146b
            r7.beginArray()
            boolean r7 = r6 instanceof int[]
            if (r7 == 0) goto L89
            int[] r6 = (int[]) r6
            int r7 = r6.length
        L7c:
            if (r0 >= r7) goto Le5
            r1 = r6[r0]
            android.util.JsonWriter r2 = r5.f23146b
            long r3 = (long) r1
            r2.value(r3)
            int r0 = r0 + 1
            goto L7c
        L89:
            boolean r7 = r6 instanceof long[]
            if (r7 == 0) goto L9f
            long[] r6 = (long[]) r6
            int r7 = r6.length
        L90:
            if (r0 >= r7) goto Le5
            r1 = r6[r0]
            r5.m12489i()
            android.util.JsonWriter r3 = r5.f23146b
            r3.value(r1)
            int r0 = r0 + 1
            goto L90
        L9f:
            boolean r7 = r6 instanceof double[]
            if (r7 == 0) goto Lb2
            double[] r6 = (double[]) r6
            int r7 = r6.length
        La6:
            if (r0 >= r7) goto Le5
            r1 = r6[r0]
            android.util.JsonWriter r3 = r5.f23146b
            r3.value(r1)
            int r0 = r0 + 1
            goto La6
        Lb2:
            boolean r7 = r6 instanceof boolean[]
            if (r7 == 0) goto Lc5
            boolean[] r6 = (boolean[]) r6
            int r7 = r6.length
        Lb9:
            if (r0 >= r7) goto Le5
            boolean r1 = r6[r0]
            android.util.JsonWriter r2 = r5.f23146b
            r2.value(r1)
            int r0 = r0 + 1
            goto Lb9
        Lc5:
            boolean r7 = r6 instanceof java.lang.Number[]
            if (r7 == 0) goto Ld7
            java.lang.Number[] r6 = (java.lang.Number[]) r6
            int r7 = r6.length
            r1 = 0
        Lcd:
            if (r1 >= r7) goto Le5
            r2 = r6[r1]
            r5.m12487g(r2, r0)
            int r1 = r1 + 1
            goto Lcd
        Ld7:
            java.lang.Object[] r6 = (java.lang.Object[]) r6
            int r7 = r6.length
            r1 = 0
        Ldb:
            if (r1 >= r7) goto Le5
            r2 = r6[r1]
            r5.m12487g(r2, r0)
            int r1 = r1 + 1
            goto Ldb
        Le5:
            android.util.JsonWriter r6 = r5.f23146b
            r6.endArray()
            return r5
        Leb:
            boolean r2 = r6 instanceof java.util.Collection
            if (r2 == 0) goto L10e
            java.util.Collection r6 = (java.util.Collection) r6
            android.util.JsonWriter r7 = r5.f23146b
            r7.beginArray()
            java.util.Iterator r6 = r6.iterator()
        Lfa:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L108
            java.lang.Object r7 = r6.next()
            r5.m12487g(r7, r0)
            goto Lfa
        L108:
            android.util.JsonWriter r6 = r5.f23146b
            r6.endArray()
            return r5
        L10e:
            boolean r2 = r6 instanceof java.util.Map
            if (r2 == 0) goto L159
            java.util.Map r6 = (java.util.Map) r6
            android.util.JsonWriter r7 = r5.f23146b
            r7.beginObject()
            java.util.Set r6 = r6.entrySet()
            java.util.Iterator r6 = r6.iterator()
        L121:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L153
            java.lang.Object r7 = r6.next()
            java.util.Map$Entry r7 = (java.util.Map.Entry) r7
            java.lang.Object r2 = r7.getKey()
            r4 = r2
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.ClassCastException -> L13c
            java.lang.Object r7 = r7.getValue()     // Catch: java.lang.ClassCastException -> L13c
            r5.m12488h(r4, r7)     // Catch: java.lang.ClassCastException -> L13c
            goto L121
        L13c:
            r6 = move-exception
            qa.c r7 = new qa.c
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r0] = r2
            java.lang.Class r0 = r2.getClass()
            r3[r1] = r0
            java.lang.String r0 = "Only String keys are currently supported in maps, got %s of type %s instead."
            java.lang.String r0 = java.lang.String.format(r0, r3)
            r7.<init>(r0, r6)
            throw r7
        L153:
            android.util.JsonWriter r6 = r5.f23146b
            r6.endObject()
            return r5
        L159:
            java.util.Map<java.lang.Class<?>, qa.e<?>> r0 = r5.f23147c
            java.lang.Class r1 = r6.getClass()
            java.lang.Object r0 = r0.get(r1)
            qa.e r0 = (qa.InterfaceC5608e) r0
            if (r0 == 0) goto L179
            if (r7 != 0) goto L16e
            android.util.JsonWriter r1 = r5.f23146b
            r1.beginObject()
        L16e:
            r0.mo5556a(r6, r5)
            if (r7 != 0) goto L178
            android.util.JsonWriter r6 = r5.f23146b
            r6.endObject()
        L178:
            return r5
        L179:
            java.util.Map<java.lang.Class<?>, qa.g<?>> r0 = r5.f23148d
            java.lang.Class r1 = r6.getClass()
            java.lang.Object r0 = r0.get(r1)
            qa.g r0 = (qa.InterfaceC5610g) r0
            if (r0 == 0) goto L18b
            r0.mo5556a(r6, r5)
            return r5
        L18b:
            boolean r0 = r6 instanceof java.lang.Enum
            if (r0 == 0) goto L19e
            java.lang.Enum r6 = (java.lang.Enum) r6
            java.lang.String r6 = r6.name()
            r5.m12489i()
            android.util.JsonWriter r7 = r5.f23146b
            r7.value(r6)
            return r5
        L19e:
            qa.e<java.lang.Object> r0 = r5.f23149e
            if (r7 != 0) goto L1a7
            android.util.JsonWriter r1 = r5.f23146b
            r1.beginObject()
        L1a7:
            r0.mo5556a(r6, r5)
            if (r7 != 0) goto L1b1
            android.util.JsonWriter r6 = r5.f23146b
            r6.endObject()
        L1b1:
            return r5
    }

    /* renamed from: h */
    public sa.C6006f m12488h(java.lang.String r3, java.lang.Object r4) {
            r2 = this;
            boolean r0 = r2.f23150f
            r1 = 0
            if (r0 == 0) goto L16
            if (r4 != 0) goto L9
            r3 = r2
            goto L15
        L9:
            r2.m12489i()
            android.util.JsonWriter r0 = r2.f23146b
            r0.name(r3)
            sa.f r3 = r2.m12487g(r4, r1)
        L15:
            return r3
        L16:
            r2.m12489i()
            android.util.JsonWriter r0 = r2.f23146b
            r0.name(r3)
            if (r4 != 0) goto L27
            android.util.JsonWriter r3 = r2.f23146b
            r3.nullValue()
            r3 = r2
            goto L2b
        L27:
            sa.f r3 = r2.m12487g(r4, r1)
        L2b:
            return r3
    }

    /* renamed from: i */
    public final void m12489i() {
            r2 = this;
            boolean r0 = r2.f23145a
            if (r0 == 0) goto L5
            return
        L5:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Parent context used since this context was created. Cannot use this context anymore."
            r0.<init>(r1)
            throw r0
    }
}
