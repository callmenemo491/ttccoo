package androidx.navigation;

@androidx.navigation.AbstractC0527v.b("activity")
/* renamed from: androidx.navigation.b */
/* loaded from: classes.dex */
public class C0503b extends androidx.navigation.AbstractC0527v<androidx.navigation.C0503b.a> {

    /* renamed from: a */
    public android.content.Context f2907a;

    /* renamed from: b */
    public android.app.Activity f2908b;

    /* renamed from: androidx.navigation.b$a */
    public static class a extends androidx.navigation.C0518m {

        /* renamed from: g0 */
        public android.content.Intent f2909g0;

        /* renamed from: h0 */
        public java.lang.String f2910h0;

        public a(androidx.navigation.AbstractC0527v<? extends androidx.navigation.C0503b.a> r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // androidx.navigation.C0518m
        /* renamed from: l */
        public void mo1580l(android.content.Context r4, android.util.AttributeSet r5) {
                r3 = this;
                super.mo1580l(r4, r5)
                android.content.res.Resources r0 = r4.getResources()
                int[] r1 = androidx.navigation.C0529x.f3020a
                android.content.res.TypedArray r5 = r0.obtainAttributes(r5, r1)
                r0 = 4
                java.lang.String r0 = r5.getString(r0)
                if (r0 == 0) goto L1e
                java.lang.String r1 = r4.getPackageName()
                java.lang.String r2 = "${applicationId}"
                java.lang.String r0 = r0.replace(r2, r1)
            L1e:
                android.content.Intent r1 = r3.f2909g0
                if (r1 != 0) goto L29
                android.content.Intent r1 = new android.content.Intent
                r1.<init>()
                r3.f2909g0 = r1
            L29:
                android.content.Intent r1 = r3.f2909g0
                r1.setPackage(r0)
                r0 = 0
                java.lang.String r1 = r5.getString(r0)
                if (r1 == 0) goto L65
                char r0 = r1.charAt(r0)
                r2 = 46
                if (r0 != r2) goto L50
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r2 = r4.getPackageName()
                r0.append(r2)
                r0.append(r1)
                java.lang.String r1 = r0.toString()
            L50:
                android.content.ComponentName r0 = new android.content.ComponentName
                r0.<init>(r4, r1)
                android.content.Intent r4 = r3.f2909g0
                if (r4 != 0) goto L60
                android.content.Intent r4 = new android.content.Intent
                r4.<init>()
                r3.f2909g0 = r4
            L60:
                android.content.Intent r4 = r3.f2909g0
                r4.setComponent(r0)
            L65:
                r4 = 1
                java.lang.String r4 = r5.getString(r4)
                android.content.Intent r0 = r3.f2909g0
                if (r0 != 0) goto L75
                android.content.Intent r0 = new android.content.Intent
                r0.<init>()
                r3.f2909g0 = r0
            L75:
                android.content.Intent r0 = r3.f2909g0
                r0.setAction(r4)
                r4 = 2
                java.lang.String r4 = r5.getString(r4)
                if (r4 == 0) goto L95
                android.net.Uri r4 = android.net.Uri.parse(r4)
                android.content.Intent r0 = r3.f2909g0
                if (r0 != 0) goto L90
                android.content.Intent r0 = new android.content.Intent
                r0.<init>()
                r3.f2909g0 = r0
            L90:
                android.content.Intent r0 = r3.f2909g0
                r0.setData(r4)
            L95:
                r4 = 3
                java.lang.String r4 = r5.getString(r4)
                r3.f2910h0 = r4
                r5.recycle()
                return
        }

        @Override // androidx.navigation.C0518m
        public java.lang.String toString() {
                r4 = this;
                android.content.Intent r0 = r4.f2909g0
                r1 = 0
                if (r0 != 0) goto L7
                r0 = r1
                goto Lb
            L7:
                android.content.ComponentName r0 = r0.getComponent()
            Lb:
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = super.toString()
                r2.append(r3)
                if (r0 == 0) goto L26
                java.lang.String r1 = " class="
                r2.append(r1)
                java.lang.String r0 = r0.getClassName()
                r2.append(r0)
                goto L39
            L26:
                android.content.Intent r0 = r4.f2909g0
                if (r0 != 0) goto L2b
                goto L2f
            L2b:
                java.lang.String r1 = r0.getAction()
            L2f:
                if (r1 == 0) goto L39
                java.lang.String r0 = " action="
                r2.append(r0)
                r2.append(r1)
            L39:
                java.lang.String r0 = r2.toString()
                return r0
        }
    }

