package p249o7;

/* renamed from: o7.y6 */
/* loaded from: classes.dex */
public final class C5148y6 extends p249o7.AbstractC5156z6 {

    /* renamed from: g */
    public final /* synthetic */ int f20196g;

    /* renamed from: h */
    public final java.lang.Object f20197h;

    /* renamed from: i */
    public final /* synthetic */ p249o7.C4956a7 f20198i;

    public C5148y6(p249o7.C4956a7 r2, java.lang.String r3, int r4, p185k7.C3727a2 r5) {
            r1 = this;
            r0 = 1
            r1.f20196g = r0
            r1.f20198i = r2
            r1.<init>(r3, r4)
            r1.f20197h = r5
            return
    }

    public C5148y6(p249o7.C4956a7 r2, java.lang.String r3, int r4, p185k7.C3970s1 r5) {
            r1 = this;
            r0 = 0
            r1.f20196g = r0
            r1.f20198i = r2
            r1.<init>(r3, r4)
            r1.f20197h = r5
            return
    }

    /* renamed from: f */
    public boolean m11454f(java.lang.Long r17, java.lang.Long r18, p185k7.C3997u2 r19, long r20, p249o7.C5053n r22, boolean r23) {
            r16 = this;
            r0 = r16
            p185k7.C4030w9.m9080c()
            o7.a7 r1 = r0.f20198i
            com.google.android.gms.measurement.internal.d r1 = r1.f5736a
            o7.f r1 = r1.f5716g
            java.lang.String r2 = r0.f20207a
            o7.u2<java.lang.Boolean> r3 = p249o7.C5120v2.f20080Y
            boolean r1 = r1.m11162v(r2, r3)
            java.lang.Object r2 = r0.f20197h
            k7.s1 r2 = (p185k7.C3970s1) r2
            boolean r2 = r2.m8932E()
            if (r2 == 0) goto L22
            r2 = r22
            long r2 = r2.f19890e
            goto L24
        L22:
            r2 = r20
        L24:
            o7.a7 r4 = r0.f20198i
            com.google.android.gms.measurement.internal.d r4 = r4.f5736a
            com.google.android.gms.measurement.internal.b r4 = r4.mo3162d()
            java.lang.String r4 = r4.m3144x()
            r5 = 2
            boolean r4 = android.util.Log.isLoggable(r4, r5)
            java.lang.String r6 = "null"
            r7 = 0
            r8 = 1
            r9 = 0
            if (r4 == 0) goto L11f
            o7.a7 r4 = r0.f20198i
            com.google.android.gms.measurement.internal.d r4 = r4.f5736a
            com.google.android.gms.measurement.internal.b r4 = r4.mo3162d()
            o7.f3 r4 = r4.f5680n
            int r10 = r0.f20208b
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            java.lang.Object r11 = r0.f20197h
            k7.s1 r11 = (p185k7.C3970s1) r11
            boolean r11 = r11.m8934G()
            if (r11 == 0) goto L63
            java.lang.Object r11 = r0.f20197h
            k7.s1 r11 = (p185k7.C3970s1) r11
            int r11 = r11.m8937t()
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            goto L64
        L63:
            r11 = r7
        L64:
            o7.a7 r12 = r0.f20198i
            com.google.android.gms.measurement.internal.d r12 = r12.f5736a
            o7.c3 r12 = r12.f5722m
            java.lang.Object r13 = r0.f20197h
            k7.s1 r13 = (p185k7.C3970s1) r13
            java.lang.String r13 = r13.m8940y()
            java.lang.String r12 = r12.m11116d(r13)
            java.lang.String r13 = "Evaluating filter. audience, filter, event"
            r4.m11172f(r13, r10, r11, r12)
            o7.a7 r4 = r0.f20198i
            com.google.android.gms.measurement.internal.d r4 = r4.f5736a
            com.google.android.gms.measurement.internal.b r4 = r4.mo3162d()
            o7.f3 r4 = r4.f5680n
            o7.a7 r10 = r0.f20198i
            o7.m6 r10 = r10.f19756b
            o7.o6 r10 = r10.f19866g
            p249o7.C5052m6.m11327I(r10)
            java.lang.Object r11 = r0.f20197h
            k7.s1 r11 = (p185k7.C3970s1) r11
            if (r11 != 0) goto L97
            r5 = r6
            goto L11a
        L97:
            java.lang.String r12 = "\nevent_filter {\n"
            java.lang.StringBuilder r12 = android.support.v4.media.C0144c.m256a(r12)
            boolean r13 = r11.m8934G()
            if (r13 == 0) goto Lb0
            int r13 = r11.m8937t()
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            java.lang.String r14 = "filter_id"
            p249o7.C5068o6.m11392v(r12, r9, r14, r13)
        Lb0:
            com.google.android.gms.measurement.internal.d r13 = r10.f5736a
            o7.c3 r13 = r13.f5722m
            java.lang.String r14 = r11.m8940y()
            java.lang.String r13 = r13.m11116d(r14)
            java.lang.String r14 = "event_name"
            p249o7.C5068o6.m11392v(r12, r9, r14, r13)
            boolean r13 = r11.m8930C()
            boolean r14 = r11.m8931D()
            boolean r15 = r11.m8932E()
            java.lang.String r13 = p249o7.C5068o6.m11390t(r13, r14, r15)
            boolean r14 = r13.isEmpty()
            if (r14 != 0) goto Ldc
            java.lang.String r14 = "filter_type"
            p249o7.C5068o6.m11392v(r12, r9, r14, r13)
        Ldc:
            boolean r13 = r11.m8933F()
            if (r13 == 0) goto Leb
            k7.y1 r13 = r11.m8939x()
            java.lang.String r14 = "event_count_filter"
            p249o7.C5068o6.m11393w(r12, r8, r14, r13)
        Leb:
            int r13 = r11.m8936s()
            if (r13 <= 0) goto L10e
            java.lang.String r13 = "  filters {\n"
            r12.append(r13)
            java.util.List r11 = r11.m8941z()
            java.util.Iterator r11 = r11.iterator()
        Lfe:
            boolean r13 = r11.hasNext()
            if (r13 == 0) goto L10e
            java.lang.Object r13 = r11.next()
            k7.u1 r13 = (p185k7.C3996u1) r13
            r10.m11407r(r12, r5, r13)
            goto Lfe
        L10e:
            p249o7.C5068o6.m11389s(r12, r8)
            java.lang.String r5 = "}\n}\n"
            r12.append(r5)
            java.lang.String r5 = r12.toString()
        L11a:
            java.lang.String r10 = "Filter definition"
            r4.m11170d(r10, r5)
        L11f:
            java.lang.Object r4 = r0.f20197h
            k7.s1 r4 = (p185k7.C3970s1) r4
            boolean r4 = r4.m8934G()
            if (r4 == 0) goto L486
            java.lang.Object r4 = r0.f20197h
            k7.s1 r4 = (p185k7.C3970s1) r4
            int r4 = r4.m8937t()
            r5 = 256(0x100, float:3.59E-43)
            if (r4 <= r5) goto L137
            goto L486
        L137:
            java.lang.Object r4 = r0.f20197h
            k7.s1 r4 = (p185k7.C3970s1) r4
            boolean r4 = r4.m8930C()
            java.lang.Object r5 = r0.f20197h
            k7.s1 r5 = (p185k7.C3970s1) r5
            boolean r5 = r5.m8931D()
            java.lang.Object r10 = r0.f20197h
            k7.s1 r10 = (p185k7.C3970s1) r10
            boolean r10 = r10.m8932E()
            if (r4 != 0) goto L158
            if (r5 != 0) goto L158
            if (r10 == 0) goto L156
            goto L158
        L156:
            r4 = 0
            goto L159
        L158:
            r4 = 1
        L159:
            if (r23 == 0) goto L189
            if (r4 != 0) goto L189
            o7.a7 r1 = r0.f20198i
            com.google.android.gms.measurement.internal.d r1 = r1.f5736a
            com.google.android.gms.measurement.internal.b r1 = r1.mo3162d()
            o7.f3 r1 = r1.f5680n
            int r2 = r0.f20208b
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object r3 = r0.f20197h
            k7.s1 r3 = (p185k7.C3970s1) r3
            boolean r3 = r3.m8934G()
            if (r3 == 0) goto L183
            java.lang.Object r3 = r0.f20197h
            k7.s1 r3 = (p185k7.C3970s1) r3
            int r3 = r3.m8937t()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r3)
        L183:
            java.lang.String r3 = "Event filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID"
            r1.m11171e(r3, r2, r7)
            return r8
        L189:
            java.lang.Object r5 = r0.f20197h
            k7.s1 r5 = (p185k7.C3970s1) r5
            java.lang.String r10 = r19.m9052z()
            boolean r11 = r5.m8933F()
            if (r11 == 0) goto L1ab
            k7.y1 r11 = r5.m8939x()
            java.lang.Boolean r2 = p249o7.AbstractC5156z6.m11463c(r2, r11)
            if (r2 != 0) goto L1a3
            goto L426
        L1a3:
            boolean r2 = r2.booleanValue()
            if (r2 != 0) goto L1ab
            goto L405
        L1ab:
            java.util.HashSet r2 = new java.util.HashSet
            r2.<init>()
            java.util.List r3 = r5.m8941z()
            java.util.Iterator r3 = r3.iterator()
        L1b8:
            boolean r11 = r3.hasNext()
            if (r11 == 0) goto L1ee
            java.lang.Object r11 = r3.next()
            k7.u1 r11 = (p185k7.C3996u1) r11
            java.lang.String r12 = r11.m9029w()
            boolean r12 = r12.isEmpty()
            if (r12 == 0) goto L1e6
            o7.a7 r2 = r0.f20198i
            com.google.android.gms.measurement.internal.d r2 = r2.f5736a
            com.google.android.gms.measurement.internal.b r2 = r2.mo3162d()
            o7.f3 r2 = r2.f5675i
            o7.a7 r3 = r0.f20198i
            com.google.android.gms.measurement.internal.d r3 = r3.f5736a
            o7.c3 r3 = r3.f5722m
            java.lang.String r3 = r3.m11116d(r10)
            java.lang.String r5 = "null or empty param name in filter. event"
            goto L2c0
        L1e6:
            java.lang.String r11 = r11.m9029w()
            r2.add(r11)
            goto L1b8
        L1ee:
            s.a r3 = new s.a
            r3.<init>()
            java.util.List r11 = r19.m9042A()
            java.util.Iterator r11 = r11.iterator()
        L1fb:
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto L27d
            java.lang.Object r12 = r11.next()
            k7.y2 r12 = (p185k7.C4049y2) r12
            java.lang.String r13 = r12.m9148y()
            boolean r13 = r2.contains(r13)
            if (r13 == 0) goto L1fb
            boolean r13 = r12.m9141N()
            if (r13 == 0) goto L22a
            java.lang.String r13 = r12.m9148y()
            boolean r14 = r12.m9141N()
            if (r14 == 0) goto L243
            long r14 = r12.m9147v()
            java.lang.Long r12 = java.lang.Long.valueOf(r14)
            goto L253
        L22a:
            boolean r13 = r12.m9139L()
            if (r13 == 0) goto L245
            java.lang.String r13 = r12.m9148y()
            boolean r14 = r12.m9139L()
            if (r14 == 0) goto L243
            double r14 = r12.m9144s()
            java.lang.Double r12 = java.lang.Double.valueOf(r14)
            goto L253
        L243:
            r12 = r7
            goto L253
        L245:
            boolean r13 = r12.m9143P()
            if (r13 == 0) goto L257
            java.lang.String r13 = r12.m9148y()
            java.lang.String r12 = r12.m9149z()
        L253:
            r3.put(r13, r12)
            goto L1fb
        L257:
            o7.a7 r2 = r0.f20198i
            com.google.android.gms.measurement.internal.d r2 = r2.f5736a
            com.google.android.gms.measurement.internal.b r2 = r2.mo3162d()
            o7.f3 r2 = r2.f5675i
            o7.a7 r3 = r0.f20198i
            com.google.android.gms.measurement.internal.d r3 = r3.f5736a
            o7.c3 r3 = r3.f5722m
            java.lang.String r3 = r3.m11116d(r10)
            o7.a7 r5 = r0.f20198i
            com.google.android.gms.measurement.internal.d r5 = r5.f5736a
            o7.c3 r5 = r5.f5722m
            java.lang.String r10 = r12.m9148y()
            java.lang.String r5 = r5.m11117e(r10)
            java.lang.String r10 = "Unknown value for param. event, param"
            goto L420
        L27d:
            java.util.List r2 = r5.m8941z()
            java.util.Iterator r2 = r2.iterator()
        L285:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L424
            java.lang.Object r5 = r2.next()
            k7.u1 r5 = (p185k7.C3996u1) r5
            boolean r11 = r5.m9031z()
            if (r11 == 0) goto L29f
            boolean r11 = r5.m9030y()
            if (r11 == 0) goto L29f
            r11 = 1
            goto L2a0
        L29f:
            r11 = 0
        L2a0:
            java.lang.String r12 = r5.m9029w()
            boolean r13 = r12.isEmpty()
            if (r13 == 0) goto L2c5
            o7.a7 r2 = r0.f20198i
            com.google.android.gms.measurement.internal.d r2 = r2.f5736a
            com.google.android.gms.measurement.internal.b r2 = r2.mo3162d()
            o7.f3 r2 = r2.f5675i
            o7.a7 r3 = r0.f20198i
            com.google.android.gms.measurement.internal.d r3 = r3.f5736a
            o7.c3 r3 = r3.f5722m
            java.lang.String r3 = r3.m11116d(r10)
            java.lang.String r5 = "Event has empty param name. event"
        L2c0:
            r2.m11170d(r5, r3)
            goto L426
        L2c5:
            java.lang.Object r13 = r3.getOrDefault(r12, r7)
            boolean r14 = r13 instanceof java.lang.Long
            if (r14 == 0) goto L30f
            boolean r14 = r5.m9024A()
            if (r14 != 0) goto L2f5
            o7.a7 r2 = r0.f20198i
            com.google.android.gms.measurement.internal.d r2 = r2.f5736a
            com.google.android.gms.measurement.internal.b r2 = r2.mo3162d()
            o7.f3 r2 = r2.f5675i
            o7.a7 r3 = r0.f20198i
            com.google.android.gms.measurement.internal.d r3 = r3.f5736a
            o7.c3 r3 = r3.f5722m
            java.lang.String r3 = r3.m11116d(r10)
            o7.a7 r5 = r0.f20198i
            com.google.android.gms.measurement.internal.d r5 = r5.f5736a
            o7.c3 r5 = r5.f5722m
            java.lang.String r5 = r5.m11117e(r12)
            java.lang.String r10 = "No number filter for long param. event, param"
            goto L420
        L2f5:
            java.lang.Long r13 = (java.lang.Long) r13
            long r12 = r13.longValue()
            k7.y1 r5 = r5.m9027u()
            java.lang.Boolean r5 = p249o7.AbstractC5156z6.m11463c(r12, r5)
            if (r5 != 0) goto L307
            goto L426
        L307:
            boolean r5 = r5.booleanValue()
            if (r5 != r11) goto L285
            goto L405
        L30f:
            boolean r14 = r13 instanceof java.lang.Double
            if (r14 == 0) goto L360
            boolean r14 = r5.m9024A()
            if (r14 != 0) goto L33b
            o7.a7 r2 = r0.f20198i
            com.google.android.gms.measurement.internal.d r2 = r2.f5736a
            com.google.android.gms.measurement.internal.b r2 = r2.mo3162d()
            o7.f3 r2 = r2.f5675i
            o7.a7 r3 = r0.f20198i
            com.google.android.gms.measurement.internal.d r3 = r3.f5736a
            o7.c3 r3 = r3.f5722m
            java.lang.String r3 = r3.m11116d(r10)
            o7.a7 r5 = r0.f20198i
            com.google.android.gms.measurement.internal.d r5 = r5.f5736a
            o7.c3 r5 = r5.f5722m
            java.lang.String r5 = r5.m11117e(r12)
            java.lang.String r10 = "No number filter for double param. event, param"
            goto L420
        L33b:
            java.lang.Double r13 = (java.lang.Double) r13
            double r12 = r13.doubleValue()
            k7.y1 r5 = r5.m9027u()
            java.math.BigDecimal r14 = new java.math.BigDecimal     // Catch: java.lang.NumberFormatException -> L353
            r14.<init>(r12)     // Catch: java.lang.NumberFormatException -> L353
            double r12 = java.lang.Math.ulp(r12)     // Catch: java.lang.NumberFormatException -> L353
            java.lang.Boolean r5 = p249o7.AbstractC5156z6.m11461a(r14, r5, r12)     // Catch: java.lang.NumberFormatException -> L353
            goto L354
        L353:
            r5 = r7
        L354:
            if (r5 != 0) goto L358
            goto L426
        L358:
            boolean r5 = r5.booleanValue()
            if (r5 != r11) goto L285
            goto L405
        L360:
            boolean r14 = r13 instanceof java.lang.String
            if (r14 == 0) goto L3e0
            boolean r14 = r5.m9026C()
            if (r14 == 0) goto L37d
            java.lang.String r13 = (java.lang.String) r13
            k7.e2 r5 = r5.m9028v()
            o7.a7 r12 = r0.f20198i
            com.google.android.gms.measurement.internal.d r12 = r12.f5736a
            com.google.android.gms.measurement.internal.b r12 = r12.mo3162d()
            java.lang.Boolean r5 = p249o7.AbstractC5156z6.m11462b(r13, r5, r12)
            goto L393
        L37d:
            boolean r14 = r5.m9024A()
            if (r14 == 0) goto L3bf
            java.lang.String r13 = (java.lang.String) r13
            boolean r14 = p249o7.C5068o6.m11384O(r13)
            if (r14 == 0) goto L39e
            k7.y1 r5 = r5.m9027u()
            java.lang.Boolean r5 = p249o7.AbstractC5156z6.m11464d(r13, r5)
        L393:
            if (r5 != 0) goto L397
            goto L426
        L397:
            boolean r5 = r5.booleanValue()
            if (r5 != r11) goto L285
            goto L405
        L39e:
            o7.a7 r2 = r0.f20198i
            com.google.android.gms.measurement.internal.d r2 = r2.f5736a
            com.google.android.gms.measurement.internal.b r2 = r2.mo3162d()
            o7.f3 r2 = r2.f5675i
            o7.a7 r3 = r0.f20198i
            com.google.android.gms.measurement.internal.d r3 = r3.f5736a
            o7.c3 r3 = r3.f5722m
            java.lang.String r3 = r3.m11116d(r10)
            o7.a7 r5 = r0.f20198i
            com.google.android.gms.measurement.internal.d r5 = r5.f5736a
            o7.c3 r5 = r5.f5722m
            java.lang.String r5 = r5.m11117e(r12)
            java.lang.String r10 = "Invalid param value for number filter. event, param"
            goto L420
        L3bf:
            o7.a7 r2 = r0.f20198i
            com.google.android.gms.measurement.internal.d r2 = r2.f5736a
            com.google.android.gms.measurement.internal.b r2 = r2.mo3162d()
            o7.f3 r2 = r2.f5675i
            o7.a7 r3 = r0.f20198i
            com.google.android.gms.measurement.internal.d r3 = r3.f5736a
            o7.c3 r3 = r3.f5722m
            java.lang.String r3 = r3.m11116d(r10)
            o7.a7 r5 = r0.f20198i
            com.google.android.gms.measurement.internal.d r5 = r5.f5736a
            o7.c3 r5 = r5.f5722m
            java.lang.String r5 = r5.m11117e(r12)
            java.lang.String r10 = "No filter for String param. event, param"
            goto L420
        L3e0:
            o7.a7 r2 = r0.f20198i
            com.google.android.gms.measurement.internal.d r2 = r2.f5736a
            com.google.android.gms.measurement.internal.b r2 = r2.mo3162d()
            if (r13 != 0) goto L408
            o7.f3 r2 = r2.f5680n
            o7.a7 r3 = r0.f20198i
            com.google.android.gms.measurement.internal.d r3 = r3.f5736a
            o7.c3 r3 = r3.f5722m
            java.lang.String r3 = r3.m11116d(r10)
            o7.a7 r5 = r0.f20198i
            com.google.android.gms.measurement.internal.d r5 = r5.f5736a
            o7.c3 r5 = r5.f5722m
            java.lang.String r5 = r5.m11117e(r12)
            java.lang.String r7 = "Missing param for filter. event, param"
            r2.m11171e(r7, r3, r5)
        L405:
            java.lang.Boolean r7 = java.lang.Boolean.FALSE
            goto L426
        L408:
            o7.f3 r2 = r2.f5675i
            o7.a7 r3 = r0.f20198i
            com.google.android.gms.measurement.internal.d r3 = r3.f5736a
            o7.c3 r3 = r3.f5722m
            java.lang.String r3 = r3.m11116d(r10)
            o7.a7 r5 = r0.f20198i
            com.google.android.gms.measurement.internal.d r5 = r5.f5736a
            o7.c3 r5 = r5.f5722m
            java.lang.String r5 = r5.m11117e(r12)
            java.lang.String r10 = "Unknown param type. event, param"
        L420:
            r2.m11171e(r10, r3, r5)
            goto L426
        L424:
            java.lang.Boolean r7 = java.lang.Boolean.TRUE
        L426:
            o7.a7 r2 = r0.f20198i
            com.google.android.gms.measurement.internal.d r2 = r2.f5736a
            com.google.android.gms.measurement.internal.b r2 = r2.mo3162d()
            o7.f3 r2 = r2.f5680n
            if (r7 != 0) goto L433
            goto L434
        L433:
            r6 = r7
        L434:
            java.lang.String r3 = "Event filter result"
            r2.m11170d(r3, r6)
            if (r7 != 0) goto L43c
            return r9
        L43c:
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            r0.f20209c = r2
            boolean r3 = r7.booleanValue()
            if (r3 != 0) goto L447
            return r8
        L447:
            r0.f20210d = r2
            if (r4 == 0) goto L485
            boolean r2 = r19.m9045L()
            if (r2 == 0) goto L485
            long r2 = r19.m9050v()
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            java.lang.Object r3 = r0.f20197h
            k7.s1 r3 = (p185k7.C3970s1) r3
            boolean r3 = r3.m8931D()
            if (r3 == 0) goto L475
            if (r1 == 0) goto L472
            java.lang.Object r1 = r0.f20197h
            k7.s1 r1 = (p185k7.C3970s1) r1
            boolean r1 = r1.m8933F()
            if (r1 != 0) goto L470
            goto L472
        L470:
            r2 = r17
        L472:
            r0.f20212f = r2
            goto L485
        L475:
            if (r1 == 0) goto L483
            java.lang.Object r1 = r0.f20197h
            k7.s1 r1 = (p185k7.C3970s1) r1
            boolean r1 = r1.m8933F()
            if (r1 == 0) goto L483
            r2 = r18
        L483:
            r0.f20211e = r2
        L485:
            return r8
        L486:
            o7.a7 r1 = r0.f20198i
            com.google.android.gms.measurement.internal.d r1 = r1.f5736a
            com.google.android.gms.measurement.internal.b r1 = r1.mo3162d()
            o7.f3 r1 = r1.f5675i
            java.lang.String r2 = r0.f20207a
            java.lang.Object r2 = com.google.android.gms.measurement.internal.C1111b.m3134u(r2)
            java.lang.Object r3 = r0.f20197h
            k7.s1 r3 = (p185k7.C3970s1) r3
            boolean r3 = r3.m8934G()
            if (r3 == 0) goto L4ac
            java.lang.Object r3 = r0.f20197h
            k7.s1 r3 = (p185k7.C3970s1) r3
            int r3 = r3.m8937t()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r3)
        L4ac:
            java.lang.String r3 = java.lang.String.valueOf(r7)
            java.lang.String r4 = "Invalid event filter ID. appId, id"
            r1.m11171e(r4, r2, r3)
            return r9
    }

    /* renamed from: g */
    public boolean m11455g(java.lang.Long r12, java.lang.Long r13, p185k7.C3894m3 r14, boolean r15) {
            r11 = this;
            p185k7.C4030w9.m9080c()
            o7.a7 r0 = r11.f20198i
            com.google.android.gms.measurement.internal.d r0 = r0.f5736a
            o7.f r0 = r0.f5716g
            java.lang.String r1 = r11.f20207a
            o7.u2<java.lang.Boolean> r2 = p249o7.C5120v2.f20078W
            boolean r0 = r0.m11162v(r1, r2)
            java.lang.Object r1 = r11.f20197h
            k7.a2 r1 = (p185k7.C3727a2) r1
            boolean r1 = r1.m8193y()
            java.lang.Object r2 = r11.f20197h
            k7.a2 r2 = (p185k7.C3727a2) r2
            boolean r2 = r2.m8194z()
            java.lang.Object r3 = r11.f20197h
            k7.a2 r3 = (p185k7.C3727a2) r3
            boolean r3 = r3.m8186A()
            r4 = 1
            r5 = 0
            if (r1 != 0) goto L34
            if (r2 != 0) goto L34
            if (r3 == 0) goto L32
            goto L34
        L32:
            r1 = 0
            goto L35
        L34:
            r1 = 1
        L35:
            r2 = 0
            if (r15 == 0) goto L66
            if (r1 != 0) goto L66
            o7.a7 r12 = r11.f20198i
            com.google.android.gms.measurement.internal.d r12 = r12.f5736a
            com.google.android.gms.measurement.internal.b r12 = r12.mo3162d()
            o7.f3 r12 = r12.f5680n
            int r13 = r11.f20208b
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            java.lang.Object r14 = r11.f20197h
            k7.a2 r14 = (p185k7.C3727a2) r14
            boolean r14 = r14.m8187B()
            if (r14 == 0) goto L60
            java.lang.Object r14 = r11.f20197h
            k7.a2 r14 = (p185k7.C3727a2) r14
            int r14 = r14.m8190s()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r14)
        L60:
            java.lang.String r14 = "Property filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID"
            r12.m11171e(r14, r13, r2)
            return r4
        L66:
            java.lang.Object r6 = r11.f20197h
            k7.a2 r6 = (p185k7.C3727a2) r6
            k7.u1 r6 = r6.m8191t()
            boolean r7 = r6.m9030y()
            boolean r8 = r14.m8808I()
            if (r8 == 0) goto La8
            boolean r8 = r6.m9024A()
            if (r8 != 0) goto L9a
            o7.a7 r6 = r11.f20198i
            com.google.android.gms.measurement.internal.d r6 = r6.f5736a
            com.google.android.gms.measurement.internal.b r6 = r6.mo3162d()
            o7.f3 r6 = r6.f5675i
            o7.a7 r7 = r11.f20198i
            com.google.android.gms.measurement.internal.d r7 = r7.f5736a
            o7.c3 r7 = r7.f5722m
            java.lang.String r8 = r14.m8814x()
            java.lang.String r7 = r7.m11118f(r8)
            java.lang.String r8 = "No number filter for long property. property"
            goto L180
        L9a:
            long r8 = r14.m8812t()
            k7.y1 r2 = r6.m9027u()
            java.lang.Boolean r2 = p249o7.AbstractC5156z6.m11463c(r8, r2)
            goto L161
        La8:
            boolean r8 = r14.m8807H()
            if (r8 == 0) goto Le7
            boolean r8 = r6.m9024A()
            if (r8 != 0) goto Ld0
            o7.a7 r6 = r11.f20198i
            com.google.android.gms.measurement.internal.d r6 = r6.f5736a
            com.google.android.gms.measurement.internal.b r6 = r6.mo3162d()
            o7.f3 r6 = r6.f5675i
            o7.a7 r7 = r11.f20198i
            com.google.android.gms.measurement.internal.d r7 = r7.f5736a
            o7.c3 r7 = r7.f5722m
            java.lang.String r8 = r14.m8814x()
            java.lang.String r7 = r7.m11118f(r8)
            java.lang.String r8 = "No number filter for double property. property"
            goto L180
        Ld0:
            double r8 = r14.m8811s()
            k7.y1 r6 = r6.m9027u()
            java.math.BigDecimal r10 = new java.math.BigDecimal     // Catch: java.lang.NumberFormatException -> L161
            r10.<init>(r8)     // Catch: java.lang.NumberFormatException -> L161
            double r8 = java.lang.Math.ulp(r8)     // Catch: java.lang.NumberFormatException -> L161
            java.lang.Boolean r2 = p249o7.AbstractC5156z6.m11461a(r10, r6, r8)     // Catch: java.lang.NumberFormatException -> L161
            goto L161
        Le7:
            boolean r8 = r14.m8810K()
            if (r8 == 0) goto L166
            boolean r8 = r6.m9026C()
            if (r8 != 0) goto L14d
            boolean r8 = r6.m9024A()
            if (r8 != 0) goto L114
            o7.a7 r6 = r11.f20198i
            com.google.android.gms.measurement.internal.d r6 = r6.f5736a
            com.google.android.gms.measurement.internal.b r6 = r6.mo3162d()
            o7.f3 r6 = r6.f5675i
            o7.a7 r7 = r11.f20198i
            com.google.android.gms.measurement.internal.d r7 = r7.f5736a
            o7.c3 r7 = r7.f5722m
            java.lang.String r8 = r14.m8814x()
            java.lang.String r7 = r7.m11118f(r8)
            java.lang.String r8 = "No string or number filter defined. property"
            goto L180
        L114:
            java.lang.String r8 = r14.m8815y()
            boolean r8 = p249o7.C5068o6.m11384O(r8)
            if (r8 == 0) goto L12b
            java.lang.String r2 = r14.m8815y()
            k7.y1 r6 = r6.m9027u()
            java.lang.Boolean r2 = p249o7.AbstractC5156z6.m11464d(r2, r6)
            goto L161
        L12b:
            o7.a7 r6 = r11.f20198i
            com.google.android.gms.measurement.internal.d r6 = r6.f5736a
            com.google.android.gms.measurement.internal.b r6 = r6.mo3162d()
            o7.f3 r6 = r6.f5675i
            o7.a7 r7 = r11.f20198i
            com.google.android.gms.measurement.internal.d r7 = r7.f5736a
            o7.c3 r7 = r7.f5722m
            java.lang.String r8 = r14.m8814x()
            java.lang.String r7 = r7.m11118f(r8)
            java.lang.String r8 = r14.m8815y()
            java.lang.String r9 = "Invalid user property value for Numeric number filter. property, value"
            r6.m11171e(r9, r7, r8)
            goto L183
        L14d:
            java.lang.String r2 = r14.m8815y()
            k7.e2 r6 = r6.m9028v()
            o7.a7 r8 = r11.f20198i
            com.google.android.gms.measurement.internal.d r8 = r8.f5736a
            com.google.android.gms.measurement.internal.b r8 = r8.mo3162d()
            java.lang.Boolean r2 = p249o7.AbstractC5156z6.m11462b(r2, r6, r8)
        L161:
            java.lang.Boolean r2 = p249o7.AbstractC5156z6.m11465e(r2, r7)
            goto L183
        L166:
            o7.a7 r6 = r11.f20198i
            com.google.android.gms.measurement.internal.d r6 = r6.f5736a
            com.google.android.gms.measurement.internal.b r6 = r6.mo3162d()
            o7.f3 r6 = r6.f5675i
            o7.a7 r7 = r11.f20198i
            com.google.android.gms.measurement.internal.d r7 = r7.f5736a
            o7.c3 r7 = r7.f5722m
            java.lang.String r8 = r14.m8814x()
            java.lang.String r7 = r7.m11118f(r8)
            java.lang.String r8 = "User property has no value, property"
        L180:
            r6.m11170d(r8, r7)
        L183:
            o7.a7 r6 = r11.f20198i
            com.google.android.gms.measurement.internal.d r6 = r6.f5736a
            com.google.android.gms.measurement.internal.b r6 = r6.mo3162d()
            o7.f3 r6 = r6.f5680n
            if (r2 != 0) goto L192
            java.lang.String r7 = "null"
            goto L193
        L192:
            r7 = r2
        L193:
            java.lang.String r8 = "Property filter result"
            r6.m11170d(r8, r7)
            if (r2 != 0) goto L19b
            return r5
        L19b:
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
            r11.f20209c = r5
            if (r3 == 0) goto L1a9
            boolean r3 = r2.booleanValue()
            if (r3 == 0) goto L1a8
            goto L1a9
        L1a8:
            return r4
        L1a9:
            if (r15 == 0) goto L1b5
            java.lang.Object r15 = r11.f20197h
            k7.a2 r15 = (p185k7.C3727a2) r15
            boolean r15 = r15.m8193y()
            if (r15 == 0) goto L1b7
        L1b5:
            r11.f20210d = r2
        L1b7:
            boolean r15 = r2.booleanValue()
            if (r15 == 0) goto L202
            if (r1 == 0) goto L202
            boolean r15 = r14.m8809J()
            if (r15 == 0) goto L202
            long r14 = r14.m8813u()
            if (r12 == 0) goto L1cf
            long r14 = r12.longValue()
        L1cf:
            if (r0 == 0) goto L1eb
            java.lang.Object r12 = r11.f20197h
            k7.a2 r12 = (p185k7.C3727a2) r12
            boolean r12 = r12.m8193y()
            if (r12 == 0) goto L1eb
            java.lang.Object r12 = r11.f20197h
            k7.a2 r12 = (p185k7.C3727a2) r12
            boolean r12 = r12.m8194z()
            if (r12 != 0) goto L1eb
            if (r13 == 0) goto L1eb
            long r14 = r13.longValue()
        L1eb:
            java.lang.Object r12 = r11.f20197h
            k7.a2 r12 = (p185k7.C3727a2) r12
            boolean r12 = r12.m8194z()
            if (r12 == 0) goto L1fc
            java.lang.Long r12 = java.lang.Long.valueOf(r14)
            r11.f20212f = r12
            goto L202
        L1fc:
            java.lang.Long r12 = java.lang.Long.valueOf(r14)
            r11.f20211e = r12
        L202:
            return r4
    }
}
