package p371v5;

/* renamed from: v5.s */
/* loaded from: classes.dex */
public final class C6569s {

    /* renamed from: e */
    public static p371v5.C6569s f25703e;

    /* renamed from: a */
    public final android.os.Handler f25704a;

    /* renamed from: b */
    public final java.util.concurrent.CopyOnWriteArrayList<java.lang.ref.WeakReference<p371v5.C6569s.b>> f25705b;

    /* renamed from: c */
    public final java.lang.Object f25706c;

    /* renamed from: d */
    public int f25707d;

    /* renamed from: v5.s$a */
    public static /* synthetic */ class a {
    }

    /* renamed from: v5.s$b */
    public interface b {
        /* renamed from: a */
        void mo12969a(int r1);
    }

    /* renamed from: v5.s$c */
    public final class c extends android.content.BroadcastReceiver {

        /* renamed from: a */
        public final /* synthetic */ p371v5.C6569s f25708a;

        public c(p371v5.C6569s r1, p371v5.C6569s.a r2) {
                r0 = this;
                r0.f25708a = r1
                r0.<init>()
                return
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(android.content.Context r9, android.content.Intent r10) {
                r8 = this;
                java.lang.String r10 = "connectivity"
                java.lang.Object r10 = r9.getSystemService(r10)
                android.net.ConnectivityManager r10 = (android.net.ConnectivityManager) r10
                r0 = 29
                r1 = 9
                r2 = 6
                r3 = 4
                r4 = 0
                r5 = 1
                r6 = 5
                if (r10 != 0) goto L14
                goto L4e
            L14:
                android.net.NetworkInfo r10 = r10.getActiveNetworkInfo()     // Catch: java.lang.SecurityException -> L4e
                if (r10 == 0) goto L4c
                boolean r7 = r10.isConnected()
                if (r7 != 0) goto L21
                goto L4c
            L21:
                int r7 = r10.getType()
                if (r7 == 0) goto L36
                if (r7 == r5) goto L44
                if (r7 == r3) goto L36
                if (r7 == r6) goto L36
                if (r7 == r2) goto L46
                if (r7 == r1) goto L34
                r1 = 8
                goto L4f
            L34:
                r1 = 7
                goto L4f
            L36:
                int r10 = r10.getSubtype()
                switch(r10) {
                    case 1: goto L4a;
                    case 2: goto L4a;
                    case 3: goto L48;
                    case 4: goto L48;
                    case 5: goto L48;
                    case 6: goto L48;
                    case 7: goto L48;
                    case 8: goto L48;
                    case 9: goto L48;
                    case 10: goto L48;
                    case 11: goto L48;
                    case 12: goto L48;
                    case 13: goto L46;
                    case 14: goto L48;
                    case 15: goto L48;
                    case 16: goto L3d;
                    case 17: goto L48;
                    case 18: goto L44;
                    case 19: goto L3d;
                    case 20: goto L3f;
                    default: goto L3d;
                }
            L3d:
                r1 = 6
                goto L4f
            L3f:
                int r10 = p371v5.C6552b0.f25624a
                if (r10 < r0) goto L4e
                goto L4f
            L44:
                r1 = 2
                goto L4f
            L46:
                r1 = 5
                goto L4f
            L48:
                r1 = 4
                goto L4f
            L4a:
                r1 = 3
                goto L4f
            L4c:
                r1 = 1
                goto L4f
            L4e:
                r1 = 0
            L4f:
                int r10 = p371v5.C6552b0.f25624a
                if (r10 < r0) goto L79
                if (r1 != r6) goto L79
                java.lang.String r0 = "phone"
                java.lang.Object r9 = r9.getSystemService(r0)     // Catch: java.lang.RuntimeException -> L79
                android.telephony.TelephonyManager r9 = (android.telephony.TelephonyManager) r9     // Catch: java.lang.RuntimeException -> L79
                java.util.Objects.requireNonNull(r9)     // Catch: java.lang.RuntimeException -> L79
                v5.s$d r0 = new v5.s$d     // Catch: java.lang.RuntimeException -> L79
                v5.s r2 = r8.f25708a     // Catch: java.lang.RuntimeException -> L79
                r3 = 0
                r0.<init>(r2, r3)     // Catch: java.lang.RuntimeException -> L79
                r2 = 31
                if (r10 >= r2) goto L70
                r9.listen(r0, r5)     // Catch: java.lang.RuntimeException -> L79
                goto L75
            L70:
                r10 = 1048576(0x100000, float:1.469368E-39)
                r9.listen(r0, r10)     // Catch: java.lang.RuntimeException -> L79
            L75:
                r9.listen(r0, r4)     // Catch: java.lang.RuntimeException -> L79
                return
            L79:
                v5.s r9 = r8.f25708a
                p371v5.C6569s.m13388a(r9, r1)
                return
        }
    }