    /* renamed from: androidx.navigation.b$b */
    public static final class b implements androidx.navigation.AbstractC0527v.a {
    }

    public C0503b(android.content.Context r2) {
            r1 = this;
            r1.<init>()
            r1.f2907a = r2
        L5:
            boolean r0 = r2 instanceof android.content.ContextWrapper
            if (r0 == 0) goto L19
            boolean r0 = r2 instanceof android.app.Activity
            if (r0 == 0) goto L12
            android.app.Activity r2 = (android.app.Activity) r2
            r1.f2908b = r2
            goto L19
        L12:
            android.content.ContextWrapper r2 = (android.content.ContextWrapper) r2
            android.content.Context r2 = r2.getBaseContext()
            goto L5
        L19:
            return
    }

    @Override // androidx.navigation.AbstractC0527v
    /* renamed from: a */
    public androidx.navigation.C0518m mo1577a() {
            r1 = this;
            androidx.navigation.b$a r0 = new androidx.navigation.b$a
            r0.<init>(r1)
            return r0
    }

    @Override // androidx.navigation.AbstractC0527v
    /* renamed from: b */
    public androidx.navigation.C0518m mo1578b(androidx.navigation.C0518m r10, android.os.Bundle r11, androidx.navigation.C0524s r12, androidx.navigation.AbstractC0527v.a r13) {
            r9 = this;
            androidx.navigation.b$a r10 = (androidx.navigation.C0503b.a) r10
            android.content.Intent r0 = r10.f2909g0
            if (r0 == 0) goto L187
            android.content.Intent r0 = new android.content.Intent
            android.content.Intent r1 = r10.f2909g0
            r0.<init>(r1)
            if (r11 == 0) goto L84
            r0.putExtras(r11)
            java.lang.String r1 = r10.f2910h0
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 != 0) goto L84
            java.lang.StringBuffer r2 = new java.lang.StringBuffer
            r2.<init>()
            java.lang.String r3 = "\\{(.+?)\\}"
            java.util.regex.Pattern r3 = java.util.regex.Pattern.compile(r3)
            java.util.regex.Matcher r3 = r3.matcher(r1)
        L29:
            boolean r4 = r3.find()
            if (r4 == 0) goto L76
            r4 = 1
            java.lang.String r4 = r3.group(r4)
            boolean r5 = r11.containsKey(r4)
            if (r5 == 0) goto L4f
            java.lang.String r5 = ""
            r3.appendReplacement(r2, r5)
            java.lang.Object r4 = r11.get(r4)
            java.lang.String r4 = r4.toString()
            java.lang.String r4 = android.net.Uri.encode(r4)
            r2.append(r4)
            goto L29
        L4f:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r13 = "Could not find "
            r12.append(r13)
            r12.append(r4)
            java.lang.String r13 = " in "
            r12.append(r13)
            r12.append(r11)
            java.lang.String r11 = " to fill data pattern "
            r12.append(r11)
            r12.append(r1)
            java.lang.String r11 = r12.toString()
            r10.<init>(r11)
            throw r10
        L76:
            r3.appendTail(r2)
            java.lang.String r11 = r2.toString()
            android.net.Uri r11 = android.net.Uri.parse(r11)
            r0.setData(r11)
        L84:
            boolean r11 = r13 instanceof androidx.navigation.C0503b.b
            r1 = 0
            if (r11 == 0) goto L92
            r2 = r13
            androidx.navigation.b$b r2 = (androidx.navigation.C0503b.b) r2
            java.util.Objects.requireNonNull(r2)
            r0.addFlags(r1)
        L92:
            android.content.Context r2 = r9.f2907a
            boolean r2 = r2 instanceof android.app.Activity
            if (r2 != 0) goto L9d
            r2 = 268435456(0x10000000, float:2.524355E-29)
            r0.addFlags(r2)
        L9d:
            if (r12 == 0) goto La8
            boolean r2 = r12.f2994a
            if (r2 == 0) goto La8
            r2 = 536870912(0x20000000, float:1.0842022E-19)
            r0.addFlags(r2)
        La8:
            android.app.Activity r2 = r9.f2908b
            java.lang.String r3 = "android-support-navigation:ActivityNavigator:current"
            if (r2 == 0) goto Lbf
            android.content.Intent r2 = r2.getIntent()
            if (r2 == 0) goto Lbf
            int r2 = r2.getIntExtra(r3, r1)
            if (r2 == 0) goto Lbf
            java.lang.String r4 = "android-support-navigation:ActivityNavigator:source"
            r0.putExtra(r4, r2)
        Lbf:
            int r2 = r10.f2973a0
            r0.putExtra(r3, r2)
            android.content.Context r2 = r9.f2907a
            android.content.res.Resources r2 = r2.getResources()
            java.lang.String r3 = "when launching "
            java.lang.String r4 = "ActivityNavigator"
            java.lang.String r5 = "animator"
            if (r12 == 0) goto L11f
            int r6 = r12.f2999f
            int r7 = r12.f3000g
            if (r6 <= 0) goto Le2
            java.lang.String r8 = r2.getResourceTypeName(r6)
            boolean r8 = r8.equals(r5)
            if (r8 != 0) goto Lee
        Le2:
            if (r7 <= 0) goto L115
            java.lang.String r8 = r2.getResourceTypeName(r7)
            boolean r8 = r8.equals(r5)
            if (r8 == 0) goto L115
        Lee:
            java.lang.String r8 = "Activity destinations do not support Animator resource. Ignoring popEnter resource "
            java.lang.StringBuilder r8 = android.support.v4.media.C0144c.m256a(r8)
            java.lang.String r6 = r2.getResourceName(r6)
            r8.append(r6)
            java.lang.String r6 = " and popExit resource "
            r8.append(r6)
            java.lang.String r6 = r2.getResourceName(r7)
            r8.append(r6)
            r8.append(r3)
            r8.append(r10)
            java.lang.String r6 = r8.toString()
            android.util.Log.w(r4, r6)
            goto L11f
        L115:
            java.lang.String r8 = "android-support-navigation:ActivityNavigator:popEnterAnim"
            r0.putExtra(r8, r6)
            java.lang.String r6 = "android-support-navigation:ActivityNavigator:popExitAnim"
            r0.putExtra(r6, r7)
        L11f:
            if (r11 == 0) goto L126
            androidx.navigation.b$b r13 = (androidx.navigation.C0503b.b) r13
            java.util.Objects.requireNonNull(r13)
        L126:
            android.content.Context r11 = r9.f2907a
            r11.startActivity(r0)
            if (r12 == 0) goto L185
            android.app.Activity r11 = r9.f2908b
            if (r11 == 0) goto L185
            int r11 = r12.f2997d
            int r12 = r12.f2998e
            if (r11 <= 0) goto L141
            java.lang.String r13 = r2.getResourceTypeName(r11)
            boolean r13 = r13.equals(r5)
            if (r13 != 0) goto L14d
        L141:
            if (r12 <= 0) goto L174
            java.lang.String r13 = r2.getResourceTypeName(r12)
            boolean r13 = r13.equals(r5)
            if (r13 == 0) goto L174
        L14d:
            java.lang.String r13 = "Activity destinations do not support Animator resource. Ignoring enter resource "
            java.lang.StringBuilder r13 = android.support.v4.media.C0144c.m256a(r13)
            java.lang.String r11 = r2.getResourceName(r11)
            r13.append(r11)
            java.lang.String r11 = " and exit resource "
            r13.append(r11)
            java.lang.String r11 = r2.getResourceName(r12)
            r13.append(r11)
            r13.append(r3)
            r13.append(r10)
            java.lang.String r10 = r13.toString()
            android.util.Log.w(r4, r10)
            goto L185
        L174:
            if (r11 >= 0) goto L178
            if (r12 < 0) goto L185
        L178:
            int r10 = java.lang.Math.max(r11, r1)
            int r11 = java.lang.Math.max(r12, r1)
            android.app.Activity r12 = r9.f2908b
            r12.overridePendingTransition(r10, r11)
        L185:
            r10 = 0
            return r10
        L187:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "Destination "
            java.lang.StringBuilder r12 = android.support.v4.media.C0144c.m256a(r12)
            int r10 = r10.f2973a0
            java.lang.String r13 = " does not have an Intent set."
            java.lang.String r10 = p381w.C6764e.m13690a(r12, r10, r13)
            r11.<init>(r10)
            throw r11
    }

    @Override // androidx.navigation.AbstractC0527v
    /* renamed from: e */
    public boolean mo1579e() {
            r1 = this;
            android.app.Activity r0 = r1.f2908b
            if (r0 == 0) goto L9
            r0.finish()
            r0 = 1
            return r0
        L9:
            r0 = 0
            return r0
    }
}
