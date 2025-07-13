package p177k;

/* renamed from: k.h */
/* loaded from: classes.dex */
public class WindowCallbackC3624h implements android.view.Window.Callback {

    /* renamed from: Y */
    public final android.view.Window.Callback f16003Y;

    public WindowCallbackC3624h(android.view.Window.Callback r2) {
            r1 = this;
            r1.<init>()
            if (r2 == 0) goto L8
            r1.f16003Y = r2
            return
        L8:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Window callback may not be null"
            r2.<init>(r0)
            throw r2
    }

    @Override // android.view.Window.Callback
    public boolean dispatchGenericMotionEvent(android.view.MotionEvent r2) {
            r1 = this;
            android.view.Window$Callback r0 = r1.f16003Y
            boolean r2 = r0.dispatchGenericMotionEvent(r2)
            return r2
    }

    @Override // android.view.Window.Callback
    public boolean dispatchPopulateAccessibilityEvent(android.view.accessibility.AccessibilityEvent r2) {
            r1 = this;
            android.view.Window$Callback r0 = r1.f16003Y
            boolean r2 = r0.dispatchPopulateAccessibilityEvent(r2)
            return r2
    }

    @Override // android.view.Window.Callback
    public boolean dispatchTouchEvent(android.view.MotionEvent r2) {
            r1 = this;
            android.view.Window$Callback r0 = r1.f16003Y
            boolean r2 = r0.dispatchTouchEvent(r2)
            return r2
    }

    @Override // android.view.Window.Callback
    public boolean dispatchTrackballEvent(android.view.MotionEvent r2) {
            r1 = this;
            android.view.Window$Callback r0 = r1.f16003Y
            boolean r2 = r0.dispatchTrackballEvent(r2)
            return r2
    }

    @Override // android.view.Window.Callback
    public void onActionModeFinished(android.view.ActionMode r2) {
            r1 = this;
            android.view.Window$Callback r0 = r1.f16003Y
            r0.onActionModeFinished(r2)
            return
    }

    @Override // android.view.Window.Callback
    public void onActionModeStarted(android.view.ActionMode r2) {
            r1 = this;
            android.view.Window$Callback r0 = r1.f16003Y
            r0.onActionModeStarted(r2)
            return
    }

    @Override // android.view.Window.Callback
    public void onAttachedToWindow() {
            r1 = this;
            android.view.Window$Callback r0 = r1.f16003Y
            r0.onAttachedToWindow()
            return
    }

    @Override // android.view.Window.Callback
    public android.view.View onCreatePanelView(int r2) {
            r1 = this;
            android.view.Window$Callback r0 = r1.f16003Y
            android.view.View r2 = r0.onCreatePanelView(r2)
            return r2
    }

    @Override // android.view.Window.Callback
    public void onDetachedFromWindow() {
            r1 = this;
            android.view.Window$Callback r0 = r1.f16003Y
            r0.onDetachedFromWindow()
            return
    }

    @Override // android.view.Window.Callback
    public boolean onMenuItemSelected(int r2, android.view.MenuItem r3) {
            r1 = this;
            android.view.Window$Callback r0 = r1.f16003Y
            boolean r2 = r0.onMenuItemSelected(r2, r3)
            return r2
    }

    @Override // android.view.Window.Callback
    public void onPointerCaptureChanged(boolean r2) {
            r1 = this;
            android.view.Window$Callback r0 = r1.f16003Y
            r0.onPointerCaptureChanged(r2)
            return
    }

    @Override // android.view.Window.Callback
    public boolean onSearchRequested() {
            r1 = this;
            android.view.Window$Callback r0 = r1.f16003Y
            boolean r0 = r0.onSearchRequested()
            return r0
    }

    @Override // android.view.Window.Callback
    public boolean onSearchRequested(android.view.SearchEvent r2) {
            r1 = this;
            android.view.Window$Callback r0 = r1.f16003Y
            boolean r2 = r0.onSearchRequested(r2)
            return r2
    }

    @Override // android.view.Window.Callback
    public void onWindowAttributesChanged(android.view.WindowManager.LayoutParams r2) {
            r1 = this;
            android.view.Window$Callback r0 = r1.f16003Y
            r0.onWindowAttributesChanged(r2)
            return
    }

    @Override // android.view.Window.Callback
    public void onWindowFocusChanged(boolean r2) {
            r1 = this;
            android.view.Window$Callback r0 = r1.f16003Y
            r0.onWindowFocusChanged(r2)
            return
    }
}
