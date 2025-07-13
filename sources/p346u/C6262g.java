package p346u;

/* renamed from: u.g */
/* loaded from: classes.dex */
public class C6262g {

    /* renamed from: b */
    public static java.util.HashMap<java.lang.String, java.lang.reflect.Constructor<? extends p346u.AbstractC6258c>> f24302b;

    /* renamed from: a */
    public java.util.HashMap<java.lang.Integer, java.util.ArrayList<p346u.AbstractC6258c>> f24303a;

    static {
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            p346u.C6262g.f24302b = r0
            java.lang.String r1 = "KeyAttribute"
            java.lang.Class<u.d> r2 = p346u.C6259d.class
            r3 = 0
            java.lang.Class[] r4 = new java.lang.Class[r3]     // Catch: java.lang.NoSuchMethodException -> L52
            java.lang.reflect.Constructor r2 = r2.getConstructor(r4)     // Catch: java.lang.NoSuchMethodException -> L52
            r0.put(r1, r2)     // Catch: java.lang.NoSuchMethodException -> L52
            java.util.HashMap<java.lang.String, java.lang.reflect.Constructor<? extends u.c>> r0 = p346u.C6262g.f24302b     // Catch: java.lang.NoSuchMethodException -> L52
            java.lang.String r1 = "KeyPosition"
            java.lang.Class<u.h> r2 = p346u.C6263h.class
            java.lang.Class[] r4 = new java.lang.Class[r3]     // Catch: java.lang.NoSuchMethodException -> L52
            java.lang.reflect.Constructor r2 = r2.getConstructor(r4)     // Catch: java.lang.NoSuchMethodException -> L52
            r0.put(r1, r2)     // Catch: java.lang.NoSuchMethodException -> L52
            java.util.HashMap<java.lang.String, java.lang.reflect.Constructor<? extends u.c>> r0 = p346u.C6262g.f24302b     // Catch: java.lang.NoSuchMethodException -> L52
            java.lang.String r1 = "KeyCycle"
            java.lang.Class<u.e> r2 = p346u.C6260e.class
            java.lang.Class[] r4 = new java.lang.Class[r3]     // Catch: java.lang.NoSuchMethodException -> L52
            java.lang.reflect.Constructor r2 = r2.getConstructor(r4)     // Catch: java.lang.NoSuchMethodException -> L52
            r0.put(r1, r2)     // Catch: java.lang.NoSuchMethodException -> L52
            java.util.HashMap<java.lang.String, java.lang.reflect.Constructor<? extends u.c>> r0 = p346u.C6262g.f24302b     // Catch: java.lang.NoSuchMethodException -> L52
            java.lang.String r1 = "KeyTimeCycle"
            java.lang.Class<u.j> r2 = p346u.C6265j.class
            java.lang.Class[] r4 = new java.lang.Class[r3]     // Catch: java.lang.NoSuchMethodException -> L52
            java.lang.reflect.Constructor r2 = r2.getConstructor(r4)     // Catch: java.lang.NoSuchMethodException -> L52
            r0.put(r1, r2)     // Catch: java.lang.NoSuchMethodException -> L52
            java.util.HashMap<java.lang.String, java.lang.reflect.Constructor<? extends u.c>> r0 = p346u.C6262g.f24302b     // Catch: java.lang.NoSuchMethodException -> L52
            java.lang.String r1 = "KeyTrigger"
            java.lang.Class<u.k> r2 = p346u.C6266k.class
            java.lang.Class[] r3 = new java.lang.Class[r3]     // Catch: java.lang.NoSuchMethodException -> L52
            java.lang.reflect.Constructor r2 = r2.getConstructor(r3)     // Catch: java.lang.NoSuchMethodException -> L52
            r0.put(r1, r2)     // Catch: java.lang.NoSuchMethodException -> L52
            goto L5a
        L52:
            r0 = move-exception
            java.lang.String r1 = "KeyFrames"
            java.lang.String r2 = "unable to load"
            android.util.Log.e(r1, r2, r0)
        L5a:
            return
    }

