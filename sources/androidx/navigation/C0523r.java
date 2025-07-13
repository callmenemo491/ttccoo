package androidx.navigation;

/* renamed from: androidx.navigation.r */
/* loaded from: classes.dex */
public final class C0523r {

    /* renamed from: c */
    public static final java.lang.ThreadLocal<android.util.TypedValue> f2991c = null;

    /* renamed from: a */
    public android.content.Context f2992a;

    /* renamed from: b */
    public androidx.navigation.C0528w f2993b;

    static {
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            androidx.navigation.C0523r.f2991c = r0
            return
    }

    public C0523r(android.content.Context r1, androidx.navigation.C0528w r2) {
            r0 = this;
            r0.<init>()
            r0.f2992a = r1
            r0.f2993b = r2
            return
    }

    /* renamed from: a */
    public static androidx.navigation.AbstractC0525t m1599a(android.util.TypedValue r1, androidx.navigation.AbstractC0525t r2, androidx.navigation.AbstractC0525t r3, java.lang.String r4, java.lang.String r5) {
            if (r2 == 0) goto L2e
            if (r2 != r3) goto L5
            goto L2e
        L5:
            org.xmlpull.v1.XmlPullParserException r2 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r0 = "Type is "
            r3.append(r0)
            r3.append(r4)
            java.lang.String r4 = " but found "
            r3.append(r4)
            r3.append(r5)
            java.lang.String r4 = ": "
            r3.append(r4)
            int r1 = r1.data
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r2.<init>(r1)
            throw r2
        L2e:
            if (r2 == 0) goto L31
            goto L32
        L31:
            r2 = r3
        L32:
            return r2
    }

