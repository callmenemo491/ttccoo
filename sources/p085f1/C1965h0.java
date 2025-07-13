package p085f1;

/* renamed from: f1.h0 */
/* loaded from: classes.dex */
public final class C1965h0 {

    /* renamed from: a */
    public final android.content.Context f8602a;

    /* renamed from: b */
    public final p085f1.C1965h0.c f8603b;

    /* renamed from: c */
    public final android.os.Handler f8604c;

    /* renamed from: d */
    public final android.content.pm.PackageManager f8605d;

    /* renamed from: e */
    public final java.util.ArrayList<p085f1.ServiceConnectionC1961f0> f8606e;

    /* renamed from: f */
    public boolean f8607f;

    /* renamed from: g */
    public final android.content.BroadcastReceiver f8608g;

    /* renamed from: h */
    public final java.lang.Runnable f8609h;

    /* renamed from: f1.h0$a */
    public class a extends android.content.BroadcastReceiver {

        /* renamed from: a */
        public final /* synthetic */ p085f1.C1965h0 f8610a;

        public a(p085f1.C1965h0 r1) {
                r0 = this;
                r0.f8610a = r1
                r0.<init>()
                return
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(android.content.Context r1, android.content.Intent r2) {
                r0 = this;
                f1.h0 r1 = r0.f8610a
                r1.m4930a()
                return
        }
    }

    /* renamed from: f1.h0$b */
    public class b implements java.lang.Runnable {

        /* renamed from: Y */
        public final /* synthetic */ p085f1.C1965h0 f8611Y;

        public b(p085f1.C1965h0 r1) {
                r0 = this;
                r0.f8611Y = r1
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r1 = this;
                f1.h0 r0 = r1.f8611Y
                r0.m4930a()
                return
        }
    }

    /* renamed from: f1.h0$c */
    public interface c {
    }

    public C1965h0(android.content.Context r2, p085f1.C1965h0.c r3) {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f8606e = r0
            f1.h0$a r0 = new f1.h0$a
            r0.<init>(r1)
            r1.f8608g = r0
            f1.h0$b r0 = new f1.h0$b
            r0.<init>(r1)
            r1.f8609h = r0
            r1.f8602a = r2
            r1.f8603b = r3
            android.os.Handler r3 = new android.os.Handler
            r3.<init>()
            r1.f8604c = r3
            android.content.pm.PackageManager r2 = r2.getPackageManager()
            r1.f8605d = r2
            return
    }

