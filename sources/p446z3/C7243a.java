package p446z3;

/* renamed from: z3.a */
/* loaded from: classes.dex */
public final /* synthetic */ class C7243a implements p034c4.InterfaceC0867b.a, p021b4.C0674k.b, p371v5.C6564n.a, p327s7.InterfaceC5977a {

    /* renamed from: Y */
    public final /* synthetic */ int f27837Y;

    /* renamed from: Z */
    public final /* synthetic */ java.lang.Object f27838Z;

    /* renamed from: a0 */
    public final /* synthetic */ java.lang.Object f27839a0;

    /* renamed from: b0 */
    public final /* synthetic */ java.lang.Object f27840b0;

    public /* synthetic */ C7243a(p021b4.C0674k r2, java.util.List r3, p385w3.AbstractC6787i r4) {
            r1 = this;
            r0 = 2
            r1.f27837Y = r0
            r1.<init>()
            r1.f27838Z = r2
            r1.f27840b0 = r3
            r1.f27839a0 = r4
            return
    }

    public /* synthetic */ C7243a(p021b4.C0674k r2, p385w3.AbstractC6787i r3, p385w3.AbstractC6784f r4) {
            r1 = this;
            r0 = 1
            r1.f27837Y = r0
            r1.<init>()
            r1.f27838Z = r2
            r1.f27839a0 = r3
            r1.f27840b0 = r4
            return
    }

    public /* synthetic */ C7243a(p107g4.InterfaceC2255q.a r2, p108g5.C2273i0 r3, p325s5.C5970j r4) {
            r1 = this;
            r0 = 3
            r1.f27837Y = r0
            r1.<init>()
            r1.f27838Z = r2
            r1.f27839a0 = r3
            r1.f27840b0 = r4
            return
    }

    public /* synthetic */ C7243a(gb.C2313c r2, p327s7.AbstractC5985i r3, p327s7.AbstractC5985i r4) {
            r1 = this;
            r0 = 4
            r1.f27837Y = r0
            r1.<init>()
            r1.f27838Z = r2
            r1.f27839a0 = r3
            r1.f27840b0 = r4
            return
    }

    public /* synthetic */ C7243a(p446z3.C7244b r2, p385w3.AbstractC6787i r3, p385w3.AbstractC6784f r4) {
            r1 = this;
            r0 = 0
            r1.f27837Y = r0
            r1.<init>()
            r1.f27838Z = r2
            r1.f27839a0 = r3
            r1.f27840b0 = r4
            return
    }

    @Override // p021b4.C0674k.b
    public java.lang.Object apply(java.lang.Object r24) {
            r23 = this;
            r0 = r23
            int r1 = r0.f27837Y
            r2 = 0
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            r4 = 1
            java.lang.String r5 = "bytes"
            r6 = 0
            switch(r1) {
                case 1: goto L12;
                default: goto L10;
            }
        L10:
            goto L1a0
        L12:
            java.lang.Object r1 = r0.f27838Z
            b4.k r1 = (p021b4.C0674k) r1
            java.lang.Object r7 = r0.f27839a0
            w3.i r7 = (p385w3.AbstractC6787i) r7
            java.lang.Object r8 = r0.f27840b0
            w3.f r8 = (p385w3.AbstractC6784f) r8
            r9 = r24
            android.database.sqlite.SQLiteDatabase r9 = (android.database.sqlite.SQLiteDatabase) r9
            t3.b r10 = p021b4.C0674k.f3843c0
            android.database.sqlite.SQLiteDatabase r10 = r1.m2236h()
            java.lang.String r11 = "PRAGMA page_count"
            android.database.sqlite.SQLiteStatement r10 = r10.compileStatement(r11)
            long r10 = r10.simpleQueryForLong()
            android.database.sqlite.SQLiteDatabase r12 = r1.m2236h()
            java.lang.String r13 = "PRAGMA page_size"
            android.database.sqlite.SQLiteStatement r12 = r12.compileStatement(r13)
            long r12 = r12.simpleQueryForLong()
            long r12 = r12 * r10
            b4.d r10 = r1.f3847b0
            long r10 = r10.mo2220e()
            int r14 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r14 < 0) goto L4e
            r10 = 1
            goto L4f
        L4e:
            r10 = 0
        L4f:
            if (r10 == 0) goto L59
            r1 = -1
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            goto L19f
        L59:
            java.lang.Long r10 = r1.m2237i(r9, r7)
            if (r10 == 0) goto L64
            long r10 = r10.longValue()
            goto La1
        L64:
            android.content.ContentValues r10 = new android.content.ContentValues
            r10.<init>()
            java.lang.String r11 = r7.mo13798b()
            java.lang.String r12 = "backend_name"
            r10.put(r12, r11)
            t3.d r11 = r7.mo13800d()
            int r11 = p069e4.C1515a.m4103a(r11)
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            java.lang.String r12 = "priority"
            r10.put(r12, r11)
            java.lang.String r11 = "next_request_ms"
            r10.put(r11, r3)
            byte[] r11 = r7.mo13799c()
            if (r11 == 0) goto L9b
            byte[] r7 = r7.mo13799c()
            java.lang.String r7 = android.util.Base64.encodeToString(r7, r2)
            java.lang.String r11 = "extras"
            r10.put(r11, r7)
        L9b:
            java.lang.String r7 = "transport_contexts"
            long r10 = r9.insert(r7, r6, r10)
        La1:
            b4.d r1 = r1.f3847b0
            int r1 = r1.mo2219d()
            w3.e r7 = r8.mo13788d()
            byte[] r7 = r7.f26330b
            int r12 = r7.length
            if (r12 > r1) goto Lb2
            r12 = 1
            goto Lb3
        Lb2:
            r12 = 0
        Lb3:
            android.content.ContentValues r13 = new android.content.ContentValues
            r13.<init>()
            java.lang.Long r10 = java.lang.Long.valueOf(r10)
            java.lang.String r11 = "context_id"
            r13.put(r11, r10)
            java.lang.String r10 = r8.mo13790g()
            java.lang.String r11 = "transport_name"
            r13.put(r11, r10)
            long r10 = r8.mo13789e()
            java.lang.Long r10 = java.lang.Long.valueOf(r10)
            java.lang.String r11 = "timestamp_ms"
            r13.put(r11, r10)
            long r10 = r8.mo13791h()
            java.lang.Long r10 = java.lang.Long.valueOf(r10)
            java.lang.String r11 = "uptime_ms"
            r13.put(r11, r10)
            w3.e r10 = r8.mo13788d()
            t3.b r10 = r10.f26329a
            java.lang.String r10 = r10.f23741a
            java.lang.String r11 = "payload_encoding"
            r13.put(r11, r10)
            java.lang.Integer r10 = r8.mo13787c()
            java.lang.String r11 = "code"
            r13.put(r11, r10)
            java.lang.String r10 = "num_attempts"
            r13.put(r10, r3)
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r12)
            java.lang.String r10 = "inline"
            r13.put(r10, r3)
            if (r12 == 0) goto L10c
            r2 = r7
            goto L10e
        L10c:
            byte[] r2 = new byte[r2]
        L10e:
            java.lang.String r3 = "payload"
            r13.put(r3, r2)
            java.lang.String r2 = "events"
            long r2 = r9.insert(r2, r6, r13)
            java.lang.String r10 = "event_id"
            if (r12 != 0) goto L157
            int r11 = r7.length
            double r11 = (double) r11
            double r13 = (double) r1
            double r11 = r11 / r13
            double r11 = java.lang.Math.ceil(r11)
            int r11 = (int) r11
        L126:
            if (r4 > r11) goto L157
            int r12 = r4 + (-1)
            int r12 = r12 * r1
            int r13 = r4 * r1
            int r14 = r7.length
            int r13 = java.lang.Math.min(r13, r14)
            byte[] r12 = java.util.Arrays.copyOfRange(r7, r12, r13)
            android.content.ContentValues r13 = new android.content.ContentValues
            r13.<init>()
            java.lang.Long r14 = java.lang.Long.valueOf(r2)
            r13.put(r10, r14)
            java.lang.Integer r14 = java.lang.Integer.valueOf(r4)
            java.lang.String r15 = "sequence_num"
            r13.put(r15, r14)
            r13.put(r5, r12)
            java.lang.String r12 = "event_payloads"
            r9.insert(r12, r6, r13)
            int r4 = r4 + 1
            goto L126
        L157:
            java.util.Map r1 = r8.mo13786b()
            java.util.Map r1 = java.util.Collections.unmodifiableMap(r1)
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L167:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L19b
            java.lang.Object r4 = r1.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            android.content.ContentValues r5 = new android.content.ContentValues
            r5.<init>()
            java.lang.Long r7 = java.lang.Long.valueOf(r2)
            r5.put(r10, r7)
            java.lang.Object r7 = r4.getKey()
            java.lang.String r7 = (java.lang.String) r7
            java.lang.String r8 = "name"
            r5.put(r8, r7)
            java.lang.Object r4 = r4.getValue()
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r7 = "value"
            r5.put(r7, r4)
            java.lang.String r4 = "event_metadata"
            r9.insert(r4, r6, r5)
            goto L167
        L19b:
            java.lang.Long r1 = java.lang.Long.valueOf(r2)
        L19f:
            return r1
        L1a0:
            java.lang.Object r1 = r0.f27838Z
            b4.k r1 = (p021b4.C0674k) r1
            java.lang.Object r3 = r0.f27840b0
            java.util.List r3 = (java.util.List) r3
            java.lang.Object r7 = r0.f27839a0
            w3.i r7 = (p385w3.AbstractC6787i) r7
            r8 = r24
            android.database.Cursor r8 = (android.database.Cursor) r8
            t3.b r9 = p021b4.C0674k.f3843c0
            java.util.Objects.requireNonNull(r1)
        L1b5:
            boolean r9 = r8.moveToNext()
            if (r9 == 0) goto L26d
            long r9 = r8.getLong(r2)
            r11 = 7
            int r11 = r8.getInt(r11)
            if (r11 == 0) goto L1c8
            r11 = 1
            goto L1c9
        L1c8:
            r11 = 0
        L1c9:
            w3.a$b r12 = new w3.a$b
            r12.<init>()
            java.util.HashMap r13 = new java.util.HashMap
            r13.<init>()
            r12.f26317f = r13
            java.lang.String r13 = r8.getString(r4)
            r12.m13796f(r13)
            r13 = 2
            long r13 = r8.getLong(r13)
            r12.m13795e(r13)
            r13 = 3
            long r13 = r8.getLong(r13)
            r12.m13797g(r13)
            r13 = 4
            if (r11 == 0) goto L209
            w3.e r11 = new w3.e
            java.lang.String r13 = r8.getString(r13)
            if (r13 != 0) goto L1fa
            t3.b r13 = p021b4.C0674k.f3843c0
            goto L200
        L1fa:
            t3.b r14 = new t3.b
            r14.<init>(r13)
            r13 = r14
        L200:
            r14 = 5
            byte[] r14 = r8.getBlob(r14)
            r11.<init>(r13, r14)
            goto L24b
        L209:
            w3.e r11 = new w3.e
            java.lang.String r13 = r8.getString(r13)
            if (r13 != 0) goto L214
            t3.b r13 = p021b4.C0674k.f3843c0
            goto L21a
        L214:
            t3.b r14 = new t3.b
            r14.<init>(r13)
            r13 = r14
        L21a:
            android.database.sqlite.SQLiteDatabase r14 = r1.m2236h()
            java.lang.String[] r16 = new java.lang.String[]{r5}
            java.lang.String[] r15 = new java.lang.String[r4]
            java.lang.String r17 = java.lang.String.valueOf(r9)
            r15[r2] = r17
            r19 = 0
            r20 = 0
            java.lang.String r17 = "event_payloads"
            java.lang.String r18 = "event_id = ?"
            java.lang.String r21 = "sequence_num"
            r22 = r15
            r15 = r17
            r17 = r18
            r18 = r22
            android.database.Cursor r14 = r14.query(r15, r16, r17, r18, r19, r20, r21)
            k1.c r15 = p179k1.C3644c.f16081c0
            java.lang.Object r14 = p021b4.C0674k.m2234L(r14, r15)
            byte[] r14 = (byte[]) r14
            r11.<init>(r13, r14)
        L24b:
            r12.m13794d(r11)
            r11 = 6
            boolean r13 = r8.isNull(r11)
            if (r13 != 0) goto L25f
            int r11 = r8.getInt(r11)
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r12.f26313b = r11
        L25f:
            w3.f r11 = r12.mo13792b()
            b4.b r12 = new b4.b
            r12.<init>(r9, r7, r11)
            r3.add(r12)
            goto L1b5
        L26d:
            return r6
    }

    @Override // p371v5.C6564n.a
    /* renamed from: b */
    public void mo24b(java.lang.Object r2) {
            r1 = this;
            java.lang.Object r0 = r1.f27838Z
            g4.q$a r0 = (p107g4.InterfaceC2255q.a) r0
            java.lang.Object r0 = r1.f27839a0
            g5.i0 r0 = (p108g5.C2273i0) r0
            java.lang.Object r0 = r1.f27840b0
            s5.j r0 = (p325s5.C5970j) r0
            g4.q r2 = (p107g4.InterfaceC2255q) r2
            r2.m5906j0()
            return
    }

    @Override // p327s7.InterfaceC5977a
    /* renamed from: g */
    public java.lang.Object mo816g(p327s7.AbstractC5985i r5) {
            r4 = this;
            java.lang.Object r5 = r4.f27838Z
            gb.c r5 = (gb.C2313c) r5
            java.lang.Object r0 = r4.f27839a0
            s7.i r0 = (p327s7.AbstractC5985i) r0
            java.lang.Object r1 = r4.f27840b0
            s7.i r1 = (p327s7.AbstractC5985i) r1
            java.util.Objects.requireNonNull(r5)
            boolean r2 = r0.mo12455m()
            if (r2 == 0) goto L54
            java.lang.Object r2 = r0.mo12451i()
            if (r2 != 0) goto L1c
            goto L54
        L1c:
            java.lang.Object r0 = r0.mo12451i()
            hb.d r0 = (p128hb.C2999d) r0
            boolean r2 = r1.mo12455m()
            r3 = 1
            if (r2 == 0) goto L42
            java.lang.Object r1 = r1.mo12451i()
            hb.d r1 = (p128hb.C2999d) r1
            if (r1 == 0) goto L3e
            java.util.Date r2 = r0.f12102c
            java.util.Date r1 = r1.f12102c
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto L3c
            goto L3e
        L3c:
            r1 = 0
            goto L3f
        L3e:
            r1 = 1
        L3f:
            if (r1 != 0) goto L42
            goto L54
        L42:
            hb.c r1 = r5.f10538d
            s7.i r0 = r1.m7371c(r0)
            java.util.concurrent.Executor r1 = r5.f10536b
            gb.b r2 = new gb.b
            r2.<init>(r5, r3)
            s7.i r5 = r0.mo12447e(r1, r2)
            goto L5a
        L54:
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            s7.i r5 = p327s7.C5988l.m12464e(r5)
        L5a:
            return r5
    }

    @Override // p034c4.InterfaceC0867b.a
    /* renamed from: h */
    public java.lang.Object mo23h() {
            r4 = this;
            java.lang.Object r0 = r4.f27838Z
            z3.b r0 = (p446z3.C7244b) r0
            java.lang.Object r1 = r4.f27839a0
            w3.i r1 = (p385w3.AbstractC6787i) r1
            java.lang.Object r2 = r4.f27840b0
            w3.f r2 = (p385w3.AbstractC6784f) r2
            b4.c r3 = r0.f27845d
            r3.mo2227a0(r1, r2)
            a4.l r0 = r0.f27842a
            r2 = 1
            r0.mo22b(r1, r2)
            r0 = 0
            return r0
    }
}