    /* renamed from: b */
    public final androidx.navigation.C0518m m1600b(android.content.res.Resources r26, android.content.res.XmlResourceParser r27, android.util.AttributeSet r28, int r29) {
            r25 = this;
            r0 = r25
            r1 = r26
            r2 = r28
            androidx.navigation.w r3 = r0.f2993b
            java.lang.String r4 = r27.getName()
            androidx.navigation.v r3 = r3.m1613c(r4)
            androidx.navigation.m r3 = r3.mo1577a()
            android.content.Context r4 = r0.f2992a
            r3.mo1580l(r4, r2)
            int r4 = r27.getDepth()
            r5 = 1
            int r4 = r4 + r5
        L1f:
            int r6 = r27.next()
            if (r6 == r5) goto L236
            int r7 = r27.getDepth()
            r8 = 3
            if (r7 >= r4) goto L2e
            if (r6 == r8) goto L236
        L2e:
            r9 = 2
            if (r6 == r9) goto L32
            goto L1f
        L32:
            if (r7 <= r4) goto L35
            goto L1f
        L35:
            java.lang.String r6 = r27.getName()
            java.lang.String r7 = "argument"
            boolean r10 = r7.equals(r6)
            java.lang.String r11 = "Arguments must have a name"
            r12 = 0
            if (r10 == 0) goto L73
            int[] r6 = p104g1.C2206a.f10100b
            android.content.res.TypedArray r6 = r1.obtainAttributes(r2, r6)
            java.lang.String r7 = r6.getString(r12)
            if (r7 == 0) goto L6d
            r10 = r29
            androidx.navigation.h r8 = r0.m1602d(r6, r1, r10)
            java.util.HashMap<java.lang.String, androidx.navigation.h> r9 = r3.f2978f0
            if (r9 != 0) goto L61
            java.util.HashMap r9 = new java.util.HashMap
            r9.<init>()
            r3.f2978f0 = r9
        L61:
            java.util.HashMap<java.lang.String, androidx.navigation.h> r9 = r3.f2978f0
            r9.put(r7, r8)
            r6.recycle()
        L69:
            r19 = r4
            goto L232
        L6d:
            org.xmlpull.v1.XmlPullParserException r1 = new org.xmlpull.v1.XmlPullParserException
            r1.<init>(r11)
            throw r1
        L73:
            r10 = r29
            java.lang.String r13 = "deepLink"
            boolean r13 = r13.equals(r6)
            if (r13 == 0) goto L101
            int[] r6 = p104g1.C2206a.f10101c
            android.content.res.TypedArray r6 = r1.obtainAttributes(r2, r6)
            java.lang.String r7 = r6.getString(r8)
            java.lang.String r8 = r6.getString(r5)
            java.lang.String r9 = r6.getString(r9)
            boolean r11 = android.text.TextUtils.isEmpty(r7)
            if (r11 == 0) goto Laa
            boolean r11 = android.text.TextUtils.isEmpty(r8)
            if (r11 == 0) goto Laa
            boolean r11 = android.text.TextUtils.isEmpty(r9)
            if (r11 != 0) goto La2
            goto Laa
        La2:
            org.xmlpull.v1.XmlPullParserException r1 = new org.xmlpull.v1.XmlPullParserException
            java.lang.String r2 = "Every <deepLink> must include at least one of app:uri, app:action, or app:mimeType"
            r1.<init>(r2)
            throw r1
        Laa:
            java.lang.String r11 = "${applicationId}"
            r12 = 0
            if (r7 == 0) goto Lba
            android.content.Context r13 = r0.f2992a
            java.lang.String r13 = r13.getPackageName()
            java.lang.String r7 = r7.replace(r11, r13)
            goto Lbb
        Lba:
            r7 = r12
        Lbb:
            boolean r13 = android.text.TextUtils.isEmpty(r8)
            if (r13 != 0) goto Lda
            android.content.Context r13 = r0.f2992a
            java.lang.String r13 = r13.getPackageName()
            java.lang.String r8 = r8.replace(r11, r13)
            boolean r13 = r8.isEmpty()
            if (r13 != 0) goto Ld2
            goto Ldb
        Ld2:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "The NavDeepLink cannot have an empty action."
            r1.<init>(r2)
            throw r1
        Lda:
            r8 = r12
        Ldb:
            if (r9 == 0) goto Le7
            android.content.Context r12 = r0.f2992a
            java.lang.String r12 = r12.getPackageName()
            java.lang.String r12 = r9.replace(r11, r12)
        Le7:
            androidx.navigation.l r9 = new androidx.navigation.l
            r9.<init>(r7, r8, r12)
            java.util.ArrayList<androidx.navigation.l> r7 = r3.f2976d0
            if (r7 != 0) goto Lf7
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            r3.f2976d0 = r7
        Lf7:
            java.util.ArrayList<androidx.navigation.l> r7 = r3.f2976d0
            r7.add(r9)
            r6.recycle()
            goto L69
        L101:
            java.lang.String r13 = "action"
            boolean r13 = r13.equals(r6)
            if (r13 == 0) goto L1fd
            int[] r6 = p104g1.C2206a.f10099a
            android.content.res.TypedArray r6 = r1.obtainAttributes(r2, r6)
            int r13 = r6.getResourceId(r12, r12)
            int r14 = r6.getResourceId(r5, r12)
            androidx.navigation.d r15 = new androidx.navigation.d
            r15.<init>(r14)
            r14 = 4
            boolean r17 = r6.getBoolean(r14, r12)
            r14 = 7
            r5 = -1
            int r18 = r6.getResourceId(r14, r5)
            r14 = 8
            boolean r19 = r6.getBoolean(r14, r12)
            int r20 = r6.getResourceId(r9, r5)
            int r21 = r6.getResourceId(r8, r5)
            r14 = 5
            int r22 = r6.getResourceId(r14, r5)
            r14 = 6
            int r23 = r6.getResourceId(r14, r5)
            androidx.navigation.s r5 = new androidx.navigation.s
            r16 = r5
            r16.<init>(r17, r18, r19, r20, r21, r22, r23)
            r15.f2912b = r5
            android.os.Bundle r5 = new android.os.Bundle
            r5.<init>()
            int r14 = r27.getDepth()
            r12 = 1
            int r14 = r14 + r12
            r24 = r10
        L155:
            int r9 = r27.next()
            if (r9 == r12) goto L1ab
            int r12 = r27.getDepth()
            if (r12 >= r14) goto L163
            if (r9 == r8) goto L1ab
        L163:
            r8 = 2
            if (r9 == r8) goto L167
            goto L169
        L167:
            if (r12 <= r14) goto L16c
        L169:
            r19 = r4
            goto L1a6
        L16c:
            java.lang.String r9 = r27.getName()
            boolean r9 = r7.equals(r9)
            if (r9 == 0) goto L1a2
            int[] r9 = p104g1.C2206a.f10100b
            android.content.res.TypedArray r9 = r1.obtainAttributes(r2, r9)
            r12 = 0
            java.lang.String r8 = r9.getString(r12)
            if (r8 == 0) goto L19c
            r12 = r24
            androidx.navigation.h r12 = r0.m1602d(r9, r1, r12)
            r19 = r4
            boolean r4 = r12.f2941c
            if (r4 == 0) goto L198
            if (r4 == 0) goto L198
            androidx.navigation.t r4 = r12.f2939a
            java.lang.Object r12 = r12.f2942d
            r4.mo1606d(r5, r8, r12)
        L198:
            r9.recycle()
            goto L1a4
        L19c:
            org.xmlpull.v1.XmlPullParserException r1 = new org.xmlpull.v1.XmlPullParserException
            r1.<init>(r11)
            throw r1
        L1a2:
            r19 = r4
        L1a4:
            r24 = r10
        L1a6:
            r4 = r19
            r8 = 3
            r12 = 1
            goto L155
        L1ab:
            r19 = r4
            boolean r4 = r5.isEmpty()
            if (r4 != 0) goto L1b5
            r15.f2913c = r5
        L1b5:
            boolean r4 = r3 instanceof androidx.navigation.C0503b.a
            r5 = 1
            r4 = r4 ^ r5
            if (r4 == 0) goto L1d9
            if (r13 == 0) goto L1d1
            s.i<androidx.navigation.d> r4 = r3.f2977e0
            if (r4 != 0) goto L1c8
            s.i r4 = new s.i
            r4.<init>()
            r3.f2977e0 = r4
        L1c8:
            s.i<androidx.navigation.d> r4 = r3.f2977e0
            r4.m12351g(r13, r15)
            r6.recycle()
            goto L232
        L1d1:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Cannot have an action with actionId 0"
            r1.<init>(r2)
            throw r1
        L1d9:
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "Cannot add action "
            r2.append(r4)
            r2.append(r13)
            java.lang.String r4 = " to "
            r2.append(r4)
            r2.append(r3)
            java.lang.String r3 = " as it does not support actions, indicating that it is a terminal destination in your navigation graph and will never trigger actions."
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L1fd:
            r19 = r4
            java.lang.String r4 = "include"
            boolean r4 = r4.equals(r6)
            if (r4 == 0) goto L224
            boolean r4 = r3 instanceof androidx.navigation.C0520o
            if (r4 == 0) goto L224
            int[] r4 = androidx.navigation.C0529x.f3022c
            android.content.res.TypedArray r4 = r1.obtainAttributes(r2, r4)
            r6 = 0
            int r6 = r4.getResourceId(r6, r6)
            r7 = r3
            androidx.navigation.o r7 = (androidx.navigation.C0520o) r7
            androidx.navigation.o r6 = r0.m1601c(r6)
            r7.m1596m(r6)
            r4.recycle()
            goto L232
        L224:
            boolean r4 = r3 instanceof androidx.navigation.C0520o
            if (r4 == 0) goto L232
            r4 = r3
            androidx.navigation.o r4 = (androidx.navigation.C0520o) r4
            androidx.navigation.m r6 = r25.m1600b(r26, r27, r28, r29)
            r4.m1596m(r6)
        L232:
            r4 = r19
            goto L1f
        L236:
            return r3
    }

