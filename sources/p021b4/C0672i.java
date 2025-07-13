package p021b4;

/* renamed from: b4.i */
/* loaded from: classes.dex */
public final /* synthetic */ class C0672i implements p021b4.C0674k.b {

    /* renamed from: Y */
    public final /* synthetic */ int f3838Y;

    /* renamed from: Z */
    public final /* synthetic */ p021b4.C0674k f3839Z;

    /* renamed from: a0 */
    public final /* synthetic */ p385w3.AbstractC6787i f3840a0;

    public /* synthetic */ C0672i(p021b4.C0674k r1, p385w3.AbstractC6787i r2, int r3) {
            r0 = this;
            r0.f3838Y = r3
            r0.<init>()
            r0.f3839Z = r1
            r0.f3840a0 = r2
            return
    }

    @Override // p021b4.C0674k.b
    public final java.lang.Object apply(java.lang.Object r15) {
            r14 = this;
            int r0 = r14.f3838Y
            r1 = 1
            r2 = 0
            switch(r0) {
                case 0: goto L8;
                default: goto L7;
            }
        L7:
            goto L32
        L8:
            b4.k r0 = r14.f3839Z
            w3.i r3 = r14.f3840a0
            android.database.sqlite.SQLiteDatabase r15 = (android.database.sqlite.SQLiteDatabase) r15
            java.lang.Long r15 = r0.m2237i(r15, r3)
            if (r15 != 0) goto L17
            java.lang.Boolean r15 = java.lang.Boolean.FALSE
            goto L31
        L17:
            android.database.sqlite.SQLiteDatabase r0 = r0.m2236h()
            java.lang.String[] r1 = new java.lang.String[r1]
            java.lang.String r15 = r15.toString()
            r1[r2] = r15
            java.lang.String r15 = "SELECT 1 FROM events WHERE context_id = ? LIMIT 1"
            android.database.Cursor r15 = r0.rawQuery(r15, r1)
            k1.d r0 = p179k1.C3646d.f16114c0
            java.lang.Object r15 = p021b4.C0674k.m2234L(r15, r0)
            java.lang.Boolean r15 = (java.lang.Boolean) r15
        L31:
            return r15
        L32:
            b4.k r0 = r14.f3839Z
            w3.i r3 = r14.f3840a0
            android.database.sqlite.SQLiteDatabase r15 = (android.database.sqlite.SQLiteDatabase) r15
            java.util.Objects.requireNonNull(r0)
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            java.lang.Long r4 = r0.m2237i(r15, r3)
            if (r4 != 0) goto L47
            goto L81
        L47:
            java.lang.String r5 = "_id"
            java.lang.String r6 = "transport_name"
            java.lang.String r7 = "timestamp_ms"
            java.lang.String r8 = "uptime_ms"
            java.lang.String r9 = "payload_encoding"
            java.lang.String r10 = "payload"
            java.lang.String r11 = "code"
            java.lang.String r12 = "inline"
            java.lang.String[] r6 = new java.lang.String[]{r5, r6, r7, r8, r9, r10, r11, r12}
            java.lang.String[] r8 = new java.lang.String[r1]
            java.lang.String r1 = r4.toString()
            r8[r2] = r1
            r9 = 0
            r10 = 0
            r11 = 0
            b4.d r1 = r0.f3847b0
            int r1 = r1.mo2218c()
            java.lang.String r12 = java.lang.String.valueOf(r1)
            java.lang.String r5 = "events"
            java.lang.String r7 = "context_id = ?"
            r4 = r15
            android.database.Cursor r1 = r4.query(r5, r6, r7, r8, r9, r10, r11, r12)
            z3.a r4 = new z3.a
            r4.<init>(r0, r13, r3)
            p021b4.C0674k.m2234L(r1, r4)
        L81:
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "event_id IN ("
            r1.<init>(r3)
        L8d:
            int r3 = r13.size()
            if (r2 >= r3) goto Lb0
            java.lang.Object r3 = r13.get(r2)
            b4.h r3 = (p021b4.AbstractC0671h) r3
            long r3 = r3.mo2222b()
            r1.append(r3)
            int r3 = r13.size()
            int r3 = r3 + (-1)
            if (r2 >= r3) goto Lad
            r3 = 44
            r1.append(r3)
        Lad:
            int r2 = r2 + 1
            goto L8d
        Lb0:
            r2 = 41
            r1.append(r2)
            java.lang.String r2 = "event_id"
            java.lang.String r3 = "name"
            java.lang.String r4 = "value"
            java.lang.String[] r6 = new java.lang.String[]{r2, r3, r4}
            java.lang.String r7 = r1.toString()
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            java.lang.String r5 = "event_metadata"
            r4 = r15
            android.database.Cursor r15 = r4.query(r5, r6, r7, r8, r9, r10, r11)
            u3.b r1 = new u3.b
            r1.<init>(r0)
            p021b4.C0674k.m2234L(r15, r1)
            java.util.ListIterator r15 = r13.listIterator()
        Lda:
            boolean r1 = r15.hasNext()
            if (r1 == 0) goto L138
            java.lang.Object r1 = r15.next()
            b4.h r1 = (p021b4.AbstractC0671h) r1
            long r2 = r1.mo2222b()
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            boolean r2 = r0.containsKey(r2)
            if (r2 != 0) goto Lf5
            goto Lda
        Lf5:
            w3.f r2 = r1.mo2221a()
            w3.f$a r2 = r2.m13806i()
            long r3 = r1.mo2222b()
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            java.lang.Object r3 = r0.get(r3)
            java.util.Set r3 = (java.util.Set) r3
            java.util.Iterator r3 = r3.iterator()
        L10f:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L123
            java.lang.Object r4 = r3.next()
            b4.k$c r4 = (p021b4.C0674k.c) r4
            java.lang.String r5 = r4.f3848a
            java.lang.String r4 = r4.f3849b
            r2.m13807a(r5, r4)
            goto L10f
        L123:
            long r3 = r1.mo2222b()
            w3.i r1 = r1.mo2223c()
            w3.f r2 = r2.mo13792b()
            b4.b r5 = new b4.b
            r5.<init>(r3, r1, r2)
            r15.set(r5)
            goto Lda
        L138:
            return r13
    }
}