    public C6262g(android.content.Context r6, org.xmlpull.v1.XmlPullParser r7) {
            r5 = this;
            r5.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r5.f24303a = r0
            int r0 = r7.getEventType()     // Catch: java.io.IOException -> L73 org.xmlpull.v1.XmlPullParserException -> L78
            r1 = 0
        Lf:
            r2 = 1
            if (r0 == r2) goto L7c
            r2 = 2
            if (r0 == r2) goto L26
            r2 = 3
            if (r0 == r2) goto L19
            goto L6e
        L19:
            java.lang.String r0 = "KeyFrameSet"
            java.lang.String r2 = r7.getName()     // Catch: java.io.IOException -> L73 org.xmlpull.v1.XmlPullParserException -> L78
            boolean r0 = r0.equals(r2)     // Catch: java.io.IOException -> L73 org.xmlpull.v1.XmlPullParserException -> L78
            if (r0 == 0) goto L6e
            return
        L26:
            java.lang.String r0 = r7.getName()     // Catch: java.io.IOException -> L73 org.xmlpull.v1.XmlPullParserException -> L78
            java.util.HashMap<java.lang.String, java.lang.reflect.Constructor<? extends u.c>> r2 = p346u.C6262g.f24302b     // Catch: java.io.IOException -> L73 org.xmlpull.v1.XmlPullParserException -> L78
            boolean r2 = r2.containsKey(r0)     // Catch: java.io.IOException -> L73 org.xmlpull.v1.XmlPullParserException -> L78
            if (r2 == 0) goto L5d
            java.util.HashMap<java.lang.String, java.lang.reflect.Constructor<? extends u.c>> r2 = p346u.C6262g.f24302b     // Catch: java.lang.Exception -> L50
            java.lang.Object r0 = r2.get(r0)     // Catch: java.lang.Exception -> L50
            java.lang.reflect.Constructor r0 = (java.lang.reflect.Constructor) r0     // Catch: java.lang.Exception -> L50
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Exception -> L50
            java.lang.Object r0 = r0.newInstance(r2)     // Catch: java.lang.Exception -> L50
            u.c r0 = (p346u.AbstractC6258c) r0     // Catch: java.lang.Exception -> L50
            android.util.AttributeSet r1 = android.util.Xml.asAttributeSet(r7)     // Catch: java.lang.Exception -> L4e
            r0.mo12876c(r6, r1)     // Catch: java.lang.Exception -> L4e
            r5.m12882b(r0)     // Catch: java.lang.Exception -> L4e
            goto L5b
        L4e:
            r1 = move-exception
            goto L54
        L50:
            r0 = move-exception
            r4 = r1
            r1 = r0
            r0 = r4
        L54:
            java.lang.String r2 = "KeyFrames"
            java.lang.String r3 = "unable to create "
            android.util.Log.e(r2, r3, r1)     // Catch: java.io.IOException -> L73 org.xmlpull.v1.XmlPullParserException -> L78
        L5b:
            r1 = r0
            goto L6e
        L5d:
            java.lang.String r2 = "CustomAttribute"
            boolean r0 = r0.equalsIgnoreCase(r2)     // Catch: java.io.IOException -> L73 org.xmlpull.v1.XmlPullParserException -> L78
            if (r0 == 0) goto L6e
            if (r1 == 0) goto L6e
            java.util.HashMap<java.lang.String, y.a> r0 = r1.f24248d     // Catch: java.io.IOException -> L73 org.xmlpull.v1.XmlPullParserException -> L78
            if (r0 == 0) goto L6e
            p422y.C7091a.m14199e(r6, r7, r0)     // Catch: java.io.IOException -> L73 org.xmlpull.v1.XmlPullParserException -> L78
        L6e:
            int r0 = r7.next()     // Catch: java.io.IOException -> L73 org.xmlpull.v1.XmlPullParserException -> L78
            goto Lf
        L73:
            r6 = move-exception
            r6.printStackTrace()
            goto L7c
        L78:
            r6 = move-exception
            r6.printStackTrace()
        L7c:
            return
    }

    /* renamed from: a */
    public void m12881a(p346u.C6270o r5) {
            r4 = this;
            java.util.HashMap<java.lang.Integer, java.util.ArrayList<u.c>> r0 = r4.f24303a
            int r1 = r5.f24369b
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object r0 = r0.get(r1)
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            if (r0 == 0) goto L15
            java.util.ArrayList<u.c> r1 = r5.f24388u
            r1.addAll(r0)
        L15:
            java.util.HashMap<java.lang.Integer, java.util.ArrayList<u.c>> r0 = r4.f24303a
            r1 = -1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object r0 = r0.get(r1)
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            if (r0 == 0) goto L53
            java.util.Iterator r0 = r0.iterator()
        L28:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L53
            java.lang.Object r1 = r0.next()
            u.c r1 = (p346u.AbstractC6258c) r1
            android.view.View r2 = r5.f24368a
            android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()
            androidx.constraintlayout.widget.ConstraintLayout$a r2 = (androidx.constraintlayout.widget.ConstraintLayout.C0330a) r2
            java.lang.String r2 = r2.f1725U
            java.lang.String r3 = r1.f24247c
            if (r3 == 0) goto L4a
            if (r2 != 0) goto L45
            goto L4a
        L45:
            boolean r2 = r2.matches(r3)
            goto L4b
        L4a:
            r2 = 0
        L4b:
            if (r2 == 0) goto L28
            java.util.ArrayList<u.c> r2 = r5.f24388u
            r2.add(r1)
            goto L28
        L53:
            return
    }

    /* renamed from: b */
    public final void m12882b(p346u.AbstractC6258c r4) {
            r3 = this;
            java.util.HashMap<java.lang.Integer, java.util.ArrayList<u.c>> r0 = r3.f24303a
            int r1 = r4.f24246b
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            boolean r0 = r0.containsKey(r1)
            if (r0 != 0) goto L1e
            java.util.HashMap<java.lang.Integer, java.util.ArrayList<u.c>> r0 = r3.f24303a
            int r1 = r4.f24246b
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r0.put(r1, r2)
        L1e:
            java.util.HashMap<java.lang.Integer, java.util.ArrayList<u.c>> r0 = r3.f24303a
            int r1 = r4.f24246b
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object r0 = r0.get(r1)
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            r0.add(r4)
            return
    }
}