    @android.annotation.SuppressLint({"ResourceType"})
    /* renamed from: c */
    public androidx.navigation.C0520o m1601c(int r7) {
            r6 = this;
            android.content.Context r0 = r6.f2992a
            android.content.res.Resources r0 = r0.getResources()
            android.content.res.XmlResourceParser r1 = r0.getXml(r7)
            android.util.AttributeSet r2 = android.util.Xml.asAttributeSet(r1)
        Le:
            int r3 = r1.next()     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L53
            r4 = 2
            if (r3 == r4) goto L19
            r5 = 1
            if (r3 == r5) goto L19
            goto Le
        L19:
            if (r3 != r4) goto L49
            java.lang.String r3 = r1.getName()     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L53
            androidx.navigation.m r2 = r6.m1600b(r0, r1, r2, r7)     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L53
            boolean r4 = r2 instanceof androidx.navigation.C0520o     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L53
            if (r4 == 0) goto L2d
            androidx.navigation.o r2 = (androidx.navigation.C0520o) r2     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L53
            r1.close()
            return r2
        L2d:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L53
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L53
            r4.<init>()     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L53
            java.lang.String r5 = "Root element <"
            r4.append(r5)     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L53
            r4.append(r3)     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L53
            java.lang.String r3 = "> did not inflate into a NavGraph"
            r4.append(r3)     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L53
            java.lang.String r3 = r4.toString()     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L53
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L53
            throw r2     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L53
        L49:
            org.xmlpull.v1.XmlPullParserException r2 = new org.xmlpull.v1.XmlPullParserException     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L53
            java.lang.String r3 = "No start tag found"
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L53
            throw r2     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L53
        L51:
            r7 = move-exception
            goto L7b
        L53:
            r2 = move-exception
            java.lang.RuntimeException r3 = new java.lang.RuntimeException     // Catch: java.lang.Throwable -> L51
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L51
            r4.<init>()     // Catch: java.lang.Throwable -> L51
            java.lang.String r5 = "Exception inflating "
            r4.append(r5)     // Catch: java.lang.Throwable -> L51
            java.lang.String r7 = r0.getResourceName(r7)     // Catch: java.lang.Throwable -> L51
            r4.append(r7)     // Catch: java.lang.Throwable -> L51
            java.lang.String r7 = " line "
            r4.append(r7)     // Catch: java.lang.Throwable -> L51
            int r7 = r1.getLineNumber()     // Catch: java.lang.Throwable -> L51
            r4.append(r7)     // Catch: java.lang.Throwable -> L51
            java.lang.String r7 = r4.toString()     // Catch: java.lang.Throwable -> L51
            r3.<init>(r7, r2)     // Catch: java.lang.Throwable -> L51
            throw r3     // Catch: java.lang.Throwable -> L51
        L7b:
            r1.close()
            throw r7
    }

