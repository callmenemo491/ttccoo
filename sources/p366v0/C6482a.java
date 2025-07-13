package p366v0;

/* renamed from: v0.a */
/* loaded from: classes.dex */
public class C6482a {

    /* renamed from: g */
    public static final java.lang.ThreadLocal<p366v0.C6482a> f25119g = null;

    /* renamed from: a */
    public final p319s.C5941h<p366v0.C6482a.b, java.lang.Long> f25120a;

    /* renamed from: b */
    public final java.util.ArrayList<p366v0.C6482a.b> f25121b;

    /* renamed from: c */
    public final p366v0.C6482a.a f25122c;

    /* renamed from: d */
    public p366v0.C6482a.c f25123d;

    /* renamed from: e */
    public long f25124e;

    /* renamed from: f */
    public boolean f25125f;

    /* renamed from: v0.a$a */
    public class a {

        /* renamed from: a */
        public final /* synthetic */ p366v0.C6482a f25126a;

        public a(p366v0.C6482a r1) {
                r0 = this;
                r0.f25126a = r1
                r0.<init>()
                return
        }

        /* renamed from: a */
        public void m13161a() {
                r11 = this;
                v0.a r0 = r11.f25126a
                long r1 = android.os.SystemClock.uptimeMillis()
                r0.f25124e = r1
                v0.a r0 = r11.f25126a
                long r1 = r0.f25124e
                long r3 = android.os.SystemClock.uptimeMillis()
                r5 = 0
                r6 = 0
            L12:
                java.util.ArrayList<v0.a$b> r7 = r0.f25121b
                int r7 = r7.size()
                if (r6 >= r7) goto L49
                java.util.ArrayList<v0.a$b> r7 = r0.f25121b
                java.lang.Object r7 = r7.get(r6)
                v0.a$b r7 = (p366v0.C6482a.b) r7
                if (r7 != 0) goto L25
                goto L46
            L25:
                s.h<v0.a$b, java.lang.Long> r8 = r0.f25120a
                r9 = 0
                java.lang.Object r8 = r8.getOrDefault(r7, r9)
                java.lang.Long r8 = (java.lang.Long) r8
                if (r8 != 0) goto L31
                goto L3e
            L31:
                long r8 = r8.longValue()
                int r10 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
                if (r10 >= 0) goto L40
                s.h<v0.a$b, java.lang.Long> r8 = r0.f25120a
                r8.remove(r7)
            L3e:
                r8 = 1
                goto L41
            L40:
                r8 = 0
            L41:
                if (r8 == 0) goto L46
                r7.mo13162a(r1)
            L46:
                int r6 = r6 + 1
                goto L12
            L49:
                boolean r1 = r0.f25125f
                if (r1 == 0) goto L67
                java.util.ArrayList<v0.a$b> r1 = r0.f25121b
                int r1 = r1.size()
            L53:
                int r1 = r1 + (-1)
                if (r1 < 0) goto L65
                java.util.ArrayList<v0.a$b> r2 = r0.f25121b
                java.lang.Object r2 = r2.get(r1)
                if (r2 != 0) goto L53
                java.util.ArrayList<v0.a$b> r2 = r0.f25121b
                r2.remove(r1)
                goto L53
            L65:
                r0.f25125f = r5
            L67:
                v0.a r0 = r11.f25126a
                java.util.ArrayList<v0.a$b> r0 = r0.f25121b
                int r0 = r0.size()
                if (r0 <= 0) goto L8b
                v0.a r0 = r11.f25126a
                v0.a$c r1 = r0.f25123d
                if (r1 != 0) goto L80
                v0.a$d r1 = new v0.a$d
                v0.a$a r2 = r0.f25122c
                r1.<init>(r2)
                r0.f25123d = r1
            L80:
                v0.a$c r0 = r0.f25123d
                v0.a$d r0 = (p366v0.C6482a.d) r0
                android.view.Choreographer r1 = r0.f25128b
                android.view.Choreographer$FrameCallback r0 = r0.f25129c
                r1.postFrameCallback(r0)
            L8b:
                return
        }
    }

    /* renamed from: v0.a$b */
    public interface b {
        /* renamed from: a */
        boolean mo13162a(long r1);
    }

    /* renamed from: v0.a$c */
    public static abstract class c {

        /* renamed from: a */
        public final p366v0.C6482a.a f25127a;

        public c(p366v0.C6482a.a r1) {
                r0 = this;
                r0.<init>()
                r0.f25127a = r1
                return
        }
    }

    /* renamed from: v0.a$d */
    public static class d extends p366v0.C6482a.c {

        /* renamed from: b */
        public final android.view.Choreographer f25128b;

        /* renamed from: c */
        public final android.view.Choreographer.FrameCallback f25129c;

        /* renamed from: v0.a$d$a */
        public class a implements android.view.Choreographer.FrameCallback {

            /* renamed from: Y */
            public final /* synthetic */ p366v0.C6482a.d f25130Y;

            public a(p366v0.C6482a.d r1) {
                    r0 = this;
                    r0.f25130Y = r1
                    r0.<init>()
                    return
            }

            @Override // android.view.Choreographer.FrameCallback
            public void doFrame(long r1) {
                    r0 = this;
                    v0.a$d r1 = r0.f25130Y
                    v0.a$a r1 = r1.f25127a
                    r1.m13161a()
                    return
            }
        }

        public d(p366v0.C6482a.a r1) {
                r0 = this;
                r0.<init>(r1)
                android.view.Choreographer r1 = android.view.Choreographer.getInstance()
                r0.f25128b = r1
                v0.a$d$a r1 = new v0.a$d$a
                r1.<init>(r0)
                r0.f25129c = r1
                return
        }
    }

    static {
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            p366v0.C6482a.f25119g = r0
            return
    }

    public C6482a() {
            r2 = this;
            r2.<init>()
            s.h r0 = new s.h
            r0.<init>()
            r2.f25120a = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.f25121b = r0
            v0.a$a r0 = new v0.a$a
            r0.<init>(r2)
            r2.f25122c = r0
            r0 = 0
            r2.f25124e = r0
            r0 = 0
            r2.f25125f = r0
            return
    }

    /* renamed from: a */
    public static p366v0.C6482a m13160a() {
            java.lang.ThreadLocal<v0.a> r0 = p366v0.C6482a.f25119g
            java.lang.Object r1 = r0.get()
            if (r1 != 0) goto L10
            v0.a r1 = new v0.a
            r1.<init>()
            r0.set(r1)
        L10:
            java.lang.Object r0 = r0.get()
            v0.a r0 = (p366v0.C6482a) r0
            return r0
    }
}
