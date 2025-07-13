package androidx.lifecycle;

/* renamed from: androidx.lifecycle.a */
/* loaded from: classes.dex */
public abstract class AbstractC0430a extends androidx.lifecycle.AbstractC0463q0 {

    /* renamed from: a */
    public final androidx.savedstate.C0620a f2463a;

    /* renamed from: b */
    public final androidx.lifecycle.AbstractC0458o f2464b;

    /* renamed from: c */
    public final android.os.Bundle f2465c;

    public AbstractC0430a(androidx.savedstate.InterfaceC0622c r2, android.os.Bundle r3) {
            r1 = this;
            r1.<init>()
            androidx.savedstate.a r0 = r2.mo430f()
            r1.f2463a = r0
            androidx.lifecycle.o r2 = r2.mo428b()
            r1.f2464b = r2
            r1.f2465c = r3
            return
    }

    @Override // androidx.lifecycle.AbstractC0463q0, androidx.lifecycle.InterfaceC0461p0
    /* renamed from: a */
    public final <T extends androidx.lifecycle.AbstractC0457n0> T mo9a(java.lang.Class<T> r2) {
            r1 = this;
            java.lang.String r0 = r2.getCanonicalName()
            if (r0 == 0) goto Lb
            androidx.lifecycle.n0 r2 = r1.mo1426c(r0, r2)
            return r2
        Lb:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Local and anonymous classes can not be ViewModels"
            r2.<init>(r0)
            throw r2
    }

    @Override // androidx.lifecycle.C0465r0
    /* renamed from: b */
    public void mo1425b(androidx.lifecycle.AbstractC0457n0 r3) {
            r2 = this;
            androidx.savedstate.a r0 = r2.f2463a
            androidx.lifecycle.o r1 = r2.f2464b
            androidx.lifecycle.SavedStateHandleController.m1420h(r3, r0, r1)
            return
    }

