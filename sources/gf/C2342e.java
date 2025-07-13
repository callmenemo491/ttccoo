package gf;

/* renamed from: gf.e */
/* loaded from: classes.dex */
public final class C2342e extends p239nh.AbstractC4830j implements mh.InterfaceC4609a<ch.C0985l> {

    /* renamed from: Z */
    public final /* synthetic */ gf.C2341d f10638Z;

    public C2342e(gf.C2341d r1) {
            r0 = this;
            r0.f10638Z = r1
            r1 = 0
            r0.<init>(r1)
            return
    }

    @Override // mh.InterfaceC4609a
    /* renamed from: e */
    public ch.C0985l mo15e() {
            r4 = this;
            gf.d r0 = r4.f10638Z
            int r1 = gf.C2341d.f10626o1
            gf.h r0 = r0.m6093P0()
            nd.j1 r1 = r0.f10647d
            android.content.SharedPreferences r1 = r1.m10820a()
            android.content.SharedPreferences$Editor r1 = r1.edit()
            r2 = 0
            java.lang.String r3 = "emailColonize"
            android.content.SharedPreferences$Editor r1 = r1.putString(r3, r2)
            r1.apply()
            nd.j1 r1 = r0.f10647d
            android.content.SharedPreferences r1 = r1.m10820a()
            android.content.SharedPreferences$Editor r1 = r1.edit()
            java.lang.String r3 = "passwordColonize"
            android.content.SharedPreferences$Editor r1 = r1.putString(r3, r2)
            r1.apply()
            androidx.lifecycle.d0<vg.b<ch.l>> r0 = r0.f10656m
            vg.b r1 = new vg.b
            ch.l r2 = ch.C0985l.f5061a
            r1.<init>(r2)
            r0.mo7l(r1)
            return r2
    }
}
