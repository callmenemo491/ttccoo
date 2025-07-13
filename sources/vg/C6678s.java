package vg;

/* renamed from: vg.s */
/* loaded from: classes.dex */
public final class C6678s {

    /* renamed from: a */
    public gb.C2313c f25948a;

    public C6678s(boolean r4) {
            r3 = this;
            r3.<init>()
            o9.d r0 = p251o9.C5180d.m11494c()
            java.lang.Class<gb.l> r1 = gb.C2322l.class
            r0.m11497a()
            y9.i r0 = r0.f20315d
            java.lang.Object r0 = r0.mo14246a(r1)
            gb.l r0 = (gb.C2322l) r0
            gb.c r0 = r0.m6081c()
            java.lang.String r1 = "FirebaseRemoteConfig.getInstance()"
            p214m2.C4339q.m9703h(r0, r1)
            r3.f25948a = r0
            if (r4 == 0) goto L41
            gb.h$b r4 = new gb.h$b
            r4.<init>()
            java.lang.String r0 = "$this$remoteConfigSettings"
            p214m2.C4339q.m9706k(r4, r0)
            r0 = 900(0x384, double:4.447E-321)
            r4.f10547a = r0
            gb.h r0 = new gb.h
            r1 = 0
            r0.<init>(r4, r1)
            gb.c r4 = r3.f25948a
            java.util.concurrent.Executor r1 = r4.f10536b
            gb.a r2 = new gb.a
            r2.<init>(r4, r0)
            p327s7.C5988l.m12462c(r1, r2)
        L41:
            return
    }

    public /* synthetic */ C6678s(boolean r1, int r2) {
            r0 = this;
            r2 = r2 & 1
            if (r2 == 0) goto L5
            r1 = 0
        L5:
            r0.<init>(r1)
            return
    }
}