    @Override // androidx.lifecycle.AbstractC0463q0
    /* renamed from: c */
    public final <T extends androidx.lifecycle.AbstractC0457n0> T mo1426c(java.lang.String r10, java.lang.Class<T> r11) {
            r9 = this;
            androidx.savedstate.a r0 = r9.f2463a
            androidx.lifecycle.o r1 = r9.f2464b
            android.os.Bundle r2 = r9.f2465c
            androidx.lifecycle.SavedStateHandleController r0 = androidx.lifecycle.SavedStateHandleController.m1421j(r0, r1, r10, r2)
            androidx.lifecycle.l0 r1 = r0.f2459a0
            r2 = r9
            vg.i r2 = (vg.C6668i) r2
            java.lang.String r3 = "key"
            p214m2.C4339q.m9706k(r10, r3)
            java.lang.String r10 = "handle"
            p214m2.C4339q.m9706k(r1, r10)
            java.lang.Class<sd.d> r10 = sd.C6034d.class
            boolean r10 = r11.isAssignableFrom(r10)
            if (r10 == 0) goto L2e
            sd.d r10 = new sd.d
            android.app.Application r11 = r2.f25923d
            nd.b0 r1 = r2.f25924e
            nd.j1 r2 = r2.f25927h
            r10.<init>(r11, r1, r2)
            goto L513
        L2e:
            java.lang.Class<ie.e> r10 = ie.C3136e.class
            boolean r10 = r11.isAssignableFrom(r10)
            if (r10 == 0) goto L43
            ie.e r10 = new ie.e
            android.app.Application r11 = r2.f25923d
            nd.b0 r1 = r2.f25924e
            nd.k1 r2 = r2.f25928i
            r10.<init>(r11, r1, r2)
            goto L513
        L43:
            java.lang.Class<ud.q> r10 = p359ud.C6394q.class
            boolean r10 = r11.isAssignableFrom(r10)
            if (r10 == 0) goto L56
            ud.q r10 = new ud.q
            nd.b0 r11 = r2.f25924e
            io.tacocrypto.app.database.AppDatabase r1 = r2.f25926g
            r10.<init>(r11, r1)
            goto L513
        L56:
            java.lang.Class<xd.b> r10 = p415xd.C7042b.class
            boolean r10 = r11.isAssignableFrom(r10)
            if (r10 == 0) goto L69
            xd.b r10 = new xd.b
            nd.b0 r11 = r2.f25924e
            io.tacocrypto.app.database.AppDatabase r1 = r2.f25926g
            r10.<init>(r11, r1)
            goto L513
        L69:
            java.lang.Class<de.l> r10 = de.C1442l.class
            boolean r10 = r11.isAssignableFrom(r10)
            if (r10 == 0) goto L80
            de.l r10 = new de.l
            android.app.Application r11 = r2.f25923d
            nd.b0 r1 = r2.f25924e
            nd.j1 r3 = r2.f25927h
            nd.k1 r2 = r2.f25928i
            r10.<init>(r11, r1, r3, r2)
            goto L513
        L80:
            java.lang.Class<fe.j> r10 = p098fe.C2149j.class
            boolean r10 = r11.isAssignableFrom(r10)
            if (r10 == 0) goto L9a
            fe.j r10 = new fe.j
            android.app.Application r4 = r2.f25923d
            nd.b0 r5 = r2.f25924e
            io.tacocrypto.app.database.AppDatabase r6 = r2.f25926g
            nd.j1 r7 = r2.f25927h
            nd.k1 r8 = r2.f25928i
            r3 = r10
            r3.<init>(r4, r5, r6, r7, r8)
            goto L513
        L9a:
            java.lang.Class<je.j> r10 = je.C3588j.class
            boolean r10 = r11.isAssignableFrom(r10)
            if (r10 == 0) goto Lab
            je.j r10 = new je.j
            nd.b0 r11 = r2.f25924e
            r10.<init>(r11)
            goto L513
        Lab:
            java.lang.Class<rg.f> r10 = p315rg.C5850f.class
            boolean r10 = r11.isAssignableFrom(r10)
            if (r10 == 0) goto Lbe
            rg.f r10 = new rg.f
            nd.b0 r11 = r2.f25924e
            io.tacocrypto.app.database.AppDatabase r1 = r2.f25926g
            r10.<init>(r11, r1)
            goto L513
        Lbe:
            java.lang.Class<ug.c> r10 = ug.C6454c.class
            boolean r10 = r11.isAssignableFrom(r10)
            if (r10 == 0) goto Ld1
            ug.c r10 = new ug.c
            nd.b0 r11 = r2.f25924e
            io.tacocrypto.app.database.AppDatabase r1 = r2.f25926g
            r10.<init>(r11, r1)
            goto L513
        Ld1:
            java.lang.Class<ke.g> r10 = ke.C4103g.class
            boolean r10 = r11.isAssignableFrom(r10)
            if (r10 == 0) goto Le2
            ke.g r10 = new ke.g
            nd.b0 r11 = r2.f25924e
            r10.<init>(r11)
            goto L513
        Le2:
            java.lang.Class<yd.f> r10 = p436yd.C7161f.class
            boolean r10 = r11.isAssignableFrom(r10)
            if (r10 == 0) goto L121
            android.app.Application r10 = r2.f25923d
            java.lang.String r11 = "context"
            p214m2.C4339q.m9706k(r10, r11)
            gd.a$a r11 = gd.C2326a.f10565h
            android.content.ComponentName r1 = new android.content.ComponentName
            java.lang.Class<io.tacocrypto.app.ui.tools.player.service.MyMusicService> r3 = io.tacocrypto.app.p156ui.tools.player.service.MyMusicService.class
            r1.<init>(r10, r3)
            gd.a r3 = gd.C2326a.f10566i
            if (r3 != 0) goto L10f
            monitor-enter(r11)
            gd.a r3 = gd.C2326a.f10566i     // Catch: java.lang.Throwable -> L10c
            if (r3 != 0) goto L10a
            gd.a r3 = new gd.a     // Catch: java.lang.Throwable -> L10c
            r3.<init>(r10, r1)     // Catch: java.lang.Throwable -> L10c
            gd.C2326a.f10566i = r3     // Catch: java.lang.Throwable -> L10c
        L10a:
            monitor-exit(r11)
            goto L10f
        L10c:
            r10 = move-exception
            monitor-exit(r11)
            throw r10
        L10f:
            r6 = r3
            yd.f r10 = new yd.f
            android.app.Application r11 = r2.f25923d
            nd.b0 r3 = r2.f25924e
            nd.u r4 = r2.f25925f
            nd.j1 r5 = r2.f25927h
            r1 = r10
            r2 = r11
            r1.<init>(r2, r3, r4, r5, r6)
            goto L513
        L121:
            java.lang.Class<vd.q> r10 = p377vd.C6648q.class
            boolean r10 = r11.isAssignableFrom(r10)
            if (r10 == 0) goto L134
            vd.q r10 = new vd.q
            android.app.Application r11 = r2.f25923d
            nd.b0 r1 = r2.f25924e
            r10.<init>(r11, r1)
            goto L513
        L134:
            java.lang.Class<wd.l> r10 = p395wd.C6843l.class
            boolean r10 = r11.isAssignableFrom(r10)
            if (r10 == 0) goto L147
            wd.l r10 = new wd.l
            android.app.Application r11 = r2.f25923d
            nd.b0 r1 = r2.f25924e
            r10.<init>(r11, r1)
            goto L513
        L147:
            java.lang.Class<gg.g> r10 = gg.C2369g.class
            boolean r10 = r11.isAssignableFrom(r10)
            if (r10 == 0) goto L15a
            gg.g r10 = new gg.g
            android.app.Application r11 = r2.f25923d
            nd.b0 r1 = r2.f25924e
            r10.<init>(r11, r1)
            goto L513
        L15a:
            java.lang.Class<af.e> r10 = af.C0085e.class
            boolean r10 = r11.isAssignableFrom(r10)
            if (r10 == 0) goto L16d
            af.e r10 = new af.e
            android.app.Application r11 = r2.f25923d
            nd.b0 r1 = r2.f25924e
            r10.<init>(r11, r1)
            goto L513
        L16d:
            java.lang.Class<ef.f> r10 = p078ef.C1835f.class
            boolean r10 = r11.isAssignableFrom(r10)
            if (r10 == 0) goto L180
            ef.f r10 = new ef.f
            android.app.Application r11 = r2.f25923d
            nd.b0 r1 = r2.f25924e
            r10.<init>(r11, r1)
            goto L513
        L180:
            java.lang.Class<ge.j> r10 = ge.C2337j.class
            boolean r10 = r11.isAssignableFrom(r10)
            if (r10 == 0) goto L193
            ge.j r10 = new ge.j
            nd.b0 r11 = r2.f25924e
            io.tacocrypto.app.database.AppDatabase r1 = r2.f25926g
            r10.<init>(r11, r1)
            goto L513
        L193:
            java.lang.Class<pe.m> r10 = pe.C5491m.class
            boolean r10 = r11.isAssignableFrom(r10)
            if (r10 == 0) goto L1a6
            pe.m r10 = new pe.m
            android.app.Application r11 = r2.f25923d
            nd.b0 r1 = r2.f25924e
            r10.<init>(r11, r1)
            goto L513
        L1a6:
            java.lang.Class<df.g> r10 = p060df.C1451g.class
            boolean r10 = r11.isAssignableFrom(r10)
            if (r10 == 0) goto L1b9
            df.g r10 = new df.g
            android.app.Application r11 = r2.f25923d
            nd.b0 r1 = r2.f25924e
            r10.<init>(r11, r1)
            goto L513
        L1b9:
            java.lang.Class<ag.k> r10 = ag.C0098k.class
            boolean r10 = r11.isAssignableFrom(r10)
            if (r10 == 0) goto L1cc
            ag.k r10 = new ag.k
            android.app.Application r11 = r2.f25923d
            nd.b0 r1 = r2.f25924e
            r10.<init>(r11, r1)
            goto L513
        L1cc:
            java.lang.Class<bg.k> r10 = bg.C0767k.class
            boolean r10 = r11.isAssignableFrom(r10)
            if (r10 == 0) goto L1df
            bg.k r10 = new bg.k
            android.app.Application r11 = r2.f25923d
            nd.b0 r1 = r2.f25924e
            r10.<init>(r11, r1)
            goto L513
        L1df:
            java.lang.Class<rf.l> r10 = p314rf.C5844l.class
            boolean r10 = r11.isAssignableFrom(r10)
            if (r10 == 0) goto L1f2
            rf.l r10 = new rf.l
            android.app.Application r11 = r2.f25923d
            nd.b0 r1 = r2.f25924e
            r10.<init>(r11, r1)
            goto L513
        L1f2:
            java.lang.Class<ff.g> r10 = p099ff.C2161g.class
            boolean r10 = r11.isAssignableFrom(r10)
            if (r10 == 0) goto L205
            ff.g r10 = new ff.g
            android.app.Application r11 = r2.f25923d
            nd.b0 r1 = r2.f25924e
            r10.<init>(r11, r1)
            goto L513
        L205:
            java.lang.Class<og.d> r10 = p258og.C5267d.class
            boolean r10 = r11.isAssignableFrom(r10)
            if (r10 == 0) goto L218
            og.d r10 = new og.d
            android.app.Application r11 = r2.f25923d
            nd.b0 r1 = r2.f25924e
            r10.<init>(r11, r1)
            goto L513
        L218:
            java.lang.Class<he.a> r10 = p131he.C3030a.class
            boolean r10 = r11.isAssignableFrom(r10)
            if (r10 == 0) goto L22d
            he.a r10 = new he.a
            android.app.Application r11 = r2.f25923d
            nd.b0 r1 = r2.f25924e
            io.tacocrypto.app.database.AppDatabase r2 = r2.f25926g
            r10.<init>(r11, r1, r2)
            goto L513
        L22d:
            java.lang.Class<wf.k> r10 = wf.C6864k.class
            boolean r10 = r11.isAssignableFrom(r10)
            if (r10 == 0) goto L240
            wf.k r10 = new wf.k
            android.app.Application r11 = r2.f25923d
            nd.b0 r1 = r2.f25924e
            r10.<init>(r11, r1)
            goto L513
        L240:
            java.lang.Class<tf.c> r10 = tf.C6230c.class
            boolean r10 = r11.isAssignableFrom(r10)
            if (r10 == 0) goto L253
            tf.c r10 = new tf.c
            android.app.Application r11 = r2.f25923d
            nd.b0 r1 = r2.f25924e
            r10.<init>(r11, r1)
            goto L513
        L253:
            java.lang.Class<sf.h> r10 = p330sf.C6065h.class
            boolean r10 = r11.isAssignableFrom(r10)
            if (r10 == 0) goto L266
            sf.h r10 = new sf.h
            android.app.Application r11 = r2.f25923d
            nd.b0 r1 = r2.f25924e
            r10.<init>(r11, r1)
            goto L513
        L266:
            java.lang.Class<uf.t> r10 = p361uf.C6451t.class
            boolean r10 = r11.isAssignableFrom(r10)
            if (r10 == 0) goto L279
            uf.t r10 = new uf.t
            android.app.Application r11 = r2.f25923d
            nd.b0 r1 = r2.f25924e
            r10.<init>(r11, r1)
            goto L513
        L279:
            java.lang.Class<vf.d> r10 = p378vf.C6659d.class
            boolean r10 = r11.isAssignableFrom(r10)
            if (r10 == 0) goto L28c
            vf.d r10 = new vf.d
            android.app.Application r11 = r2.f25923d
            nd.b0 r1 = r2.f25924e
            r10.<init>(r11, r1)
            goto L513
        L28c:
            java.lang.Class<yf.f> r10 = p437yf.C7202f.class
            boolean r10 = r11.isAssignableFrom(r10)
            if (r10 == 0) goto L2a1
            yf.f r10 = new yf.f
            android.app.Application r11 = r2.f25923d
            nd.b0 r1 = r2.f25924e
            io.tacocrypto.app.database.AppDatabase r2 = r2.f25926g
            r10.<init>(r11, r1, r2)
            goto L513
        L2a1:
            java.lang.Class<zf.n> r10 = p457zf.C7327n.class
            boolean r10 = r11.isAssignableFrom(r10)
            if (r10 == 0) goto L2b6
            zf.n r10 = new zf.n
            android.app.Application r11 = r2.f25923d
            nd.b0 r1 = r2.f25924e
            io.tacocrypto.app.database.AppDatabase r2 = r2.f25926g
            r10.<init>(r11, r1, r2)
            goto L513
        L2b6:
            java.lang.Class<le.r> r10 = p206le.C4287r.class
            boolean r10 = r11.isAssignableFrom(r10)
            if (r10 == 0) goto L2c9
            le.r r10 = new le.r
            android.app.Application r11 = r2.f25923d
            nd.b0 r1 = r2.f25924e
            r10.<init>(r11, r1)
            goto L513
        L2c9:
            java.lang.Class<oe.h> r10 = p256oe.C5246h.class
            boolean r10 = r11.isAssignableFrom(r10)
            if (r10 == 0) goto L2dc
            oe.h r10 = new oe.h
            android.app.Application r11 = r2.f25923d
            nd.b0 r1 = r2.f25924e
            r10.<init>(r11, r1)
            goto L513
        L2dc:
            java.lang.Class<ne.h> r10 = ne.C4797h.class
            boolean r10 = r11.isAssignableFrom(r10)
            if (r10 == 0) goto L2ef
            ne.h r10 = new ne.h
            android.app.Application r11 = r2.f25923d
            nd.b0 r1 = r2.f25924e
            r10.<init>(r11, r1)
            goto L513
        L2ef:
            java.lang.Class<lg.k> r10 = p208lg.C4303k.class
            boolean r10 = r11.isAssignableFrom(r10)
            if (r10 == 0) goto L302
            lg.k r10 = new lg.k
            android.app.Application r11 = r2.f25923d
            nd.b0 r1 = r2.f25924e
            r10.<init>(r11, r1)
            goto L513
        L302:
            java.lang.Class<ee.g> r10 = ee.C1829g.class
            boolean r10 = r11.isAssignableFrom(r10)
            if (r10 == 0) goto L317
            ee.g r10 = new ee.g
            android.app.Application r11 = r2.f25923d
            nd.j1 r1 = r2.f25927h
            nd.k1 r2 = r2.f25928i
            r10.<init>(r11, r1, r2)
            goto L513
        L317:
            java.lang.Class<zd.l> r10 = p455zd.C7307l.class
            boolean r10 = r11.isAssignableFrom(r10)
            if (r10 == 0) goto L32a
            zd.l r10 = new zd.l
            android.app.Application r11 = r2.f25923d
            nd.b0 r1 = r2.f25924e
            r10.<init>(r11, r1)
            goto L513
        L32a:
            java.lang.Class<ae.i> r10 = ae.C0080i.class
            boolean r10 = r11.isAssignableFrom(r10)
            if (r10 == 0) goto L33d
            ae.i r10 = new ae.i
            android.app.Application r11 = r2.f25923d
            nd.b0 r1 = r2.f25924e
            r10.<init>(r11, r1)
            goto L513
        L33d:
            java.lang.Class<be.g> r10 = be.C0740g.class
            boolean r10 = r11.isAssignableFrom(r10)
            if (r10 == 0) goto L352
            be.g r10 = new be.g
            android.app.Application r11 = r2.f25923d
            nd.b0 r1 = r2.f25924e
            io.tacocrypto.app.database.AppDatabase r2 = r2.f25926g
            r10.<init>(r11, r1, r2)
            goto L513
        L352:
            java.lang.Class<eg.m> r10 = eg.C1849m.class
            boolean r10 = r11.isAssignableFrom(r10)
            if (r10 == 0) goto L365
            eg.m r10 = new eg.m
            android.app.Application r11 = r2.f25923d
            nd.b0 r1 = r2.f25924e
            r10.<init>(r11, r1)
            goto L513
        L365:
            java.lang.Class<re.p> r10 = re.C5832p.class
            boolean r10 = r11.isAssignableFrom(r10)
            if (r10 == 0) goto L378
            re.p r10 = new re.p
            android.app.Application r11 = r2.f25923d
            nd.b0 r1 = r2.f25924e
            r10.<init>(r11, r1)
            goto L513
        L378:
            java.lang.Class<se.o> r10 = se.C6057o.class
            boolean r10 = r11.isAssignableFrom(r10)
            if (r10 == 0) goto L38b
            se.o r10 = new se.o
            android.app.Application r11 = r2.f25923d
            nd.b0 r1 = r2.f25924e
            r10.<init>(r11, r1)
            goto L513
        L38b:
            java.lang.Class<qf.m> r10 = p294qf.C5645m.class
            boolean r10 = r11.isAssignableFrom(r10)
            if (r10 == 0) goto L39e
            qf.m r10 = new qf.m
            android.app.Application r11 = r2.f25923d
            nd.b0 r1 = r2.f25924e
            r10.<init>(r11, r1)
            goto L513
        L39e:
            java.lang.Class<dg.k> r10 = p061dg.C1463k.class
            boolean r10 = r11.isAssignableFrom(r10)
            if (r10 == 0) goto L3b1
            dg.k r10 = new dg.k
            android.app.Application r11 = r2.f25923d
            nd.b0 r1 = r2.f25924e
            r10.<init>(r11, r1)
            goto L513
        L3b1:
            java.lang.Class<pg.m> r10 = pg.C5522m.class
            boolean r10 = r11.isAssignableFrom(r10)
            if (r10 == 0) goto L3c6
            pg.m r10 = new pg.m
            android.app.Application r11 = r2.f25923d
            nd.b0 r1 = r2.f25924e
            nd.u r2 = r2.f25925f
            r10.<init>(r11, r1, r2)
            goto L513
        L3c6:
            java.lang.Class<cg.l> r10 = cg.C0970l.class
            boolean r10 = r11.isAssignableFrom(r10)
            if (r10 == 0) goto L400
            android.app.Application r10 = r2.f25923d
            java.lang.String r11 = "context"
            p214m2.C4339q.m9706k(r10, r11)
            gd.a$a r11 = gd.C2326a.f10565h
            android.content.ComponentName r1 = new android.content.ComponentName
            java.lang.Class<io.tacocrypto.app.ui.tools.player.service.MyMusicService> r3 = io.tacocrypto.app.p156ui.tools.player.service.MyMusicService.class
            r1.<init>(r10, r3)
            gd.a r3 = gd.C2326a.f10566i
            if (r3 != 0) goto L3f3
            monitor-enter(r11)
            gd.a r3 = gd.C2326a.f10566i     // Catch: java.lang.Throwable -> L3f0
            if (r3 != 0) goto L3ee
            gd.a r3 = new gd.a     // Catch: java.lang.Throwable -> L3f0
            r3.<init>(r10, r1)     // Catch: java.lang.Throwable -> L3f0
            gd.C2326a.f10566i = r3     // Catch: java.lang.Throwable -> L3f0
        L3ee:
            monitor-exit(r11)
            goto L3f3
        L3f0:
            r10 = move-exception
            monitor-exit(r11)
            throw r10
        L3f3:
            cg.l r10 = new cg.l
            android.app.Application r11 = r2.f25923d
            nd.b0 r1 = r2.f25924e
            nd.c1 r2 = r2.f25929j
            r10.<init>(r11, r1, r2, r3)
            goto L513
        L400:
            java.lang.Class<jf.g> r10 = p172jf.C3598g.class
            boolean r10 = r11.isAssignableFrom(r10)
            if (r10 == 0) goto L413
            jf.g r10 = new jf.g
            android.app.Application r11 = r2.f25923d
            nd.b0 r1 = r2.f25924e
            r10.<init>(r11, r1)
            goto L513
        L413:
            java.lang.Class<mf.f> r10 = p223mf.C4601f.class
            boolean r10 = r11.isAssignableFrom(r10)
            if (r10 == 0) goto L426
            mf.f r10 = new mf.f
            android.app.Application r11 = r2.f25923d
            nd.b0 r1 = r2.f25924e
            r10.<init>(r11, r1)
            goto L513
        L426:
            java.lang.Class<lf.e> r10 = p207lf.C4292e.class
            boolean r10 = r11.isAssignableFrom(r10)
            if (r10 == 0) goto L439
            lf.e r10 = new lf.e
            android.app.Application r11 = r2.f25923d
            nd.b0 r1 = r2.f25924e
            r10.<init>(r11, r1)
            goto L513
        L439:
            java.lang.Class<gf.h> r10 = gf.C2345h.class
            boolean r10 = r11.isAssignableFrom(r10)
            if (r10 == 0) goto L44e
            gf.h r10 = new gf.h
            android.app.Application r11 = r2.f25923d
            nd.b0 r1 = r2.f25924e
            nd.j1 r2 = r2.f25927h
            r10.<init>(r11, r1, r2)
            goto L513
        L44e:
            java.lang.Class<hf.e> r10 = p132hf.C3036e.class
            boolean r10 = r11.isAssignableFrom(r10)
            if (r10 == 0) goto L461
            hf.e r10 = new hf.e
            android.app.Application r11 = r2.f25923d
            nd.j1 r1 = r2.f25927h
            r10.<init>(r11, r1)
            goto L513
        L461:
            java.lang.Class<ye.g0> r10 = ye.C7176g0.class
            boolean r10 = r11.isAssignableFrom(r10)
            if (r10 == 0) goto L474
            ye.g0 r10 = new ye.g0
            android.app.Application r11 = r2.f25923d
            nd.b0 r1 = r2.f25924e
            r10.<init>(r11, r1)
            goto L513
        L474:
            java.lang.Class<ig.h> r10 = p152ig.C3153h.class
            boolean r10 = r11.isAssignableFrom(r10)
            if (r10 == 0) goto L487
            ig.h r10 = new ig.h
            android.app.Application r11 = r2.f25923d
            nd.b0 r1 = r2.f25924e
            r10.<init>(r11, r1)
            goto L513
        L487:
            java.lang.Class<sg.f> r10 = sg.C6071f.class
            boolean r10 = r11.isAssignableFrom(r10)
            if (r10 == 0) goto L498
            sg.f r10 = new sg.f
            nd.b0 r11 = r2.f25924e
            r10.<init>(r11)
            goto L513
        L498:
            java.lang.Class<pf.g> r10 = pf.C5498g.class
            boolean r10 = r11.isAssignableFrom(r10)
            if (r10 == 0) goto L4aa
            pf.g r10 = new pf.g
            android.app.Application r11 = r2.f25923d
            nd.b0 r1 = r2.f25924e
            r10.<init>(r11, r1)
            goto L513
        L4aa:
            java.lang.Class<tg.c> r10 = tg.C6242c.class
            boolean r10 = r11.isAssignableFrom(r10)
            if (r10 == 0) goto L4ba
            tg.c r10 = new tg.c
            nd.b0 r11 = r2.f25924e
            r10.<init>(r11)
            goto L513
        L4ba:
            java.lang.Class<of.q> r10 = p257of.C5263q.class
            boolean r10 = r11.isAssignableFrom(r10)
            if (r10 == 0) goto L4cc
            of.q r10 = new of.q
            android.app.Application r11 = r2.f25923d
            nd.b0 r1 = r2.f25924e
            r10.<init>(r11, r1)
            goto L513
        L4cc:
            java.lang.Class<ue.b0> r10 = p360ue.C6402b0.class
            boolean r10 = r11.isAssignableFrom(r10)
            if (r10 == 0) goto L4de
            ue.b0 r10 = new ue.b0
            android.app.Application r11 = r2.f25923d
            nd.b0 r1 = r2.f25924e
            r10.<init>(r11, r1)
            goto L513
        L4de:
            java.lang.Class<xe.c> r10 = p416xe.C7045c.class
            boolean r10 = r11.isAssignableFrom(r10)
            if (r10 == 0) goto L4f0
            xe.c r10 = new xe.c
            android.app.Application r11 = r2.f25923d
            nd.b0 r1 = r2.f25924e
            r10.<init>(r11, r1)
            goto L513
        L4f0:
            java.lang.Class<ve.c> r10 = ve.C6654c.class
            boolean r10 = r11.isAssignableFrom(r10)
            if (r10 == 0) goto L502
            ve.c r10 = new ve.c
            android.app.Application r11 = r2.f25923d
            nd.b0 r1 = r2.f25924e
            r10.<init>(r11, r1)
            goto L513
        L502:
            java.lang.Class<bf.p> r10 = bf.C0756p.class
            boolean r10 = r11.isAssignableFrom(r10)
            if (r10 == 0) goto L519
            bf.p r10 = new bf.p
            android.app.Application r11 = r2.f25923d
            nd.b0 r1 = r2.f25924e
            r10.<init>(r11, r1)
        L513:
            java.lang.String r11 = "androidx.lifecycle.savedstate.vm.tag"
            r10.m1453c(r11, r0)
            return r10
        L519:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Unknown ViewModel class: "
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            java.lang.String r11 = r11.getName()
            r0.append(r11)
            java.lang.String r11 = r0.toString()
            r10.<init>(r11)
            throw r10
    }
}
