package p359ud;

/* renamed from: ud.c */
/* loaded from: classes.dex */
public final class C6380c extends p239nh.AbstractC4830j implements mh.InterfaceC4609a<ch.C0985l> {

    /* renamed from: Z */
    public final /* synthetic */ p359ud.C6379b f24869Z;

    /* renamed from: a0 */
    public final /* synthetic */ id.C3130a f24870a0;

    public C6380c(p359ud.C6379b r1, id.C3130a r2) {
            r0 = this;
            r0.f24869Z = r1
            r0.f24870a0 = r2
            r1 = 0
            r0.<init>(r1)
            return
    }

    @Override // mh.InterfaceC4609a
    /* renamed from: e */
    public ch.C0985l mo15e() {
            r4 = this;
            ud.b r0 = r4.f24869Z
            int r1 = p359ud.C6379b.f24858o1
            ud.q r0 = r0.m13022O0()
            id.a r1 = r4.f24870a0
            java.util.Objects.requireNonNull(r0)
            java.lang.String r2 = "contact"
            p214m2.C4339q.m9706k(r1, r2)
            hd.a r2 = p130hd.C3025a.f12173b
            hd.a r2 = p130hd.C3025a.m7433a()
            java.util.concurrent.Executor r2 = r2.f12176a
            a4.c r3 = new a4.c
            r3.<init>(r0, r1)
            r2.execute(r3)
            ch.l r0 = ch.C0985l.f5061a
            return r0
    }
}
