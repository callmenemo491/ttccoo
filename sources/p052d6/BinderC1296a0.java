package p052d6;

/* renamed from: d6.a0 */
/* loaded from: classes.dex */
public final class BinderC1296a0 extends p072e7.BinderC1622h {

    /* renamed from: a */
    public final /* synthetic */ p052d6.AbstractC1309h f6816a;

    public BinderC1296a0(p052d6.AbstractC1309h r1) {
            r0 = this;
            r0.f6816a = r1
            java.lang.String r1 = "com.google.android.gms.cast.framework.ISessionProvider"
            r0.<init>(r1)
            return
    }

    @Override // p072e7.BinderC1622h
    /* renamed from: v */
    public final boolean mo3764v(int r1, android.os.Parcel r2, android.os.Parcel r3, int r4) {
            r0 = this;
            r4 = 1
            if (r1 == r4) goto L32
            r2 = 2
            if (r1 == r2) goto L23
            r2 = 3
            if (r1 == r2) goto L18
            r2 = 4
            if (r1 == r2) goto Le
            r4 = 0
            goto L4a
        Le:
            r3.writeNoException()
            r1 = 12451000(0xbdfcb8, float:1.7447567E-38)
            r3.writeInt(r1)
            goto L4a
        L18:
            d6.h r1 = r0.f6816a
            java.lang.String r1 = r1.f6841b
            r3.writeNoException()
            r3.writeString(r1)
            goto L4a
        L23:
            d6.h r1 = r0.f6816a
            boolean r1 = r1.mo3798b()
            r3.writeNoException()
            int r2 = p072e7.C1632i.f7582a
            r3.writeInt(r1)
            goto L4a
        L32:
            java.lang.String r1 = r2.readString()
            d6.h r2 = r0.f6816a
            d6.e r1 = r2.mo3797a(r1)
            if (r1 != 0) goto L40
            r1 = 0
            goto L44
        L40:
            x6.a r1 = r1.m3767i()
        L44:
            r3.writeNoException()
            p072e7.C1632i.m4227d(r3, r1)
        L4a:
            return r4
    }
}
