package p242o0;

/* renamed from: o0.c */
/* loaded from: classes.dex */
public class C4869c {

    /* renamed from: a */
    public final java.lang.Object f19354a;

    /* renamed from: o0.c$a */
    public static class a extends android.view.accessibility.AccessibilityNodeProvider {

        /* renamed from: a */
        public final p242o0.C4869c f19355a;

        public a(p242o0.C4869c r1) {
                r0 = this;
                r0.<init>()
                r0.f19355a = r1
                return
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public android.view.accessibility.AccessibilityNodeInfo createAccessibilityNodeInfo(int r2) {
                r1 = this;
                o0.c r0 = r1.f19355a
                o0.b r2 = r0.mo11003a(r2)
                if (r2 != 0) goto La
                r2 = 0
                return r2
            La:
                android.view.accessibility.AccessibilityNodeInfo r2 = r2.f19337a
                return r2
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public java.util.List<android.view.accessibility.AccessibilityNodeInfo> findAccessibilityNodeInfosByText(java.lang.String r1, int r2) {
                r0 = this;
                o0.c r1 = r0.f19355a
                java.util.Objects.requireNonNull(r1)
                r1 = 0
                return r1
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public boolean performAction(int r2, int r3, android.os.Bundle r4) {
                r1 = this;
                o0.c r0 = r1.f19355a
                boolean r2 = r0.mo11005c(r2, r3, r4)
                return r2
        }
    }

    /* renamed from: o0.c$b */
    public static class b extends p242o0.C4869c.a {
        public b(p242o0.C4869c r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public android.view.accessibility.AccessibilityNodeInfo findFocus(int r2) {
                r1 = this;
                o0.c r0 = r1.f19355a
                o0.b r2 = r0.mo11004b(r2)
                if (r2 != 0) goto La
                r2 = 0
                return r2
            La:
                android.view.accessibility.AccessibilityNodeInfo r2 = r2.f19337a
                return r2
        }
    }

    /* renamed from: o0.c$c */
    public static class c extends p242o0.C4869c.b {
        public c(p242o0.C4869c r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public void addExtraDataToAccessibilityNodeInfo(int r1, android.view.accessibility.AccessibilityNodeInfo r2, java.lang.String r3, android.os.Bundle r4) {
                r0 = this;
                o0.c r1 = r0.f19355a
                java.util.Objects.requireNonNull(r1)
                return
        }
    }

    public C4869c() {
            r2 = this;
            r2.<init>()
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto Lf
            o0.c$c r0 = new o0.c$c
            r0.<init>(r2)
            goto L14
        Lf:
            o0.c$b r0 = new o0.c$b
            r0.<init>(r2)
        L14:
            r2.f19354a = r0
            return
    }

    public C4869c(java.lang.Object r1) {
            r0 = this;
            r0.<init>()
            r0.f19354a = r1
            return
    }

    /* renamed from: a */
    public p242o0.C4868b mo11003a(int r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    /* renamed from: b */
    public p242o0.C4868b mo11004b(int r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    /* renamed from: c */
    public boolean mo11005c(int r1, int r2, android.os.Bundle r3) {
            r0 = this;
            r1 = 0
            return r1
    }
}
