package p072e7;

/* renamed from: e7.l */
/* loaded from: classes.dex */
public final class C1662l {

    /* renamed from: a */
    public final p335t3.InterfaceC6153f<p072e7.C1798z2> f7680a;

    /* renamed from: b */
    public final java.lang.String f7681b;

    /* renamed from: c */
    public final int f7682c;

    public C1662l(android.content.SharedPreferences r2, p335t3.InterfaceC6153f<p072e7.C1798z2> r3, long r4) {
            r1 = this;
            r1.<init>()
            r1.f7680a = r3
            java.lang.String r3 = "client_sender_id"
            r0 = 0
            java.lang.String r0 = r2.getString(r3, r0)
            if (r0 != 0) goto L21
            java.util.UUID r0 = java.util.UUID.randomUUID()
            java.lang.String r0 = r0.toString()
            android.content.SharedPreferences$Editor r2 = r2.edit()
            android.content.SharedPreferences$Editor r2 = r2.putString(r3, r0)
            r2.apply()
        L21:
            r1.f7681b = r0
            r2 = 0
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 != 0) goto L2b
            r2 = 1
            goto L2c
        L2b:
            r2 = 2
        L2c:
            r1.f7682c = r2
            return
    }

    @org.checkerframework.dataflow.qual.Pure
    /* renamed from: a */
    public final void m4321a(p072e7.C1798z2 r3, int r4) {
            r2 = this;
            e7.y2 r3 = p072e7.C1798z2.m4501n(r3)
            java.lang.String r0 = r2.f7681b
            boolean r1 = r3.f7817a0
            if (r1 == 0) goto L10
            r3.m4461e()
            r1 = 0
            r3.f7817a0 = r1
        L10:
            MessageType extends e7.x5<MessageType, BuilderType> r1 = r3.f7816Z
            e7.z2 r1 = (p072e7.C1798z2) r1
            p072e7.C1798z2.m4509w(r1, r0)
            e7.x5 r3 = r3.m4459c()
            e7.z2 r3 = (p072e7.C1798z2) r3
            int r0 = r2.f7682c
            int r0 = r0 + (-1)
            int r4 = r4 + (-1)
            if (r0 == 0) goto L31
            t3.a r0 = new t3.a
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            t3.d r1 = p335t3.EnumC6151d.f23742Y
            r0.<init>(r4, r3, r1)
            goto L3c
        L31:
            t3.a r0 = new t3.a
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            t3.d r1 = p335t3.EnumC6151d.f23743Z
            r0.<init>(r4, r3, r1)
        L3c:
            t3.f<e7.z2> r3 = r2.f7680a
            w3.k r3 = (p385w3.C6789k) r3
            androidx.room.a r4 = androidx.room.C0618a.f3651a0
            r3.m13809a(r0, r4)
            return
    }
}