    /* renamed from: v5.s$d */
    public class d extends android.telephony.PhoneStateListener {

        /* renamed from: a */
        public final /* synthetic */ p371v5.C6569s f25709a;

        public d(p371v5.C6569s r1, p371v5.C6569s.a r2) {
                r0 = this;
                r0.f25709a = r1
                r0.<init>()
                return
        }

        @Override // android.telephony.PhoneStateListener
        public void onDisplayInfoChanged(android.telephony.TelephonyDisplayInfo r2) {
                r1 = this;
                int r2 = r2.getOverrideNetworkType()
                r0 = 3
                if (r2 == r0) goto Ld
                r0 = 4
                if (r2 != r0) goto Lb
                goto Ld
            Lb:
                r2 = 0
                goto Le
            Ld:
                r2 = 1
            Le:
                v5.s r0 = r1.f25709a
                if (r2 == 0) goto L15
                r2 = 10
                goto L16
            L15:
                r2 = 5
            L16:
                p371v5.C6569s.m13388a(r0, r2)
                return
        }

        @Override // android.telephony.PhoneStateListener
        public void onServiceStateChanged(android.telephony.ServiceState r2) {
                r1 = this;
                if (r2 != 0) goto L5
                java.lang.String r2 = ""
                goto L9
            L5:
                java.lang.String r2 = r2.toString()
            L9:
                java.lang.String r0 = "nrState=CONNECTED"
                boolean r0 = r2.contains(r0)
                if (r0 != 0) goto L1c
                java.lang.String r0 = "nrState=NOT_RESTRICTED"
                boolean r2 = r2.contains(r0)
                if (r2 == 0) goto L1a
                goto L1c
            L1a:
                r2 = 0
                goto L1d
            L1c:
                r2 = 1
            L1d:
                v5.s r0 = r1.f25709a
                if (r2 == 0) goto L24
                r2 = 10
                goto L25
            L24:
                r2 = 5
            L25:
                p371v5.C6569s.m13388a(r0, r2)
                return
        }
    }

    public C6569s(android.content.Context r4) {
            r3 = this;
            r3.<init>()
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r1)
            r3.f25704a = r0
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            r0.<init>()
            r3.f25705b = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r3.f25706c = r0
            r0 = 0
            r3.f25707d = r0
            android.content.IntentFilter r0 = new android.content.IntentFilter
            r0.<init>()
            java.lang.String r1 = "android.net.conn.CONNECTIVITY_CHANGE"
            r0.addAction(r1)
            v5.s$c r1 = new v5.s$c
            r2 = 0
            r1.<init>(r3, r2)
            r4.registerReceiver(r1, r0)
            return
    }

    /* renamed from: a */
    public static void m13388a(p371v5.C6569s r3, int r4) {
            java.lang.Object r0 = r3.f25706c
            monitor-enter(r0)
            int r1 = r3.f25707d     // Catch: java.lang.Throwable -> L31
            if (r1 != r4) goto L9
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L31
            goto L30
        L9:
            r3.f25707d = r4     // Catch: java.lang.Throwable -> L31
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L31
            java.util.concurrent.CopyOnWriteArrayList<java.lang.ref.WeakReference<v5.s$b>> r0 = r3.f25705b
            java.util.Iterator r0 = r0.iterator()
        L12:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L30
            java.lang.Object r1 = r0.next()
            java.lang.ref.WeakReference r1 = (java.lang.ref.WeakReference) r1
            java.lang.Object r2 = r1.get()
            v5.s$b r2 = (p371v5.C6569s.b) r2
            if (r2 == 0) goto L2a
            r2.mo12969a(r4)
            goto L12
        L2a:
            java.util.concurrent.CopyOnWriteArrayList<java.lang.ref.WeakReference<v5.s$b>> r2 = r3.f25705b
            r2.remove(r1)
            goto L12
        L30:
            return
        L31:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L31
            throw r3
    }
}