    /* renamed from: d */
    public final androidx.navigation.C0513h m1602d(android.content.res.TypedArray r17, android.content.res.Resources r18, int r19) {
            r16 = this;
            r0 = r17
            r1 = 3
            r2 = 0
            boolean r3 = r0.getBoolean(r1, r2)
            java.lang.ThreadLocal<android.util.TypedValue> r4 = androidx.navigation.C0523r.f2991c
            java.lang.Object r5 = r4.get()
            android.util.TypedValue r5 = (android.util.TypedValue) r5
            if (r5 != 0) goto L1a
            android.util.TypedValue r5 = new android.util.TypedValue
            r5.<init>()
            r4.set(r5)
        L1a:
            r4 = 2
            java.lang.String r4 = r0.getString(r4)
            java.lang.String r6 = "reference"
            java.lang.String r7 = "boolean"
            java.lang.String r8 = "integer"
            java.lang.String r9 = "float"
            if (r4 == 0) goto L147
            java.lang.String r10 = r18.getResourcePackageName(r19)
            androidx.navigation.t<java.lang.Integer> r11 = androidx.navigation.AbstractC0525t.f3001b
            boolean r12 = r8.equals(r4)
            if (r12 == 0) goto L37
            goto L148
        L37:
            androidx.navigation.t<int[]> r11 = androidx.navigation.AbstractC0525t.f3003d
            java.lang.String r12 = "integer[]"
            boolean r12 = r12.equals(r4)
            if (r12 == 0) goto L43
            goto L148
        L43:
            androidx.navigation.t<java.lang.Long> r11 = androidx.navigation.AbstractC0525t.f3004e
            java.lang.String r12 = "long"
            boolean r12 = r12.equals(r4)
            if (r12 == 0) goto L4f
            goto L148
        L4f:
            androidx.navigation.t<long[]> r11 = androidx.navigation.AbstractC0525t.f3005f
            java.lang.String r12 = "long[]"
            boolean r12 = r12.equals(r4)
            if (r12 == 0) goto L5b
            goto L148
        L5b:
            androidx.navigation.t<java.lang.Boolean> r11 = androidx.navigation.AbstractC0525t.f3008i
            boolean r12 = r7.equals(r4)
            if (r12 == 0) goto L65
            goto L148
        L65:
            androidx.navigation.t<boolean[]> r11 = androidx.navigation.AbstractC0525t.f3009j
            java.lang.String r12 = "boolean[]"
            boolean r12 = r12.equals(r4)
            if (r12 == 0) goto L71
            goto L148
        L71:
            androidx.navigation.t<java.lang.String> r11 = androidx.navigation.AbstractC0525t.f3010k
            java.lang.String r12 = "string"
            boolean r12 = r12.equals(r4)
            if (r12 == 0) goto L7d
            goto L148
        L7d:
            androidx.navigation.t<java.lang.String[]> r12 = androidx.navigation.AbstractC0525t.f3011l
            java.lang.String r13 = "string[]"
            boolean r13 = r13.equals(r4)
            if (r13 == 0) goto L8a
        L87:
            r11 = r12
            goto L148
        L8a:
            androidx.navigation.t<java.lang.Float> r12 = androidx.navigation.AbstractC0525t.f3006g
            boolean r13 = r9.equals(r4)
            if (r13 == 0) goto L93
            goto L87
        L93:
            androidx.navigation.t<float[]> r12 = androidx.navigation.AbstractC0525t.f3007h
            java.lang.String r13 = "float[]"
            boolean r13 = r13.equals(r4)
            if (r13 == 0) goto L9e
            goto L87
        L9e:
            androidx.navigation.t<java.lang.Integer> r12 = androidx.navigation.AbstractC0525t.f3002c
            boolean r13 = r6.equals(r4)
            if (r13 == 0) goto La7
            goto L87
        La7:
            boolean r12 = r4.isEmpty()
            if (r12 != 0) goto L148
            java.lang.String r11 = "."
            boolean r11 = r4.startsWith(r11)     // Catch: java.lang.ClassNotFoundException -> L140
            if (r11 == 0) goto Lc7
            if (r10 == 0) goto Lc7
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch: java.lang.ClassNotFoundException -> L140
            r11.<init>()     // Catch: java.lang.ClassNotFoundException -> L140
            r11.append(r10)     // Catch: java.lang.ClassNotFoundException -> L140
            r11.append(r4)     // Catch: java.lang.ClassNotFoundException -> L140
            java.lang.String r10 = r11.toString()     // Catch: java.lang.ClassNotFoundException -> L140
            goto Lc8
        Lc7:
            r10 = r4
        Lc8:
            java.lang.String r11 = "[]"
            boolean r11 = r4.endsWith(r11)     // Catch: java.lang.ClassNotFoundException -> L140
            if (r11 == 0) goto Lfa
            int r11 = r10.length()     // Catch: java.lang.ClassNotFoundException -> L140
            int r11 = r11 + (-2)
            java.lang.String r10 = r10.substring(r2, r11)     // Catch: java.lang.ClassNotFoundException -> L140
            java.lang.Class r11 = java.lang.Class.forName(r10)     // Catch: java.lang.ClassNotFoundException -> L140
            java.lang.Class<android.os.Parcelable> r12 = android.os.Parcelable.class
            boolean r12 = r12.isAssignableFrom(r11)     // Catch: java.lang.ClassNotFoundException -> L140
            if (r12 == 0) goto Lec
            androidx.navigation.t$m r10 = new androidx.navigation.t$m     // Catch: java.lang.ClassNotFoundException -> L140
            r10.<init>(r11)     // Catch: java.lang.ClassNotFoundException -> L140
            goto L10b
        Lec:
            java.lang.Class<java.io.Serializable> r12 = java.io.Serializable.class
            boolean r12 = r12.isAssignableFrom(r11)     // Catch: java.lang.ClassNotFoundException -> L140
            if (r12 == 0) goto L129
            androidx.navigation.t$o r10 = new androidx.navigation.t$o     // Catch: java.lang.ClassNotFoundException -> L140
            r10.<init>(r11)     // Catch: java.lang.ClassNotFoundException -> L140
            goto L10b
        Lfa:
            java.lang.Class r11 = java.lang.Class.forName(r10)     // Catch: java.lang.ClassNotFoundException -> L140
            java.lang.Class<android.os.Parcelable> r12 = android.os.Parcelable.class
            boolean r12 = r12.isAssignableFrom(r11)     // Catch: java.lang.ClassNotFoundException -> L140
            if (r12 == 0) goto L10d
            androidx.navigation.t$n r10 = new androidx.navigation.t$n     // Catch: java.lang.ClassNotFoundException -> L140
            r10.<init>(r11)     // Catch: java.lang.ClassNotFoundException -> L140
        L10b:
            r11 = r10
            goto L148
        L10d:
            java.lang.Class<java.lang.Enum> r12 = java.lang.Enum.class
            boolean r12 = r12.isAssignableFrom(r11)     // Catch: java.lang.ClassNotFoundException -> L140
            if (r12 == 0) goto L11b
            androidx.navigation.t$l r10 = new androidx.navigation.t$l     // Catch: java.lang.ClassNotFoundException -> L140
            r10.<init>(r11)     // Catch: java.lang.ClassNotFoundException -> L140
            goto L10b
        L11b:
            java.lang.Class<java.io.Serializable> r12 = java.io.Serializable.class
            boolean r12 = r12.isAssignableFrom(r11)     // Catch: java.lang.ClassNotFoundException -> L140
            if (r12 == 0) goto L129
            androidx.navigation.t$p r10 = new androidx.navigation.t$p     // Catch: java.lang.ClassNotFoundException -> L140
            r10.<init>(r11)     // Catch: java.lang.ClassNotFoundException -> L140
            goto L10b
        L129:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch: java.lang.ClassNotFoundException -> L140
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.ClassNotFoundException -> L140
            r1.<init>()     // Catch: java.lang.ClassNotFoundException -> L140
            r1.append(r10)     // Catch: java.lang.ClassNotFoundException -> L140
            java.lang.String r2 = " is not Serializable or Parcelable."
            r1.append(r2)     // Catch: java.lang.ClassNotFoundException -> L140
            java.lang.String r1 = r1.toString()     // Catch: java.lang.ClassNotFoundException -> L140
            r0.<init>(r1)     // Catch: java.lang.ClassNotFoundException -> L140
            throw r0     // Catch: java.lang.ClassNotFoundException -> L140
        L140:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0)
            throw r1
        L147:
            r11 = 0
        L148:
            r10 = 1
            boolean r12 = r0.getValue(r10, r5)
            if (r12 == 0) goto L26b
            androidx.navigation.t<java.lang.Integer> r12 = androidx.navigation.AbstractC0525t.f3002c
            java.lang.String r13 = "' for "
            java.lang.String r14 = "unsupported value '"
            r15 = 16
            if (r11 != r12) goto L18f
            int r0 = r5.resourceId
            if (r0 == 0) goto L15f
            goto L22d
        L15f:
            int r0 = r5.type
            if (r0 != r15) goto L16d
            int r0 = r5.data
            if (r0 != 0) goto L16d
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            goto L26c
        L16d:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r1 = android.support.v4.media.C0144c.m256a(r14)
            java.lang.CharSequence r2 = r5.string
            r1.append(r2)
            r1.append(r13)
            java.lang.String r2 = r11.mo1604b()
            r1.append(r2)
            java.lang.String r2 = ". Must be a reference to a resource."
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L18f:
            int r2 = r5.resourceId
            if (r2 == 0) goto L1c0
            if (r11 != 0) goto L19c
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            r11 = r12
            goto L26c
        L19c:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r1 = android.support.v4.media.C0144c.m256a(r14)
            java.lang.CharSequence r2 = r5.string
            r1.append(r2)
            r1.append(r13)
            java.lang.String r2 = r11.mo1604b()
            r1.append(r2)
            java.lang.String r2 = ". You must use a \""
            r1.append(r2)
            java.lang.String r2 = "\" type to reference other resources."
            java.lang.String r1 = p346u.C6269n.m12888a(r1, r6, r2)
            r0.<init>(r1)
            throw r0
        L1c0:
            androidx.navigation.t<java.lang.String> r2 = androidx.navigation.AbstractC0525t.f3010k
            if (r11 != r2) goto L1ca
            java.lang.String r0 = r0.getString(r10)
            goto L26c
        L1ca:
            int r0 = r5.type
            if (r0 == r1) goto L242
            r1 = 4
            if (r0 == r1) goto L232
            r1 = 5
            if (r0 == r1) goto L21a
            r1 = 18
            if (r0 == r1) goto L208
            if (r0 < r15) goto L1f3
            r1 = 31
            if (r0 > r1) goto L1f3
            androidx.navigation.t<java.lang.Float> r0 = androidx.navigation.AbstractC0525t.f3006g
            if (r11 != r0) goto L1ea
            androidx.navigation.t r0 = m1599a(r5, r11, r0, r4, r9)
            int r1 = r5.data
            float r1 = (float) r1
            goto L23c
        L1ea:
            androidx.navigation.t<java.lang.Integer> r0 = androidx.navigation.AbstractC0525t.f3001b
            androidx.navigation.t r0 = m1599a(r5, r11, r0, r4, r8)
            int r1 = r5.data
            goto L22b
        L1f3:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.String r1 = "unsupported argument type "
            java.lang.StringBuilder r1 = android.support.v4.media.C0144c.m256a(r1)
            int r2 = r5.type
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L208:
            androidx.navigation.t<java.lang.Boolean> r0 = androidx.navigation.AbstractC0525t.f3008i
            androidx.navigation.t r11 = m1599a(r5, r11, r0, r4, r7)
            int r0 = r5.data
            if (r0 == 0) goto L214
            r0 = 1
            goto L215
        L214:
            r0 = 0
        L215:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            goto L26c
        L21a:
            androidx.navigation.t<java.lang.Integer> r0 = androidx.navigation.AbstractC0525t.f3001b
            java.lang.String r1 = "dimension"
            androidx.navigation.t r0 = m1599a(r5, r11, r0, r4, r1)
            android.util.DisplayMetrics r1 = r18.getDisplayMetrics()
            float r1 = r5.getDimension(r1)
            int r1 = (int) r1
        L22b:
            r11 = r0
            r0 = r1
        L22d:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L26c
        L232:
            androidx.navigation.t<java.lang.Float> r0 = androidx.navigation.AbstractC0525t.f3006g
            androidx.navigation.t r0 = m1599a(r5, r11, r0, r4, r9)
            float r1 = r5.getFloat()
        L23c:
            r11 = r0
            java.lang.Float r0 = java.lang.Float.valueOf(r1)
            goto L26c
        L242:
            java.lang.CharSequence r0 = r5.string
            java.lang.String r0 = r0.toString()
            if (r11 != 0) goto L266
            androidx.navigation.t<java.lang.Integer> r1 = androidx.navigation.AbstractC0525t.f3001b     // Catch: java.lang.IllegalArgumentException -> L251
            r1.mo1605c(r0)     // Catch: java.lang.IllegalArgumentException -> L251
        L24f:
            r11 = r1
            goto L266
        L251:
            androidx.navigation.t<java.lang.Long> r1 = androidx.navigation.AbstractC0525t.f3004e     // Catch: java.lang.IllegalArgumentException -> L257
            r1.mo1605c(r0)     // Catch: java.lang.IllegalArgumentException -> L257
            goto L24f
        L257:
            androidx.navigation.t<java.lang.Float> r1 = androidx.navigation.AbstractC0525t.f3006g     // Catch: java.lang.IllegalArgumentException -> L25d
            r1.mo1605c(r0)     // Catch: java.lang.IllegalArgumentException -> L25d
            goto L24f
        L25d:
            androidx.navigation.t<java.lang.Boolean> r1 = androidx.navigation.AbstractC0525t.f3008i     // Catch: java.lang.IllegalArgumentException -> L263
            r1.mo1605c(r0)     // Catch: java.lang.IllegalArgumentException -> L263
            goto L24f
        L263:
            androidx.navigation.t<java.lang.String> r1 = androidx.navigation.AbstractC0525t.f3010k
            goto L24f
        L266:
            java.lang.Object r0 = r11.mo1605c(r0)
            goto L26c
        L26b:
            r0 = 0
        L26c:
            if (r0 == 0) goto L270
            r1 = 1
            goto L272
        L270:
            r0 = 0
            r1 = 0
        L272:
            if (r11 == 0) goto L275
            goto L276
        L275:
            r11 = 0
        L276:
            if (r11 != 0) goto L363
            boolean r2 = r0 instanceof java.lang.Integer
            if (r2 == 0) goto L281
            androidx.navigation.t<java.lang.Integer> r2 = androidx.navigation.AbstractC0525t.f3001b
        L27e:
            r11 = r2
            goto L363
        L281:
            boolean r2 = r0 instanceof int[]
            if (r2 == 0) goto L288
            androidx.navigation.t<int[]> r2 = androidx.navigation.AbstractC0525t.f3003d
            goto L27e
        L288:
            boolean r2 = r0 instanceof java.lang.Long
            if (r2 == 0) goto L28f
            androidx.navigation.t<java.lang.Long> r2 = androidx.navigation.AbstractC0525t.f3004e
            goto L27e
        L28f:
            boolean r2 = r0 instanceof long[]
            if (r2 == 0) goto L296
            androidx.navigation.t<long[]> r2 = androidx.navigation.AbstractC0525t.f3005f
            goto L27e
        L296:
            boolean r2 = r0 instanceof java.lang.Float
            if (r2 == 0) goto L29d
            androidx.navigation.t<java.lang.Float> r2 = androidx.navigation.AbstractC0525t.f3006g
            goto L27e
        L29d:
            boolean r2 = r0 instanceof float[]
            if (r2 == 0) goto L2a4
            androidx.navigation.t<float[]> r2 = androidx.navigation.AbstractC0525t.f3007h
            goto L27e
        L2a4:
            boolean r2 = r0 instanceof java.lang.Boolean
            if (r2 == 0) goto L2ab
            androidx.navigation.t<java.lang.Boolean> r2 = androidx.navigation.AbstractC0525t.f3008i
            goto L27e
        L2ab:
            boolean r2 = r0 instanceof boolean[]
            if (r2 == 0) goto L2b2
            androidx.navigation.t<boolean[]> r2 = androidx.navigation.AbstractC0525t.f3009j
            goto L27e
        L2b2:
            boolean r2 = r0 instanceof java.lang.String
            if (r2 != 0) goto L35f
            if (r0 != 0) goto L2ba
            goto L35f
        L2ba:
            boolean r2 = r0 instanceof java.lang.String[]
            if (r2 == 0) goto L2c1
            androidx.navigation.t<java.lang.String[]> r2 = androidx.navigation.AbstractC0525t.f3011l
            goto L27e
        L2c1:
            java.lang.Class r2 = r0.getClass()
            boolean r2 = r2.isArray()
            if (r2 == 0) goto L2e9
            java.lang.Class<android.os.Parcelable> r2 = android.os.Parcelable.class
            java.lang.Class r4 = r0.getClass()
            java.lang.Class r4 = r4.getComponentType()
            boolean r2 = r2.isAssignableFrom(r4)
            if (r2 == 0) goto L2e9
            androidx.navigation.t$m r2 = new androidx.navigation.t$m
            java.lang.Class r4 = r0.getClass()
            java.lang.Class r4 = r4.getComponentType()
            r2.<init>(r4)
            goto L27e
        L2e9:
            java.lang.Class r2 = r0.getClass()
            boolean r2 = r2.isArray()
            if (r2 == 0) goto L312
            java.lang.Class<java.io.Serializable> r2 = java.io.Serializable.class
            java.lang.Class r4 = r0.getClass()
            java.lang.Class r4 = r4.getComponentType()
            boolean r2 = r2.isAssignableFrom(r4)
            if (r2 == 0) goto L312
            androidx.navigation.t$o r2 = new androidx.navigation.t$o
            java.lang.Class r4 = r0.getClass()
            java.lang.Class r4 = r4.getComponentType()
            r2.<init>(r4)
            goto L27e
        L312:
            boolean r2 = r0 instanceof android.os.Parcelable
            if (r2 == 0) goto L321
            androidx.navigation.t$n r2 = new androidx.navigation.t$n
            java.lang.Class r4 = r0.getClass()
            r2.<init>(r4)
            goto L27e
        L321:
            boolean r2 = r0 instanceof java.lang.Enum
            if (r2 == 0) goto L330
            androidx.navigation.t$l r2 = new androidx.navigation.t$l
            java.lang.Class r4 = r0.getClass()
            r2.<init>(r4)
            goto L27e
        L330:
            boolean r2 = r0 instanceof java.io.Serializable
            if (r2 == 0) goto L33f
            androidx.navigation.t$p r2 = new androidx.navigation.t$p
            java.lang.Class r4 = r0.getClass()
            r2.<init>(r4)
            goto L27e
        L33f:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Object of type "
            java.lang.StringBuilder r2 = android.support.v4.media.C0144c.m256a(r2)
            java.lang.Class r0 = r0.getClass()
            java.lang.String r0 = r0.getName()
            r2.append(r0)
            java.lang.String r0 = " is not supported for navigation arguments."
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        L35f:
            androidx.navigation.t<java.lang.String> r2 = androidx.navigation.AbstractC0525t.f3010k
            goto L27e
        L363:
            androidx.navigation.h r2 = new androidx.navigation.h
            r2.<init>(r11, r3, r0, r1)
            return r2
    }
}