    /* renamed from: a */
    public void m4930a() {
            r12 = this;
            boolean r0 = r12.f8607f
            if (r0 != 0) goto L5
            return
        L5:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 30
            r3 = 0
            if (r1 < r2) goto L32
            android.content.Intent r0 = new android.content.Intent
            java.lang.String r1 = "android.media.MediaRoute2ProviderService"
            r0.<init>(r1)
            android.content.pm.PackageManager r1 = r12.f8605d
            java.util.List r0 = r1.queryIntentServices(r0, r3)
            java.util.stream.Stream r0 = r0.stream()
            f1.b r1 = p085f1.C1952b.f8511d
            java.util.stream.Stream r0 = r0.map(r1)
            java.util.stream.Collector r1 = java.util.stream.Collectors.toList()
            java.lang.Object r0 = r0.collect(r1)
            java.util.List r0 = (java.util.List) r0
        L32:
            android.content.Intent r1 = new android.content.Intent
            java.lang.String r2 = "android.media.MediaRouteProviderService"
            r1.<init>(r2)
            android.content.pm.PackageManager r2 = r12.f8605d
            java.util.List r1 = r2.queryIntentServices(r1, r3)
            java.util.Iterator r1 = r1.iterator()
            r2 = 0
        L44:
            boolean r4 = r1.hasNext()
            r5 = 1
            if (r4 == 0) goto L11c
            java.lang.Object r4 = r1.next()
            android.content.pm.ResolveInfo r4 = (android.content.pm.ResolveInfo) r4
            android.content.pm.ServiceInfo r4 = r4.serviceInfo
            if (r4 != 0) goto L56
            goto L44
        L56:
            f1.o$e r6 = p085f1.C1974o.f8670d
            if (r6 != 0) goto L5c
            r6 = 0
            goto L5e
        L5c:
            boolean r6 = r6.f8682b
        L5e:
            if (r6 == 0) goto L93
            if (r0 == 0) goto L8f
            boolean r6 = r0.isEmpty()
            if (r6 == 0) goto L69
            goto L8f
        L69:
            java.util.Iterator r6 = r0.iterator()
        L6d:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L8f
            java.lang.Object r7 = r6.next()
            android.content.pm.ServiceInfo r7 = (android.content.pm.ServiceInfo) r7
            java.lang.String r8 = r4.packageName
            java.lang.String r9 = r7.packageName
            boolean r8 = r8.equals(r9)
            if (r8 == 0) goto L6d
            java.lang.String r8 = r4.name
            java.lang.String r7 = r7.name
            boolean r7 = r8.equals(r7)
            if (r7 == 0) goto L6d
            r6 = 1
            goto L90
        L8f:
            r6 = 0
        L90:
            if (r6 == 0) goto L93
            goto L44
        L93:
            java.lang.String r6 = r4.packageName
            java.lang.String r7 = r4.name
            java.util.ArrayList<f1.f0> r8 = r12.f8606e
            int r8 = r8.size()
            r9 = 0
        L9e:
            if (r9 >= r8) goto Lc9
            java.util.ArrayList<f1.f0> r10 = r12.f8606e
            java.lang.Object r10 = r10.get(r9)
            f1.f0 r10 = (p085f1.ServiceConnectionC1961f0) r10
            android.content.ComponentName r11 = r10.f8554g0
            java.lang.String r11 = r11.getPackageName()
            boolean r11 = r11.equals(r6)
            if (r11 == 0) goto Lc2
            android.content.ComponentName r10 = r10.f8554g0
            java.lang.String r10 = r10.getClassName()
            boolean r10 = r10.equals(r7)
            if (r10 == 0) goto Lc2
            r10 = 1
            goto Lc3
        Lc2:
            r10 = 0
        Lc3:
            if (r10 == 0) goto Lc6
            goto Lca
        Lc6:
            int r9 = r9 + 1
            goto L9e
        Lc9:
            r9 = -1
        Lca:
            if (r9 >= 0) goto Lf7
            f1.f0 r5 = new f1.f0
            android.content.Context r6 = r12.f8602a
            android.content.ComponentName r7 = new android.content.ComponentName
            java.lang.String r8 = r4.packageName
            java.lang.String r4 = r4.name
            r7.<init>(r8, r4)
            r5.<init>(r6, r7)
            f1.g0 r4 = new f1.g0
            r4.<init>(r12, r5)
            r5.f8561n0 = r4
            r5.m4884y()
            java.util.ArrayList<f1.f0> r4 = r12.f8606e
            int r6 = r2 + 1
            r4.add(r2, r5)
            f1.h0$c r2 = r12.f8603b
            f1.o$e r2 = (p085f1.C1974o.e) r2
            r2.m5036a(r5)
        Lf4:
            r2 = r6
            goto L44
        Lf7:
            if (r9 < r2) goto L44
            java.util.ArrayList<f1.f0> r4 = r12.f8606e
            java.lang.Object r4 = r4.get(r9)
            f1.f0 r4 = (p085f1.ServiceConnectionC1961f0) r4
            r4.m4884y()
            f1.f0$a r5 = r4.f8559l0
            if (r5 != 0) goto L114
            boolean r5 = r4.m4883x()
            if (r5 == 0) goto L114
            r4.m4885z()
            r4.m4877r()
        L114:
            java.util.ArrayList<f1.f0> r4 = r12.f8606e
            int r6 = r2 + 1
            java.util.Collections.swap(r4, r9, r2)
            goto Lf4
        L11c:
            java.util.ArrayList<f1.f0> r0 = r12.f8606e
            int r0 = r0.size()
            if (r2 >= r0) goto L1a1
            java.util.ArrayList<f1.f0> r0 = r12.f8606e
            int r0 = r0.size()
            int r0 = r0 - r5
        L12b:
            if (r0 < r2) goto L1a1
            java.util.ArrayList<f1.f0> r1 = r12.f8606e
            java.lang.Object r1 = r1.get(r0)
            f1.f0 r1 = (p085f1.ServiceConnectionC1961f0) r1
            f1.h0$c r4 = r12.f8603b
            f1.o$e r4 = (p085f1.C1974o.e) r4
            f1.o$h r5 = r4.m5039d(r1)
            r6 = 0
            if (r5 == 0) goto L174
            java.util.Objects.requireNonNull(r1)
            p085f1.C1974o.m5025b()
            r1.f8615b0 = r6
            r1.m4932q(r6)
            r4.m5050o(r5, r6)
            boolean r7 = p085f1.C1974o.f8669c
            if (r7 == 0) goto L168
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "Provider removed: "
            r7.append(r8)
            r7.append(r5)
            java.lang.String r7 = r7.toString()
            java.lang.String r8 = "MediaRouter"
            android.util.Log.d(r8, r7)
        L168:
            f1.o$e$c r7 = r4.f8691k
            r8 = 514(0x202, float:7.2E-43)
            r7.m5055b(r8, r5)
            java.util.ArrayList<f1.o$h> r4 = r4.f8687g
            r4.remove(r5)
        L174:
            java.util.ArrayList<f1.f0> r4 = r12.f8606e
            r4.remove(r1)
            r1.f8561n0 = r6
            boolean r4 = r1.f8557j0
            if (r4 == 0) goto L19e
            boolean r4 = p085f1.ServiceConnectionC1961f0.f8553o0
            if (r4 == 0) goto L199
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r1)
            java.lang.String r5 = ": Stopping"
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            java.lang.String r5 = "MediaRouteProviderProxy"
            android.util.Log.d(r5, r4)
        L199:
            r1.f8557j0 = r3
            r1.m4876A()
        L19e:
            int r0 = r0 + (-1)
            goto L12b
        L1a1:
            return
    }
}
